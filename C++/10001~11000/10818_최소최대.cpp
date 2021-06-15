#include <iostream>
using namespace std;

int main() {
	int n, i, min, max;

	cin >> n;
	
	int* arr = new int[n];

	for (i = 0; i < n; i++)
		cin >> arr[i];

	min = max = arr[0];

	for (i = 0; i < n; i++) {
		if (min > arr[i])
			min = arr[i];

		if (max < arr[i])
			max = arr[i];
	}

	cout << min << " " << max;

	delete arr;
}