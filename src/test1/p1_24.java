package test1;

public class p1_24 {
	public static int test(String s, int last) {
		if (last<0) {
			return 0;
		}
		if (s.charAt(last)=='0') {
			 return 2*test(s, last-1);
	    }
		return 1+2*test(s, last-1);
	}
	
	
	public static void main(String[] args) {
		test("110100111", 4);

}
}
//return 다음엔 그 뒤를 실행하지 않음.