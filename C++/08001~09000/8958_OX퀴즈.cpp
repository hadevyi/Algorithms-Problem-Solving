#include <iostream>
#include <string>
#include <cstring>
using namespace std;

int main() {
	int n, cnt, len = 1;
	char arr[80];
	int *result;
	string str;

	cin >> n;
	result = new int[n];

	for (int i = 0; i < n; i++) {
		result[i] = 0;
		cnt = 0;
		cin >> str;

		strcpy(arr, str.c_str());
		len = strlen(arr);

		for (int j = 0; j < len; j++) {
			if (arr[j] == 'O')
				cnt++;
			else
				cnt = 0;

			result[i] += cnt;
		}
	}

	for (int i = 0; i < n; i++)
		cout << result[i] << endl;

}