#include <stdio.h>
#include <stdlib.h>
#include <time.h>
int main(){
    srand(time(NULL));
    int num = rand();
    printf("%d",num);
    return 0;
}