#include <iostream>
using namespace std;

int main() {
	int num1, num2, result = 0;
	int num2_1, num2_2, num2_3;

	cin >> num1;
	cin >> num2;

	num2_1 = num1 * ((num2 % 100) % 10);
	num2_2 = num1 * ((num2 % 100) / 10);
	num2_3 = num1 * (num2 / 100);
	result = num2_1 + num2_2 * 10 + num2_3 * 100;

	cout << num2_1 << endl;
	cout << num2_2 << endl;
	cout << num2_3 << endl;
	cout << result << endl;
}