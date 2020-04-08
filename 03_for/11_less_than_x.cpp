#include <iostream>
using namespace std;

int main() {
	int max, n, index = 0;

	cin >> max >> n;

	int *num = new int[max];

	for (int i = 0; i < max; i++)
		cin >> num[i];
	
	for (int i = 0; i < max; i++) 
		if (num[i] < n) 
			cout << num[i] << " ";
}