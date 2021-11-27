#include <iostream>
#include <conio.h>
#include <math.h>
#include <stdlib.h>

using namespace std;

float expo(){
	float fn;
	float sn;
	float res;
	cout << "Type in a number.\n";
	cin >> fn;
	cout << "Type in another number.\n";
	cin >> sn;
	res = pow(fn,sn);
	cout << "The answer is " << res << " " << flush;
	system("PAUSE");
	system("CLS");
	return res;
}
void sincostan(){
	char func;
	float num;
	float res;
	cout << "Type in s, c or t.\n";
	cin >> func;
	switch(func){
		case 's':
			cout << "Type in a number.\n";
			cin >> num;
			res = sin(num);
			cout << "The result is " << res << " " << flush;
			system("PAUSE");
			system("CLS");
			break;
		case 'c':
			cout << "Type in a number.\n";
			cin >> num;
			res = cos(num);
			cout << "The result is " << res << " " << flush;
			system("PAUSE");
			system("CLS");
			break;
		case 't':
			cout << "Type in a number.\n";
			cin >> num;
			res = tan(num);
			cout << "The result is " << res << " " << flush;
			system("PAUSE");
			system("CLS");
			break;
	}
}
float subtraction(){
	float fn;
	float sn;
	cout << "Type in a number.\n";
	cin >> fn;
	cout << "Now type in another number.\n";
	cin >> sn;
	float res = fn - sn;
	cout << "The result is " << res << " " << flush;
	system("PAUSE");
	system("CLS");
	return res;
}
float division(){
	float fn;
	float sn;
	cout << "Type in a number.\n";
	cin >> fn;
	cout << "Type in another number.\n";
	cin >> sn;
	float res = fn / sn;
	cout << "The result is " << res << " " << flush;
	system("PAUSE");
	system("CLS");
	return res;
}
float multiplication(){
	float fn;
	float sn;
	cout << "Type in a number.\n";
	cin >> fn;
	cout << "Type in another number.\n";
	cin >> sn;
	float res = fn * sn;
	cout << "The result is " << res << " " << flush;
	system("PAUSE");
	system("CLS");
	return res;
}
float addition(){
	float fn;
	float sn;
	cout << "Type in a number.\n";
	cin >> fn;
	cout << "Type in another number.\n";
	cin >> sn;
	float res = fn + sn;
	cout << "The result is " << res << " " << flush;
	system("PAUSE");
	system("CLS");
	return res;
}
void menu(){
	char mop;
	char bop;
	cout << "This program is a calculator.\n";
	cout << "Type in a mode to continue (b for basic) (s for scientific)\n";
	cin >> mop;
	if(mop == 'b'){
		cout << "(a) for addition. (s) for subtraction. (d) for division. (m) for multiplication.(e) for exponentials.\n";
		cin >> bop;
		switch(bop){
			case 'a':
				addition();
				break;
			case 's':
				subtraction();
				break;
			case 'd':
				division();
				break;
			case 'm':
				multiplication();
				break;
			case 'e':
				expo();
				break;
		}
	}
	else{
	sincostan();
	}
}
int main(){
	menu();
	return 0;
}