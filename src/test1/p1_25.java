package test1;

public class p1_25 {
	public static void t(int num) {
	if (num>0) {
		t(num/2);
		System.out.print(num%2); //2로 난눈 나머지가 프린트됨
	}
	}
	public static void main(String[] args) {
		t(10);

	}

}
//이진수 구하기