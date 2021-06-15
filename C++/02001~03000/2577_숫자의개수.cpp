#include <iostream>
#include <string>
#include <cstring>
using namespace std;

int main() {
	int arr[10] = { 0 };
	int result = 1, num;

	for (int i = 0; i < 3; i++) {
		cin >> num;
		result *= num;
	}

	int length = (to_string(result)).size();
	char *str = new char[length];
	strcpy(str, to_string(result).c_str());
	
	for (int i = 0; i < length; i++)
		arr[str[i]-'0'] += 1;

	for (int i = 0; i < 10; i++)
		cout << arr[i] << endl;
	
}