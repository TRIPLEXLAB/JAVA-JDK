package j0915.poly;

//2. This -> 햔재 생성된 객체를 가리키는  예약어로써 사용


//1.This -> 메서드의 매개변수 멤버변수의 이름이 같으면 컴퓨터 구분x 
public class ThisTest2 { //객체생성 -> 데이터값을 저장하기 위해서
	
	//ThisTest(){} 눈에는 보이지 않지만 자동으로 만들어진다. (밑에서 객체를 생성하면)
	//현재 클래스 -> 설계한 상태 -> 객체가 만들어지기전의 상태
	//	설계도 내부에서는 직접적인 객체이름을 사용할 수가 없다.
	//음식점 -> 물은self
	ThisTest2(){
		System.out.println("객체생성=>"+this); //현재 생성된객체
	}

	//caller 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisTest2 tt = new ThisTest2();
		System.out.println("tt=>"+tt);
		System.out.println("====================");
		
		ThisTest tt2 = new ThisTest();
		System.out.println("tt=>"+tt2);
	}

//	tt=>j0915.poly.ThisTest2@33909752
}
