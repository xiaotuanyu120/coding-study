#include <stdio.h>

/*函数声明*/
int gcd(int p, int q);

int main() {
   
   int result;
   result = gcd(8, 4);
   printf("result is : %d", result);
   return 0;
}

int gcd(int p, int q) {
	if (q == 0)
		return p;
	int r;
	r = p % q;
    return gcd(q, r);
}