package keepPet;

public class Dog extends Animal{

	public Dog() {
		
	}

	public Dog(int age, String color) {
		super(age, color);
	}
	
	public void eat(String something) {
		System.out.println(getAge()+"岁的"+getColor()+
				"颜色的狗两只前腿死死的保住"+something+"猛吃");
	}
 
	
	
	
}
