import java.util.Arrays;


public class Exercise01 {
	public static void main(String[] args) {
        exercise111();
        exercise112();
        if (args.length == 3) {
        	try {
        		int a = Integer.parseInt(args[0]);
        		int b = Integer.parseInt(args[1]);
        		int c = Integer.parseInt(args[2]);
        		exercise113(a, b, c);
        	}
        	catch (NumberFormatException nfe) {
        		System.out.println("1.1.3");
        		System.out.println("args must be integer");
                System.out.println(nfe);
        	}
        } else {
        	System.out.println("1.1.3");
        	System.out.println("skipped because args is not input or numbers of args is not 3");
        	System.out.println();
        }
        exercise114();
        exercise115();
        exercise116();
        exercise117();
        exercise118();
        exercise119();
        exercise1110();
	}

	public static void exercise111() {
		int ra = ( 0 + 15 ) / 2;
		double rb = 2.0e-6 * 100000000.1;
		boolean rc = true && false || true && true;

		System.out.println("1.1.1:");
		System.out.println(ra);
		System.out.println(rb);
		System.out.println(rc);
		System.out.println();
	}

	public static void exercise112() {
		double ra = ( 1 + 2.236 ) / 2;
		double rb = 1 + 2 + 3 + 4.0;
		boolean rc = 4.1 >= 4;
		String rd = 1 + 2 + "3";

        System.out.println("1.1.2:");
		System.out.printf("%s : %f\n", ((Object)ra).getClass().getName(), ra);
		System.out.printf("%s : %f\n", ((Object)rb).getClass().getName(), rb);
		System.out.printf("%s : %b\n", ((Object)rc).getClass().getName(), rc);
		System.out.printf("%s : %s\n", ((Object)rd).getClass().getName(), rd);
		System.out.println();
	}

	public static void exercise113(int a, int b, int c) {
		System.out.println("1.1.3:");
		if ((a == b) && (b == c)) {
			System.out.println("equal");
		} else {
			System.out.println("not equal");
		}
		System.out.println();
	}

	public static void exercise114() {
		System.out.println("1.1.4");
		System.out.println("c is right");
		System.out.println();
	}

    public static void exercise115() {
    	System.out.println("1.1.5");
    	boolean r;
    	double x = 0.5;
    	double y = 0.6;
    	if ((0 < x) && (x < 1) && (0 < y) && (y < 1)) {
    		r = true;
    	} else {
    		r = false;
    	}
    	System.out.println(r);

    	x = 0.1;
    	y = 1;
    	if ((0 < x) && (x < 1) && (0 < y) && (y < 1)) {
    		r = true;
    	} else {
    		r = false;
    	}
    	System.out.println(r);
    	System.out.println();
    }

    public static void exercise116() {
        System.out.println("1.1.6");
        int f = 0;
        int g = 1;
        for (int i=0;i<=15;i++) {
            System.out.println(f);
            f = f + g;
            g = f - g;
        }
        System.out.println();
    }

    public static void exercise117() {
        System.out.println("1.1.7");
        double t = 9.0;
        while (Math.abs(t - 9.0/t) > .001) {
            t = (9.0/t + t) / 2.0;
        }
        System.out.printf("%.5f\n", t);

        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            for (int j = 0; j < i; j++) {
                sum++;
            }
        }
        System.out.println(sum);

        int sum1 = 0;
        for (int i = 1; i < 1000; i *= 2) {
            for (int j = 0; j < i; j++) {
                sum1++;
            }
        }
        System.out.println(sum1);

        System.out.println();
    }

    public static void exercise118() {
        System.out.println("1.1.8");
        System.out.println("b" + "c");
        System.out.println((char)('a'+4));

        System.out.println();
    }

    public static void exercise119() {
        System.out.println("1.1.9");
        int N = 1024;
        System.out.println(Integer.toBinaryString(N));
        
        String s = "";
        for (int n = N; n > 0; n /= 2) {
            s = (n % 2) + s;
        }
        System.out.println(s);

        System.out.println();
    }


    public static void exercise1110() {
        System.out.println("1.1.10");
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = i*i;
        }
        System.out.println(Arrays.toString(a));
        System.out.println();
    }
}