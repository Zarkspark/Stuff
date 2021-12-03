#include <iostream>
#include <stdlib.h>
#include <array>
using namespace std;
int menu(){
    bool sorted = false;
    int n;
    array<int, 10> array;

    for(int i=0;i<10;i++){
        // Asks the user to input the numbers inside the array
        cout << "Type in a number.\n";
        cin >> n;
        array[i] = n;
        // assigns the value 'n' (User input) to the index i which increments in the for loop. This will basically put user inputted numbers in the array.
    }
    
    while(sorted == false){
        sorted = true;
        for(int h=0;h<9;h++){
            int a = array[h];
            int b = array[h+1];
            if(b<a){
                array[h] = b;
                array[h+1] = a;
                sorted = false;
            }

        }
    }

    for(auto i : array){
        // Prints the array.
        cout << "|" <<  i << "| ";
    }

    return 0;
}
int main(){
    menu();
    return 0;
}