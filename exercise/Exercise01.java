public class Exercise01 {
	public static void main(String[] args) {
        exercise111();
        exercise112();
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
	}

}