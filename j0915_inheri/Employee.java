package j0915.inheri;

//일반 신입 사원의 정보-> 상속의 개요-> 오버라이딩은 = 메서드를 가지고 작을 한다는 공통점이 있다.
public class Employee {
	//1.멤버변수
	String name;
	int age;
	String sung;//성별
	String addr;
	long salary; //급여-> 보너스(공기업) -> 직원(150%)
						//중간관리자(보너스 300%)
	
	//기본생성자
	public Employee() {
		
	}

	//생성자를 이용해서 값을 다양하게 저장
	public Employee(String name, int age, String sung, String addr, long salary) {
		this.name = name;
		this.age = age;
		this.sung = sung;
		this.addr = addr;
		this.salary = salary;
	}
	
	//보너스를 구해주는 메서드=> 매개변수x ->계산 -> 보너스(출력)
	double bonus() {
		return salary * 1.5; //3.0
	}
	
	//직원의 정보 -> 출력 -> 단순, 반복
	// 과장()---> 대리() ----> 사원()
	//클래스내부에 --> 다른 메서드를 호출
	//객체를 생성=> 메서드를 호출하기위해서->객체명.메서드명(~)
	//객체명을 생략이 가능(같은 클래스 내부에서는)
	//다른 클래스내부에서는 반드시 객체명을 사용해야 한다.
	void display() {
		System.out.println("====직원의 정보====");
		System.out.println("이름=>"+name);
		System.out.println("나이=>"+age);
		System.out.println("성별=>"+sung);
		System.out.println("주소=>"+addr);
		System.out.println("급여=>"+salary);
		double d= this.bonus();
		System.out.println("보너스=>"+d);
	}
	
}
