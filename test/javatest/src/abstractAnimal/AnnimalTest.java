package abstractAnimal;

public class AnnimalTest {

	public static void main(String[] args) {
		Frog f= new Frog("小绿",2) {
		};
		System.out.println(f.getName()+","+f.getAge());
		f.drink();
		f.eat();
		

	}

}
