package dataLibrary;

public class Item {
	private String name;
	private String singer;
	private int grade;
	private String comment;

	public Item(String name, String singer, int grade, String comment) {
		super();
		this.name = name;
		this.singer = singer;
		this.grade = grade;
		this.comment = comment;
	}

	public void settitle(String name) {
		this.name = name;
	}

	public void print() {
		System.out.print(name +" \t"+ singer +"\t"+ grade+"\t" + comment);
	}
	
	
	
}
