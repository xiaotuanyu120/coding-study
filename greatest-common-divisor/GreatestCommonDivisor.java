class GreatestCommonDivisor
{
    public static void main(String args[])
    {
        int result = gcd(8, 4);
        System.out.println(result);
    }

    public static int gcd(int p, int q)
    {
    	if (q == 0) return p;
    	int r = p % q;
    	return gcd(q, r);
    }
}