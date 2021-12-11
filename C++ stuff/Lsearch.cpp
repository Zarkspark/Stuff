#include <iostream>
using namespace std;
int main(){
    int g;
    int a;
    int numnum;
    cout << "Input the amount of numbers in the array.\n";
    cin >> numnum;
    int array[100];
    for(int i = 0; i < numnum; i++){
        cout << "Input a number.\n";
        cin >> a;
        array[i] = a;
    }
    cout << "What number are you looking for?\n";
    cin >> g;
    for(auto c : array){
        if(c == g){
            cout << g << " has been found in the index: " << c;
        }
        else{
        }
    }
    return 0;
}