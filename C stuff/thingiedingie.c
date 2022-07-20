#include <stdio.h>
int main(){
    printf("Type in your username\n");
    char username[10];
    scanf("%s", username);
    printf("Username = %s" , username);
    return 0;
}