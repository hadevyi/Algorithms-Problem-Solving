#include <iostream>
using namespace std;

int main() {
	int n;

	cin >> n;

	int *sum = new int[n];
	int num1, num2;

	for (int i = 0; i < n; i++) {
		cin >> num1 >> num2;
		sum[i] = num1 + num2;
	}

	for (int i = 0; i < n; i++)
		cout << "Case #" << i + 1 << ": " << sum[i] << "\n";
}