package interfaceBallmanage;

public abstract class BasketballCoach extends Coach{

	public BasketballCoach(String name, int age) {
		super(name, age);
		// TODO 自动生成的构造函数存根
	}

	public BasketballCoach() {
		super();
	}

	@Override
	public void teach() {
		System.out.println("篮球教练正在教如何打篮球");
		
	}
	
}
