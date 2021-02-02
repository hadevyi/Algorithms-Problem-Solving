#include <iostream>
using namespace std;

int main() {
	int turn;
	int num1, num2;

	cin >> turn;

	for (int i = 0; i < turn; i++) {
		cin >> num1 >> num2;
		cout << num1 + num2 << endl;
	}
}