package dataLibrary;

import java.util.ArrayList;

public class database {
//	private ArrayList<CD> listCD = new ArrayList<CD>();
//	private ArrayList<DVD> listDVD = new ArrayList<DVD>();
	private ArrayList<Item> listitem = new ArrayList<Item>();

//	public void add(CD cd) {
//		listCD.add(cd);
//	}
	public void add(Item item) {
		listitem.add(item);
	}

//	public void add(DVD dvd) {
//		listDVD.add(dvd);
//	}
//
	public void list() {
		for (Item item : listitem) {
			item.print();
		}

	}

	public static void main(String[] argv) {
		database cd = new database();
		cd.add(new CD("spider", "man", 5, "...", "nb"));
		cd.add(new CD("iron", "womman", 4, "...", "n1b"));
		cd.add(new DVD("tiger", "noany", 3, "...", "n2b", "lihai"));
		cd.list();
	}
}
