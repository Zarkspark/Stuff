#include <stdio.h>
void main(){
typedef struct {
    char * brand;
    int model;
    int age;
} vehicle;

vehicle mycar;
mycar.brand = "Ford Focus";
mycar.model = 2007;
mycar.age = 5;

printf("my car is a %s %d model. It is %d years old.", mycar.brand, mycar.model, mycar.age);
}