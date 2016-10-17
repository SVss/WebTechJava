:Compile and run Task 9 from console
@echo off

call compile_Task9

java -cp ./%BIN_DIR% %PART9_PACKAGE%.Task9
pause