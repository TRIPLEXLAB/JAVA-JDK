package j0915.cap;

public class CarHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 객체생성 -> 객체(자동차의 정보)를 저장할 공간을 만들어라
		int su=3; //4byte 매모리공간에 잡힌다.
		Car morning = new Car(); //자료형 객체명 = new 자료형();
		System.out.println("morning=>"+morning);
		// 저장 ->  객체명. 맴버변수 = 값
		
		/*(1)
		morning.name="모닝";
		morning.output=-700;//양수만 저장
		morning.year=2023;
		morning.color="red";
		*/
		
		//(2)
		morning.setName("모닝");
		morning.setoutput(-1);
		morning.setYear(2017);
		morning.setColor("red");
		
		//시운전 -> 메서드를 작동 -> 메서드 호출 -> 객체명.메서드명(~)
		morning.strartEnginee();
		morning.speedUp(1200000); //저장 목적
		morning.speedDown(-20); //120 - 20 =100
		//자동차의 정보
		System.out.println("차의 이름="+morning.getName());
		System.out.println("차의 년식="+morning.getYear());
		System.out.println("=====");
		morning.carInfoDisplay();
	
	}

}
