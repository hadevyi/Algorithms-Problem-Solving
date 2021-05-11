#include <iostream>
using namespace std;

int main() {
	int *score = new int[5];
	int avg = 0, num;

	for (int i = 0; i < 5; i++) {
		cin >> num;

		if (num < 40)
			score[i] = 40;
		else
			score[i] = num;

		avg += score[i];
	}

	cout << avg / 5;
}