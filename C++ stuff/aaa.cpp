#include <iostream>
#include <windows.h>
using namespace std;

int main(){
    int x = -1;
    try{
        cout << "Inside Try.\n";
        if(x<0){
            throw x;
            cout << "You will never see this.\n";
        }

    }
    catch (int x){
        cout << "Exception caught.\n";
    }
    cout << "After execution.\n";
}