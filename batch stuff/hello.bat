@ECHO off
:: @Echo off is used to hide the actual commands being run in the command line.

SET my_variable=Hello world
:: This is how you declare a variable in batch.

echo %my_variable%
:: This just prints the variable. Notice the percentage signs, these are used to signify the variable and not the string: "my_variable".