#include <iostream>
#include <ios>
using namespace std;

int main() {
	cin.tie(NULL);
	ios::sync_with_stdio(false);

	int len; 

	cin >> len;

	int *num = new int[len];

	for(int i=0;i<len;i++){
		int num1, num2;
		cin >> num1 >> num2;
		num[i] = num1 + num2;
	}

	for (int i = 0; i < len; i++) {
		cout << num[i] << "\n";
	}

}