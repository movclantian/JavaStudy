package interfaceBallmanage;

public abstract class PingpongCoach extends Coach implements English {

	@Override
	public void SpeakEnglish() {
		System.out.println("乒乓球教练正在教如何打乒乓球");

	}

	@Override
	public void teach() {
		System.out.println("乒乓球教练在学习如何说英语");

	}

	public PingpongCoach() {
		super();
	}

	public PingpongCoach(String name, int age) {
		super(name, age);
		// TODO 自动生成的构造函数存根
	}

}
