#include <iostream>
#include <windows.h>
using namespace std;

int main(){
    string user;
    string fel;
    cout << "Hello what is your name and that?\n";
    cin >> user;
    cout << "Hello " << user << " how are you?\n";
    cin >> fel;
    cout << "Lol you really think I care if you feel " << fel << "?\n";
    Sleep(3000);
    cout << "Only joking, glad you're feeling " << fel << "!\n";

}