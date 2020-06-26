import java.util.Arrays;
import java.util.Random;
import java.lang.Math;


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
        exercise1111();
        exercise1112();
        exercise1113();
        exercise1114();
        exercise1115();
        System.out.println("1.1.16");
        System.out.println(exercise1116(6));
        System.out.println();
        exercise1117();
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

    public static void exercise1111() {
        System.out.println("1.1.11");
        int length = 5;
        int width = 6;
        String[][] a = new String[length][width];
        Random rd = new Random();
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                a[i][j] = rd.nextBoolean() ? "*" : " ";
            }
        }
        String width_title = " ";
        for (int j = 0; j < width; j++) {
            width_title += " ";
            width_title += Integer.toString(j+1);
        }
        System.out.println(width_title);
        for (int i = 0; i < length; i++) {
            String row = Integer.toString(i+1);
            for (int j = 0; j < width; j++) {
                row += " ";
                row += a[i][j];
            }
            System.out.println(row);
        }
        System.out.println();
    }

    public static void exercise1112() {
        System.out.println("1.1.12");
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
           a[i] = 9 - i;
        }
        for (int i = 0; i < 10; i++) {
           a[i] = a[a[i]];
        }
        for (int i = 0; i < 10; i++) {
           System.out.println(i);
        }
        System.out.println();
    }

    public static void exercise1113() {
        System.out.println("1.1.13");
        int length = 5;
        int width = 6;
        int[][] a = new int[length][width];
        Random rd = new Random();
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                a[i][j] = rd.nextInt(10);
            }
        }
        System.out.println("The raw arrays");
        for (int i = 0; i < length; i++) {
            String row = "";
            for (int j = 0; j < width; j++) {
                row += " " + Integer.toString(a[i][j]);
            }
            System.out.println(row);
        }
        System.out.println("The rotated arrays");
        for (int j = 0; j < width; j++) {
            String row = "";
            for (int i = 0; i < length; i++) {
                row += " " + Integer.toString(a[i][j]);
            }
            System.out.println(row);
        }
        System.out.println();
    }

    public static void exercise1114() {
        System.out.println("1.1.14");
        int result = 0;
        long n1 = 1;
        long n2 = 2;

        Random rd = new Random();
        int n = rd.nextInt();
        if (n < 0) {
            n *= -1;
        }
        System.out.printf("Generated number: %d\n", n);

        // debug
        System.out.printf("Math moudle debug result: %f\n", Math.log(n)/Math.log(2));

        for (int i = 0; i < 31; i++) {
            if ( n == 1 ) {
                break;
            } else if ( n > n1 && n <= n2 ) {
                break;
            } else if ( n < n1 ) {
                System.out.println("Something must be wrong!");
                break;
            } else {
                n1 = n2;
                n2 *= 2;
                result += 1;
            }
        }
        System.out.printf("Result1: %d\n", result);

        result = 0;
        for (int i =0; i < 31; i++) {
            if ( n == 1 ) {
                break;
            }
            n = n >> 1;
            result += 1;
        }
        System.out.printf("Result2: %d\n", result);
        System.out.println();
    }

    public static void exercise1115() {
        System.out.println("1.1.15");
        Random rd = new Random();
        int m = rd.nextInt(100);
        int[] a = new int[rd.nextInt(100)];
        System.out.printf("array a: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = rd.nextInt(m);
            System.out.printf("%d,", a[i]);
        }
        System.out.println();

        int[] result = new int[m];
        int sum = 0;
        System.out.printf("array result: ");
        for (int i = 0; i < m; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if ( a[j] == i ) {
                    count += 1;
                }
            }
            result[i] = count;
            System.out.printf("%d,", result[i]);
            sum += result[i];
        };
        System.out.println();

        if ( sum == a.length ) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }

        System.out.println();
    }

    public static String exercise1116(int n) {
        if (n <= 0) return "";
        return exercise1116(n-3) + n + exercise1116(n-2) + n;
    }

    public static void exercise1117() {
        System.out.println("1.1.17");
        System.out.println("跳出递归条件，必须要在递归函数内部调用之前");
        System.out.println();
    }
}