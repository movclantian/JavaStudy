package interfaceBallmanage;

public abstract class Basketballer extends Sporter{

	@Override
	public void study() {
		System.out.println("篮球运动员在学习如何打篮球");
		
	}

	
	public Basketballer() {
		super();
	}

	public Basketballer(String name, int age) {
		super(name, age);
		// TODO 自动生成的构造函数存根
	}
	
}
