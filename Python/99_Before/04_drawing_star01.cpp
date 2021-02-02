#include <iostream>
using namespace std;

int main() {
	int n, tep=1;
	cin >> n;

	for (int i = 0; i < 2 * n - 1; i++) {
		if (i < n)
			for (int j = 0; j <= i; j++)
				cout << "*";
		else {
			for (int j = i - tep; j > 0; j--)
				cout << "*";
			tep += 2;
		}
		cout << "\n";
	}
	return 0;
}