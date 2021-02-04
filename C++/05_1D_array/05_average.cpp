#include <iostream>
using namespace std;

int main() {
	double *score, max = NULL, avg = 0;
	int n;

	cin >> n;

	score = new double[n];

	for (int i = 0; i < n; i++) {
		cin >> score[i];

		if (max == NULL || max < score[i])
			max = score[i];
	}

	for (int i = 0; i < n; i++) {
		score[i] = score[i] / max * 100.0;
		avg += score[i];
	}

	avg = avg / n;
	cout << avg;
	
}