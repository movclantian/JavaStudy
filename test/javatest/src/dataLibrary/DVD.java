package dataLibrary;
public class DVD extends Item {
	String dierctor;
	String playtime;
	
	public DVD(String name, String singer, int grade, String comment,String dierctor,String playtime) {
		super(name,singer,grade,comment);
		settitle(name);
		this.dierctor=dierctor;
		this.playtime=playtime;
		
	}
	
	public void print() {
		System.out.print("DVD:");
		super.print();
		System.out.println("\t"+dierctor+"\t"+playtime);
	}
	
}

