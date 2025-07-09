package abstractAnimal;

public abstract class Frog extends Animal{

	@Override
	public void eat() {
		System.out.println("青蛙在吃虫子");
	}

	public Frog() {
		super();
		// TODO 自动生成的构造函数存根
	}
	
	public Frog(String name, int age) {
		super(name, age);
	}

	
}
