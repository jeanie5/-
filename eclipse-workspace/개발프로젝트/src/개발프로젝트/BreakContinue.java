package ����������Ʈ;

public class BreakContinue {
	public static void main(String args[]){
		int sum = 0;
		for(int i=1; i<=10; i++){
			if(i % 3 == 0){
				break;
			}
			sum = sum + i;
		}
		System.out.println("Break Sum�� ��" + sum);
		sum = 0;
		for(int i=1; i<=10; i++){
			if(i % 3 == 0){
				continue;
			}
			sum = sum + i;
		}
		System.out.println("Continue Sum�� ��" + sum);
	}
}
