#include <windows.h>
// I used windows.h (Beep function) to create the sound because the sound() function in the dos.h header didn't seem to work for me.
#include <stdlib.h>
#include <stdio.h>


int main()
{
	printf("WARNING THIS PROGRAM CAN GENERATE REALLY LOUD NOISES. ARE YOU SURE YOU WANT TO CONTINUE? (y/n)\n");

	char inp;

	scanf("%c", &inp);

	// This thing scans for specific user input (the %c thing is just for characters) and assigns it to the variable "inp"

	if(inp == 'y'){
		int fre;
		int dur;

		printf("Now, type in the Hz of the noise you want to hear.\n");
		scanf("%d", &fre);
		// this thing does the same thing (scans for user input and assigns it to another variable) but this time it uses %d which is used for integer inputs
		printf("Ok now type in the duration (in milliseconds) of the noise you want to hear.\n");
		scanf("%d", &dur);

		Beep(fre,dur);
	}
	else if(inp == 'n'){
		printf("Ok bye bye.");
	}
	else{
		printf("What?");
	}
	
	
	// 
	return 0;
}