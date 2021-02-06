
#include <iostream>
using namespace std;

int main() {
	int hour, min;

	cin >> hour >> min;

	if (min >= 45)
		min -= 45;
	else {
		if (hour == 0)
			hour = 23;
		else
			hour--;

		min = 60 - (45 - min);
	}

	cout << hour << ' ' << min << endl;
}