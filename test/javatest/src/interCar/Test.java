package interCar;

public class Test {

	public static void main(String[] args) {
		Car c= new Car();
		c.carage=1;
		c.carcolor="黑色";
		c.carname="宝马";
		
		Car.nostaticEngine e= new Car().new nostaticEngine();
		e.engineAge=2;
		e.engineName="12缸发动机";
		
		Car.staticEngine e2= new Car.staticEngine();
	
		c.show();
		e.show();
		
		e2.show();
		
		//静态方法的调用
		Car.staticEngine.show2();
	}

}
