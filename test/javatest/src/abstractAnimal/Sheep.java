package abstractAnimal;

public abstract class Sheep extends Animal {
	public void eat() {
		System.out.println("山羊在吃草");
	}

	public Sheep(String name, int age) {
		super(name, age);
	}

	public Sheep() {
		super();
		// TODO 自动生成的构造函数存根
	}
	
	
}
