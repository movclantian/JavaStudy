package compactGamePlus;

import java.util.Random;

public class Gametest {
	public static void main(String argv[]) {
		role r1 = new role("jack", 100, "男");
		role r2 = new role("lucy", 100, "女");
		
		r1.showroleinfo();
		r2.showroleinfo();
		
		while (true) {
			r1.attack(r2);

			if (r2.getBlood() == 0) {
				System.out.println(r1.getName() + "���������" + r2.getName());
				break;
			}
			Random time = new Random();
			int settime = time.nextInt(3);
			try {
				Thread.sleep(settime*1000); // 1000 ������������������1���.
			} catch (InterruptedException ex) {
				Thread.currentThread().interrupt();
			}
			r2.attack(r1);
			if (r1.getBlood() == 0) {
				System.out.println(r2.getName() + "���������" + r1.getName());
				break;

			}
			try {
				Thread.sleep(settime*1000); // 1000 ������������������1���.
			} catch (InterruptedException ex) {
				Thread.currentThread().interrupt();
			}

		}

	}
}
