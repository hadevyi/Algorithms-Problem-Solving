#include <iostream>
using namespace std;

int main() {
	int num[3];

	cin >> num[0] >> num[1] >> num[2];

	for (int i = 0; i < 3; i++) {
		for (int j = 0; j <= i; j++) {
			if (num[i] < num[j]) {
				int temp = num[i];
				num[i] = num[j];
				num[j] = temp;
			}
		}
	}

	cout << num[1];
}