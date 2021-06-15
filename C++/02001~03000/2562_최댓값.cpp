#include <iostream>
using namespace std;

int main() {
	int arr[9], max, max_index, i;

	for (i = 0; i < 9; i++) {
		cin >> arr[i];
	}

	max = arr[0];
	max_index = 1;

	for (i = 1; i < 9; i++) {
		if (max < arr[i]) {
			max = arr[i];
			max_index = i+1;
		}
	}

	cout << max << endl;
	cout << max_index;
}