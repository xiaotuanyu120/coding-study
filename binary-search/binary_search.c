#include <stdio.h>

/*函数声明*/
int rank(int key, int a[], int len_a);

int main() {
	int whitelist[] = {1, 2, 3, 4, 5, 6, 7};
	int input[] = {4, 5, 7, 8, 10, 9};
	int len_whitelist = sizeof(whitelist)/sizeof(whitelist[0]);
	int len_input = sizeof(input)/sizeof(input[0]);

    for (int i=0;i<len_input;i++) {
    	if (rank(input[i], whitelist, len_whitelist)<0){
    		printf("output: %d\n", input[i]);
    	}
    }
}

int rank(int key, int a[], int len_a) {
	int lo = 0;
	int hi = len_a - 1;
	while (lo <= hi) {
		int mid = lo + (hi - lo)/2;
		if (key < a[mid]) {
			hi = mid - 1;
		} else if (key > a[mid]) {
			lo = mid + 1;
		} else {
			return mid;
		}
	}
	return -1;
}