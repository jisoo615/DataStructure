package test1;

public class p1_23 {
	public static void abc(int N) {
		int r=N%2;
		System.out.print("*");
		if (N>=2)
			abc(N/2);
		System.out.printf("%d", r);
		return;
	}

	public static void main(String[] args) {
		abc(78);
	}

}
