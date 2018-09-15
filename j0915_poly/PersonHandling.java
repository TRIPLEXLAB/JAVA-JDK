package j0915.poly;

// 설계목적
class Person {
	// 1.맴버변수
	private String name;
	private int age; // 음수 2000
	private String address;
	//(), (name),(age),(address),(name,age),(age,address)
	//(name,address),(name,age,address)
	
	//기본 생성자
	Person(){
		name = "홍길동";
		age = 23;
		address = "서울시 강남구 세경빌딩 3층";
		
		System.out.println("난 기본생성자 호출됨!");
	}
	
	Person(String n, int a){
		name = n; //name="테스트";
		age = a; //age=37;
		address= "대전시 중구";
	}
	
	//----------------------------------------
	Person(String n, int a, String addr){
		name = n;
		age = a;
		address = addr;
	}
	//----------------------------------------
	//command+shift+f(자동정렬)
	//command+shift+o(자동 import)
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age < 0) {
			System.out.println("나이는 양수만 입력가능");
			return;
		}
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	//단순, 반복적인 맴버변수값을 출력
	void personDisplay() {
		System.out.println("name=>"+name);
		System.out.println("age=>"+age);
		System.out.println("address=>"+address);
	}

}

public class PersonHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 자료형 객체명 = new 생성자();
		Person p = new Person(); //객체->서로 다른 공간
		
//		p.setName("홍길동");
//		p.setAge(23);
//		p.setAddress("서울시 강남구 세경빌딩");
		p.setAge(24);
		p.setAddress("대전시 중구 용운동");
		
		p.personDisplay();
		System.out.println("---------------------------");
		
		//생성자
		Person p2 = new Person();
		p2.setName("이길수");
		p2.setAge(34);
		p2.setAddress("서울시 강남구 세경빌딩"); 
		p2.personDisplay();
		
		//----------------------------------------
		Person p3 =new Person("테스트",37);
		p3.setAddress("서울시 강북구");
		p3.personDisplay();
		
		//----------------------------------------
		Person p4 = new Person("테스트2",43,"부산시 동구");
		p4.personDisplay();
		
	}

}
