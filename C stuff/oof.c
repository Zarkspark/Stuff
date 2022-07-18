#include<stdio.h>
int option;
int main(void){
    const int len;
    printf("\nEnter the order you want to sort the array in. 1 for ascending, 2 for descending.\n");
    scanf("%d",&option);
    printf("Enter the length of the array.\n");
    scanf("%d",&len);
    getchar();
    // This allows the user to set the amount of elements in the array
    int sorted = 0;
    int arraything[len];
    for(int i =0;i<len;++i){
        printf("Enter a number: \n");
        scanf("%d",&arraything[i]);
        // The & symbol allows the user input to be placed in the ith index of the array.
    }
    getchar();
    switch(option){
        case 1:
            while(sorted == 0){
                sorted = 1;
                for(int h=0;h<len-1;++h){
                    int a = arraything[h];
                    int b = arraything[h+1];
                    if(b<a){
                        arraything[h] = b;
                        arraything[h+1] = a;
                        sorted = 0;
                    }
                }
            }
            break;
        case 2:
            while(sorted == 0){
                sorted = 1;
                for(int h=0;h<len-1;++h){
                    int a = arraything[h];
                    int b = arraything[h+1];
                    if(b>a){
                        arraything[h] = b;
                        arraything[h+1] = a;
                        sorted = 0;
                    }
                }
            }
            break;
        default:
            printf("Hello");
            
    }
    for(int i=0;i<len;++i){
        printf("|%d|",arraything[i]);
        // This prints the sorted array with "|" symbols wrapped around each element
    }
    return 0;
}