package j0915.poly;

//1.This -> 메서드의 매개변수 멤버변수의 이름이 같으면 컴퓨터 구분x 
public class ThisTest { //객체생성 -> 데이터값을 저장하기 위해서
	private int a = 100;
	
	//ThisTest(){} 눈에는 보이지 않지만 자동을 만들어진다. (밑에서 객체를 생성하면)
	public void setA(int a) {
		//this.멤버변수 = 매개변수;
		 this.a = a; //멤버변수 = 매개변수;
	}
	
	public int getA() {
		return a;
	}

	//caller 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisTest tt = new ThisTest();
		tt.setA(200);
		int su = tt.getA(); //반환형 변수 = 객체명.메서드명(~)
		System.out.println("su=>"+su);
	}

}
