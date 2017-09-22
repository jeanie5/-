package 개발프로젝트;

public class Flag {
	public static void main(String args[]) {
		int hol = 0, jjak = 0;
		int flag = 0;
		for (int i = 1; i <= 10; i++) {
			if (flag == 0) {
				hol = hol + i;
				flag = 1;
			} else {
				jjak = jjak + i;
				flag = 0;
			}
		}
		System.out.println("홀수의 합" + hol);
		System.out.println("짝수의 합" + jjak);
	}
}
