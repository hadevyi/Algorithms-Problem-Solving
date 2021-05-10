#include <iostream>
using namespace std;

int main() {
	int divis[10] = { NULL };
	int cnt=0, num, i, j;

	for (i = 0; i < 10; i++) {
		bool check(true);

		cin >> num;
		num = num % 42;

		for (j = 0; j < cnt; j++) {
			if (divis[j] == num)
				check = false;
		}

		if (check == true) {
			divis[cnt] = num;
			cnt++;
		}
	}

	cout << cnt;
	
}