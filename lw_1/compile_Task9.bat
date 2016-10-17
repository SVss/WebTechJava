:Compile Task 9
@echo off

SET BIN_DIR=bin

if exist bin rd /q /s bin
mkdir bin

SET PART9=com/svss/webtech/lw_1/part9

SET PART9_PACKAGE=%PART9:/=.%
SET PART9_SRC_PATH=./src/%PART9%
SET PART9_BIN_PATH=./%BIN_DIR%/%PART9%

javac -d %BIN_DIR% %PART9_SRC_PATH%/Task9.java %PART9_SRC_PATH%/classes/*