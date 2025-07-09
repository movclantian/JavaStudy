package interCar;

public class Car {
	String carname;
	int carage;
	String carcolor;

	public Car() {
		super();
		// TODO 自动生成的构造函数存根
	}

	public void show() {
		System.out.println(carname);

//		System.out.println(engineName);
	}

	public Car(String carname, int carage, String carcolor) {
		super();
		this.carname = carname;
		this.carage = carage;
		this.carcolor = carcolor;
	}

	class nostaticEngine {
		String engineName;
		int engineAge;

		public void show() {
			System.out.println(engineAge);

			System.out.println(engineName);
		}
	}

	static class staticEngine {
		String engineName;
		int engineAge;

		public void show() {
			System.out.println(engineAge);

			System.out.println(engineName);
		}
		
		public static void show2() {
			System.out.println("这是用调用静态方法的方法");

		}

	}
}
