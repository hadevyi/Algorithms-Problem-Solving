#include <iostream>
using namespace std;

int main() {
	double num1, num2, div;

	cin >> num1 >> num2;
	cout << fixed;
	cout.precision(9);
	div = num1 / num2;
	cout << div << endl;
}