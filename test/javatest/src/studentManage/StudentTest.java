package studentManage;

import java.util.Scanner;

public class StudentTest extends ManageMethod{
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Student arr[] = new Student[60];

		while (true) {
			System.out.println("---------");
			System.out.println("1-添加学生");
			System.out.println("2-显示学生");
			System.out.println("3-查找学生");
			System.out.println("4-更改学生");
			System.out.println("5-删除学生");
			System.out.println("6-退出系统");
			System.out.println("---------");

			int select = in.nextInt();
			switch (select) {
			case 1:
				addstudent(arr);
				break;
			case 2:
				printarr(arr);
				break;
			case 3:
				findstudent(arr);
				break;
			case 4:
				changestudent(arr);
				break;
			case 5:
				deletestudent(arr);
				break;
			case 6:
				System.out.println("退出成功!");
				System.exit(0);
			}

		}

	}

	
}
