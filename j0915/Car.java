package j0915;

//클래스 작성 -> 프로그램을 작성 -> 프로그램(=회사) ->1인 사장(설계목적)
public class Car { //데이터(저장할 대상자)를 저장 할목적
	// byte -> short -> int ->long->float,double,,, char, String
	// 사람?, 자동차, 컴퓨터 -> 새로운 자료형을 만들어내는 것(추상화)
	//1. 공통적인으로 저장할 특성 ->(맴버변수(=인스턴스변수)) 8가지
	String name; //명사형
	int output; //배기량	
	int year; //년식 
	String color;//색깔
	//현재 상태로 저장
	int current_speed; //0 => 120km
	boolean sidong = false; //true
	
	//2.매서드(= 어떤 기능(저장, 출력)을 제공을 해주는 프로그램의 요소)
	//1. 시동을 걸기 --> TV, 컴퓨터 전원on => 매개변수x, 반환형x
	public void strartEnginee() {
		// 매서드의 기능
		sidong = true;
		System.out.println("시동이 걸림!");
	}
	
	//2. 운전 -> 고속도로 -> 속도를 올리기 -> 채널변경(증가) => 수정목적(매개변수)o, x
	public void speedUp(int speed) {
		current_speed += speed; //current_speed = current_speed + speed;
		System.out.println(speed+"속도만큼 증가됨!");
	}
	
	//3.속도를 감소시키기 --> TV(채널 감소)
	public void speedDown(int speed) {
		current_speed -= speed; //current_speed = current_speed + speed;
		System.out.println(speed+"속도만큼 감소됨!");
	}
	
	//4. 차의 정보를 출력시키는 정보를 제공 => 채널편성표 =>매개변수 x, x
	public void carInfoDisplay() {
		System.out.println("==차의 정보 출력==");
		System.out.println("차의 이름="+name);
		System.out.println("차의 이름="+year);
		System.out.println("차의 이름="+color);
		System.out.println("차의 이름="+current_speed);
	}
	
	//5. 차의 주차(=정지기능)  --> 전원off
	public void stop() {
		// 매서드의 기능
		sidong = false;
		current_speed = 0; //속도계
		System.out.println("시동이 꺼짐!");
	}
	
//	//실행할때 필요 -> 결과가 눈에 보이는것(프로그램의 시작)
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		System.out.println("출력문"); //객체명.매서드명(~)
//	}

}
