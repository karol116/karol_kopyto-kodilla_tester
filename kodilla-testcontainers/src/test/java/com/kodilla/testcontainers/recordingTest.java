package com.kodilla.testcontainers;

import org.apache.log4j.BasicConfigurator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testcontainers.containers.BrowserWebDriverContainer;
import org.testcontainers.containers.DefaultRecordingFileFactory;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.containers.Network;
import org.testcontainers.images.builder.ImageFromDockerfile;
import org.testcontainers.shaded.org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

import static org.testcontainers.containers.BrowserWebDriverContainer.VncRecordingMode.RECORD_ALL;

public class recordingTest {
    public BrowserWebDriverContainer chrome;
    public GenericContainer webServer;

    @Before
    public void setUp(){
        BasicConfigurator.configure();
        Network network = Network.newNetwork();
        webServer =
                new GenericContainer(
                        new ImageFromDockerfile()
                                .withFileFromClasspath("/tmp/index.html", "index.html")
                                .withDockerfileFromBuilder(builder ->
                                        builder
                                                .from("httpd:2.4")
                                                .copy("/tmp/index.html", "/usr/local/apache2/htdocs")
                                                .build()))
                        .withNetwork(network)
                        .withNetworkAliases("my-server")
                        .withExposedPorts(80);
        webServer.start();
        chrome =
                new BrowserWebDriverContainer()
                        .withCapabilities(new ChromeOptions())
                        .withRecordingMode(RECORD_ALL, new File("./build/"))
                        .withRecordingFileFactory(new DefaultRecordingFileFactory());
        chrome.start();
    }

    @Test
    public void recordingPageTest() throws IOException {
        RemoteWebDriver driver = chrome.getWebDriver();
        driver.get("http://my-server/");

        File record = driver.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(record, new File("./build/" + record.getName()));
    }

    @After
    public void tearDown(){
        chrome.stop();
        webServer.stop();
    }

}
