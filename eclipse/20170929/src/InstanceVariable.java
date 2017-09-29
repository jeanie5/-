class Student {
	int m_nKor;
	int m_nEng;
	int m_nMat;
	public void set(int a, int b, int c) {
		m_nKor = a;
		m_nEng = b;
		m_nMat = c;
	}
	public void set(int a, int b)
	{
		m_nKor = a;
		m_nEng = b;
		m_nMat = 0;
	}
	public double calc() {
		double avg;
		avg = (m_nKor + m_nMat + m_nEng) / 3.0;
		return avg;
	}

	public void disp() {
		System.out.println("평균은" + calc() + "입니다.");
	}
}
class InstanceVariable {
	public static void main(String[] args) {
		Student obj1 = new Student();
		Student obj2 = new Student();
		obj1.set(80, 60, 85);
		obj2.set(90, 87);
		obj1.disp();
		obj2.disp();
	}
}
