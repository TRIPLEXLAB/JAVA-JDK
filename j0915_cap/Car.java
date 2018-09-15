package j0915.cap;

//클래스 작성 -> 프로그램을 작성 -> 프로그램(=회사) ->1인 사장(설계목적)
public class Car { //데이터(저장할 대상자)를 저장 할목적
	// byte -> short -> int ->long->float,double,,, char, String
	// 사람?, 자동차, 컴퓨터 -> 새로운 자료형을 만들어내는 것(추상화)
	//1. 공통적인으로 저장할 특성 ->(맴버변수(=인스턴스변수)) 8가지
	private String name; //명사형 =>  외부 접근이 차단 (보호, 은닉)
	private int output; //배기량	
	private int year; //년식 
	private String color;//색깔
	//현재 상태로 저장
	private int current_speed; //0 => 120km
	private boolean sidong = false; //true
	
	public void setName(String n) {
		name = n;
	}
	
	public void setoutput(int ou) {
		//전달받은 매개변수가 올바른값인지 체크 -> 제어문
		if(ou<= 0) {
			System.out.println("입력받은 값은 음수는 입력x");
			output = 1000; //기본값을 저장할 수 있도록 설계
			return; //탈출문
		}
		output = ou; //output = 700;
	}
	
	//음수x 2018이상 입력 => 음수이거나 2018년 이상을 입력불가x
	//year = 2018
	public void setYear(int y) {
		if(y< 0 || y >2018) {
			System.out.println("년도는 음수이거나 2018년 이상을 입력불가x");
			year = 2018; //제대로 값을 입력 못받을 경우 -> 디폴트값 설정
		}else { //올바른 경우(양수의 경우)
			year = y; //year=2018
		}
	}
	
	
	public void setColor(String cp) {
		color = cp;
	}
	
	public void setCurrent_speed(int speed) {
		current_speed = speed;
	}
	
	public void setSidong(boolean si) {
		sidong = si;
	}
	
	public String getName() {return name;}
	public int getOutput() {return output;}
	public int getYear() {return year;}
	public String getColor() {return color;}
	public int getcurrent_speed() {return current_speed;}
	public boolean getsidong() {return sidong;}
	
	
	
	//2.매서드(= 어떤 기능(저장, 출력)을 제공을 해주는 프로그램의 요소)
	//1. 시동을 걸기 --> TV, 컴퓨터 전원on => 매개변수x, 반환형x
	void strartEnginee() {
		// 매서드의 기능
		sidong = true;
		System.out.println("시동이 걸림!");
	}
	
	//2. 운전 -> 고속도로 -> 속도를 올리기 -> 채널변경(증가) => 수정목적(매개변수)o, x
	void speedUp(int speed) {
		current_speed += speed; //current_speed = current_speed + speed;
		System.out.println(speed+"속도만큼 증가됨!");
	}
	
	//3.속도를 감소시키기 --> TV(채널 감소)
	void speedDown(int speed) {
		current_speed -= speed; //current_speed = current_speed + speed;
		System.out.println(speed+"속도만큼 감소됨!");
	}
	
	//4. 차의 정보를 출력시키는 정보를 제공 => 채널편성표 =>매개변수 x, x
	void carInfoDisplay() {
		System.out.println("==차의 정보 출력==");
		System.out.println("차의 이름="+name);
		System.out.println("차의 이름="+year);
		System.out.println("차의 이름="+color);
		System.out.println("차의 배기량="+output);
		System.out.println("차의 이름="+current_speed);
	}
	
	//5. 차의 주차(=정지기능)  --> 전원off
	void stop() {
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
