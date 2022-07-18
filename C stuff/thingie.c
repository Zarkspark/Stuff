#include<stdio.h>
#include<stdlib.h>
#include<string.h>
int main()
{
    char name[10];
    printf("Type in your name.\n");
    scanf("%s", name);

    if(strncmp(name, "Apollo", 7) != 0 && strncmp(name, "Prisha", 7) != 0){
        printf("hello %s\n", name);
    }
    else if(strncmp(name, "Apollo", 7) == 0){
        printf("Hellooooo Apollooooooo");
    }
    else{
        printf("Hello frien its nice to meet you again! :D ");
    }
    return 0;
}