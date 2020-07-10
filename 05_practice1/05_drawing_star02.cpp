#include <iostream>
using namespace std;

int main()
{
	int num;

	cin >> num;
	
	int cnt = num - 1;
	
	for (int i = 1; i < 2 * num; i++){
		for (int j = 1; j < 2 * num; j++)		{
			if (j >= num - cnt && j <= num + cnt)
				cout << "*";
			else if (j < num - cnt)
				cout << " ";
		}

		if (i < num) cnt--;
		else cnt++;

		cout << "\n";
	}
}