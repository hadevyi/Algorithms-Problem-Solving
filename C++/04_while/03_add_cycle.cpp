#include <iostream>
using namespace std;

int main() {
	int start, end, temp, n, cnt = 0;

	cin >> n;
	temp = n;

	while (true) {

		start = temp / 10;
		end = temp % 10;

		temp = (end * 10) + ((start + end) % 10);
		cnt++;

		if (temp == n)
			break;
	}

	cout << cnt;
}