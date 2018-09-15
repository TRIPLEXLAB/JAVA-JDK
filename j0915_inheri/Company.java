package j0915.inheri;

//신입 -> 3개월 동안 교육 => 부서에 배치(영업부->2명~3명)-> 팀장(사원)
//클래스 작성-> 중복된 코딩이 발생=> 상속기법=> 재사용성 
//				p							q
//회사의 팀장은 그 회사의 직원(p)
class Manager extends Employee{ //private 맴버변수, 메서드 상속x
														//생성자는 상속 x 
	/*
	String name;
	int age;
	String sung;
	long salary;
	*/
	String department; //부서명;
	//has a 관계, is a 관계(상속)->p->q(참)
											//q->p(거짓)
	//프로그램을 작성 => 신입 -> 2명 -> 부서에 배정
	Employee sub[]; //1명 => 이상 Employee sub1, sub2;
	public Manager() {};
	public Manager(String name, int age, String sung, String addr, long salary, String department) {
		
		this.name = name;
		this.age = age;
		this.sung = sung;
		this.addr = addr;
		this.salary = salary;
		this.department=department; //추가
		}
	
	/*오버라이딩 -> 자식클래스에게 맞지 않으면 자식에 맞게 내용만 수정
	 *double bonus() {
	 *	return salaty*1.5;//3.0
	 *}
	 * */
	
	//------------------------------
	double bonus() {
		return salary * 3.0; //3.0
	}
	//------------------------------
	void display() {
		System.out.println("====팀징의 정보====");
		System.out.println("이름=>"+name);
		System.out.println("나이=>"+age);
		System.out.println("성별=>"+sung);
		System.out.println("주소=>"+addr);
		System.out.println("급여=>"+salary);
		double d= this.bonus();
		System.out.println("보너스=>"+d);
		System.out.println("관리하는 부서명"+department);//추가
	}
}

public class Company {//회사 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("홍길동",23,"남","서울시",1500);
		Employee e2 = new Employee("임시",30,"여","대전시",2500);
		
		//영업부의 정보를 저장
		Manager m1 = new Manager("테스트",45,"남","부산시",3500,"영업부");
		
		//부서배치-> 같은 자료형의 변수들의 집함체
		m1.sub = new Employee[2]; //0,1 //new String[2]
		//배열명[0] = 값;
		m1.sub[0] = e1;
		m1.sub[1] = e2;
		
		//제어문 -> for문
		for(int i = 0; i< m1.sub.length; i++) {
			System.out.println("직원이름="+m1.sub[i].name);
			System.out.println("==================");
			m1.sub[i].display();
		}
		
		//팀장1명
		m1.display(); //bonus*1.5(x)
		
	}

}
