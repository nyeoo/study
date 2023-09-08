/*=======================================================
 ■■■ 클래스와 인스턴스 ■■■
 - 생성자(Constructor)와 초기화 블럭(Initialized Block)
========================================================*/

public class Test078
{
	// 수행할 수 없음
	/*
	int n;
	int m;

	n=100;		//-- 대입 연산 불가
	m=200;
	*/
	
	// 수행 가능
	/*
	int n = 100;
	int m = 200;	//-- 위 대입 연산과 다름
	*/

	int n;
	int m;

	// 생성자(Constructor)							//-- 초기화 블럭이 생성자보다 먼저 실행되므로, 이는 생성자가 우선순위가 높다는 의미.
	Test078()
	{
		n=100;
		m=200;
		System.out.println("생성자 실행...");
	}
	
	// 초기화 블럭
	{
		n=10;
		m=20;
		System.out.println("초기화 블럭 실행...");
	}

	// 멤버 출력 메소드
	void write()
	{
		System.out.println("n : " + n + ", m : " + m);
	}

	Test078(int n, int m)
	{
		this.n = n;
		this.m = m;
		System.out.println("매개변수 있는 생성자 실행...");
	}


	public static void main(String[] args)
	{
		Test078 ob1 = new Test078();
		ob1.write();
		//--==>> 초기화 블럭 실행...
		//		 생성자 실행...
		//		 n : 100, m : 200

		Test078 ob2 = new Test078(222, 333);
		ob2.write();
		//--==>> 초기화 블럭 실행...
		//		 매개변수 있는 생성자 실행...
		//		 n : 222, m : 333
	}
}