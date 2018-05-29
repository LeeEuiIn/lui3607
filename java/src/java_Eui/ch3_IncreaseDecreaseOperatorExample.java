package java_Eui;
//증감연산자 예제
/* ++, --
 * 변수 앞에 ++이 붙으면 1을 증가시키고 계산에 사용
 * 변수 뒤에 ++이 붙으면 일단 변수값을 사용하고 1을 증가시켜 놓음. */
public class ch3_IncreaseDecreaseOperatorExample {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		System.out.println("------------------------");
		x++;//x=10
		//x=11
		++x;//x=11 -> x=12 x가 가지고 있는 값에 1을 더한후 x에 대입한다.
		System.out.println("x=" + x);
		System.out.println("------------------------");
		y--;//y값을 먼저 사용한후 1을 감소 시켜서 y을 대입한다.
		--y;//y=8
		System.out.println("y=" + y);//y=8출력
		System.out.println("------------------------");
		z = x++;//x가 가지고 있는 값을 z에 대입 후 x값을 1증가시킴.
		//z에 12을 대입하고 x는 13이 된다.
		System.out.println("z=" + z);//z=12출력
		System.out.println("x=" + x);//x=13출력
		System.out.println("------------------------");
		z = ++x;//증감연사을 수행 후 z에 대입
		System.out.println("z=" + z);
		System.out.println("x=" + z);
		System.out.println("------------------------");
		z = ++x  + y++;
		//x에 1을 더한 값에 y값을 더해서 z에 대입
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("y=" + y);
	}

}


/*public class ch3_IncreaseDecreaseOperatorExample {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		System.out.println("------------------------");
		x++;//x=11, y=10, z=?
		++x;//x=11, y=10, z=?
		
		System.out.println("x=" + x);
		System.out.println("------------------------");
		y--;//x=12, y=9, z=?
		--y;//x=12, y=9, z=?
		
		System.out.println("y=" + y);//y=8출력
		System.out.println("------------------------");
		z = x++;//x=12, y=8, z=?
		
		//z에 12을 대입하고 x는 13이 된다.
		System.out.println("z=" + z);//z=12출력
		System.out.println("x=" + x);//x=13출력
		System.out.println("------------------------");
		z = ++x;//x=?, y=?, z=?
		
		System.out.println("z=" + z);
		System.out.println("x=" + z);
		System.out.println("------------------------");
		z = ++x  + y++;//x=?, y=?, z=?
		
		//x에 1을 더한 값에 y값을 더해서 z에 대입
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("y=" + y);
	}

}*/

