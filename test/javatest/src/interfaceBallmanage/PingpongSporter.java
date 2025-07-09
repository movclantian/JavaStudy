package interfaceBallmanage;

public abstract class PingpongSporter extends Sporter implements English{

	@Override
	public void SpeakEnglish() {
		System.out.println("乒乓球运动员在说英语");
		
	}

	@Override
	public void study() {
		System.out.println("乒乓球运动员在学习如何打乒乓球");
		
	}

	public PingpongSporter() {
		super();
	}

	public PingpongSporter(String name, int age) {
		super(name, age);
		// TODO 自动生成的构造函数存根
	}
	
}
