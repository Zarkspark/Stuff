#include <stdio.h>
int main(){
    int found = 0;
    int find;
    int num;
    int arr[10];
    for(int i=0;i<sizeof(arr);i++){
        printf("Type in a number.\n");
        scanf("%d",&num);
        arr[i] = num;
    }
    printf("What number do you want to find in the list?.\n");
    scanf("%d",&find);
    for (int i = 0; i < sizeof(arr); i++)
    {
        if(find == arr[i]){
            int temp = arr[i];
            found = 1;
            printf("Number %d is found at the index %d.",temp,i);
        }
        else{
            printf("The number %d is not found in the list.",find);
            break;
        }
    }
    
}