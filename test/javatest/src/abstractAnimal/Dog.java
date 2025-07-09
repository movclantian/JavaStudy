package abstractAnimal;

public abstract class Dog extends Animal{

	@Override
	public void eat() {
		System.out.println("狗在吃骨头");
	}

	public Dog(String name, int age) {
		super(name, age);
	}

	public Dog() {
		super();

	}
}
