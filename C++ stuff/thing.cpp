#include <iostream>
#include <windows.h>
using namespace std;

int main(){
    string user;
    string fel;
    cout << "Hello what is your name and that?\n";
    // cout is the way to print stuff in c++
    cin >> user;
    // and cin is the way to allow the user to input stuff into a variable
    cout << "Hello " << user << " how are you?\n";
    // When you are printing the variable user, you have to use the operators "<<" instead of "+"
    cin >> fel;
    cout << "Lol you really think I care if you feel " << fel << "?\n";
    Sleep(3000);
    // This just delays the code for a certain number of milliseconds
    cout << "Only joking, glad you're feeling " << fel << "!\n";
}