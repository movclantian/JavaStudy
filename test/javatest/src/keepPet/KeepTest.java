package keepPet;

public class KeepTest {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Person p1 = new Person("老王", 30);
		Dog d = new Dog(2, "黑");
		p1.keepPet(d, "鸡腿");

		Cat c = new Cat(1, "橙");
		Person p2 = new Person("老李", 40);
		p1.keepPet(c, "金鱼");

		
	}
}
