@echo off
SET PART9_PATH=./src/com/svss/webtech/lw_1/part9
if exist bin rd /q /s bin
mkdir bin
javac -d bin %PART9_PATH%/Task9.java %PART9_PATH%/classes/*
java -cp ./bin com.svss.webtech.lw_1.part9.Task9
pause