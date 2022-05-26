package com.kodilla.execution_model;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTestSuite {
    Invoice invoice;

    @BeforeEach
    public void setUp() {
        invoice = new Invoice();
        invoice.addItem(new Item("f/14/09/1", 1200));
        invoice.addItem(new Item("f/16/09/1", 5400));
        invoice.addItem(new Item("f/17/09/2", 1400));
        invoice.addItem(new Item("f/21/09/1", 12000));
    }
    @AfterEach
    public void resetValues() {
        System.out.println("Resetting values...");
    }

    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing");
    }

    @AfterAll
    public static void displayGoodByeMessage() {
        System.out.println("Finishing testing");
    }

    @Test
    public void isSizeOfItemsIncreasedAfterAddedNewOrders() {
        assertEquals(4, invoice.getSize());
    }

    @Test
    public void isDataOfAddedInvoiceCorrect() {
        assertEquals("f/17/09/2", invoice.getItem(2).getName());
        assertEquals(1400, invoice.getItem(2).getPrice(),0.01);
    }

    @Test
    public void shouldReturnNullAfterGettingNegativeIndexValue() {
        assertNull(invoice.getItem(-2));
    }

    @Test
    public void shouldReturnNullAfterGetingValueLargerThanIndexValue() {
        System.out.println("Maximum index value: " + (invoice.getSize() - 1));
        assertNull(invoice.getItem(10));
    }

    @Test
    public void isSizeOfListEqualToZeroAfterClearingList() {
        invoice.clear();
        assertEquals(0, invoice.getSize());
    }
}