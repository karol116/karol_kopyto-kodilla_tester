@echo off
build/libs /del *.jar
call gradlew build
IF EXISTS build/libs/*.jar  (copy build/libs/*.jar project) ELSE echo File does not exists
