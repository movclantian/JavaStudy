package interfaceBallmanage;

public class Test {
	public static void main(String[] args) {
		PingpongSporter pps= new PingpongSporter("刘诗雯",23) {
		};
		
		System.out.println(pps.getName()+","+pps.getAge());
			
		pps.study();
		pps.SpeakEnglish();
	
	}
	
	
	
}
