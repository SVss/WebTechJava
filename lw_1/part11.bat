:Create JAR-file with Task9 and run it
@echo off

SET JAR_FILE_NAME=Task9

call compile_Task9

cd %BIN_DIR%
jar cfe %JAR_FILE_NAME%.jar %PART9_PACKAGE%.Task9 %PART9%/*.class %PART9%/classes/*.class
java -jar %JAR_FILE_NAME%.jar
pause