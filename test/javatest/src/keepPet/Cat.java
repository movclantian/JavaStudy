package keepPet;

public class Cat extends Animal{

	public Cat() {
		super();
		// TODO 自动生成的构造函数存根
	}

	public Cat(int age, String color) {
		super(age, color);
		// TODO 自动生成的构造函数存根
	}
	@Override
	public void eat(String something) {
		System.out.println(getAge()+"岁的"+getColor()+
				"颜色的猫眯着眼睛侧着头吃"+something);
	}
	
	public void catchmouse() {
		System.out.println("猫抓老鼠");
		
	}
}
