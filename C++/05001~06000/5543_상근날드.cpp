#include <iostream>
using namespace std;

int main() {
	int buger[3], drink[2], set_price[3 * 2];
	int n = 0;

	for (int i = 0; i < 3; i++)
		cin >> buger[i];

	for (int i = 0; i < 2; i++)
		cin >> drink[i];

	for (int i=0;i<3;i++){
		for (int j = 0; j < 2; j++) {
			set_price[n] = buger[i] + drink[j] - 50;
			n++;
		}
	}

	int min = set_price[0];

	for (int i = 1; i < 6; i++)
		if (min > set_price[i])
			min = set_price[i];

	cout << min;
}