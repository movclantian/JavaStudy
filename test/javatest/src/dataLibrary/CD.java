package dataLibrary;
public class CD extends Item{
	String	other;
	
	public CD(String name, String singer, int grade, String comment,String	other) {
		super(name,singer,grade,comment);
		this.other=other;
	}
	
	public void print() {
		System.out.print("CD:");
		super.print();
		System.out.println("\t"+other);
	}


}

