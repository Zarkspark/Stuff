#include<stdio.h>

#include<dos.h>

void system();

int main (void){

    int x = 1;

    while(x==1){
        system("notepad.exe");
    }

    return 0;

}