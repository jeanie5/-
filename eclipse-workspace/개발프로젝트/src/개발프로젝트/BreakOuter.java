package 개발프로젝트;

public class BreakOuter {
	public static void main(String[] args) 
	{
		outLoop:
			for(int i=0; i<3; i++){
				for(int j=0; j<3; j++){
					System.out.println("i:" + i + "-j:" + j);
					if(i==1 && j==2)
						break outLoop;
				}
			}
	}

}
