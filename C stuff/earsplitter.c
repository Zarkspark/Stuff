#include <windows.h>
#include <stdlib.h>
#include <stdio.h>
int fre;
int dur;

int main()
{
	printf("WARNING THIS PROGRAM CAN GENERATE REALLY LOUD NOISES. ARE YOU SURE YOU WANT TO CONTINUE? (y/n)\n");

	char inp;

	scanf("%c", &inp);
	switch(inp){
		case 'y':
			printf("Now, type in the Hz of the noise you want to hear.\n");
			scanf("%d", &fre);
			printf("Ok now type in the duration (in milliseconds) of the noise you want to hear.\n");
			scanf("%d", &dur);

			Beep(fre,dur);
			break;
		case 'n':
			printf("Ok bye bye.");
			break;
		default:
			printf("What?");
			break;
	}
	return 0;
}