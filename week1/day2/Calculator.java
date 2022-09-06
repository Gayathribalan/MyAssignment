package week1.day2;

public class Calculator {
	
	public void add(int num1, int num2) {
		System.out.println(num1+num2);	
	}

	public void sub(float num1,int num2, int num3) {
		System.out.println(num1-num2-num3);
	}

		// TODO Auto-generated method stub

		public static void main(String[] args) {
		// TODO Auto-generated method stub;
			Calculator cal=new Calculator();
			cal.add(5,57);
			cal.sub(1.20f,10,15);

	}

}
