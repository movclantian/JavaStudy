package studentsPlus;

import java.util.ArrayList;
import java.util.Scanner;


public class ManageMethod {
	static Scanner in = new Scanner(System.in);

	public static void addstudent(ArrayList<Student> arr) {
		String choice1 = "yes";

		do {
			Student s = new Student();
			System.out.println("输入姓名");
			s.setName(in.next());
			System.out.println("输入年龄");
			s.setAge(in.nextInt());
			boolean flag;
			do {
				System.out.println("输入ID");
				s.setId(in.next());
				flag = judge(arr, s.getId());
				if (flag) {
					System.out.println("当前ID重复,请重新输入");
				}
			} while (flag);
			arr.add(s);
			System.out.println("成功在第" + s.getId() + "个位置添加了一个新学生");
			System.out.println("是否继续添加学生?(yes");
		} while (choice1.equals(in.next()));
	}

	
	public static boolean judge(ArrayList<Student> arr, String id) {
		for (Student s : arr) {
			if (s.getId().equals(id)) {
				return true;
			}
		}
		return false;
	}

	public static void printarr(ArrayList<Student> arr) {
		if (arr.size() == 0) {
			System.out.println("库中没有学生");
			return;
		}

		for (int i = 0; i < arr.size(); i++) {
			Student st = arr.get(i);
			System.out.println(st.getId() + "," + st.getName() + "," + st.getAge());
		}
		return;
	}

	public static int findstudent(ArrayList<Student> arr) {
		System.out.println("请输入ID");
		String id = in.next();
		for (int i = 0; i < arr.size(); i++) {
			Student st = arr.get(i);
			if (st.getId().equals(id)) {
				System.out.println("找到该学生,以下是该学生信息");
				System.out.println(st.getId() + "," + st.getName() + "," + st.getAge());
				return i;
			}
		}
		System.out.println("未找到该学生");
		return -1;
	}

	public static void changestudent(ArrayList<Student> arr) {
		int index = findstudent(arr);
		if (index == -1) {
			System.out.println("更改失败");
			return;
		} else {
			Student st = arr.get(index);
			System.out.println("输入更改的姓名");
			st.setName(in.next());
			System.out.println("输入更改的年龄");
			st.setAge(in.nextInt());
			boolean flag;
			do {
				System.out.println("输入更改的ID");
				String newid = in.next();
				flag = judge(arr, newid);
				if (flag) {
					System.out.println("当前ID重复请重新输入ID");
				} else {
					st.setId(newid);
				}
			} while (flag);
			arr.set(index, st);
			System.out.println("更改成功");
			return;
		}

	}

	public static void deletestudent(ArrayList<Student> arr) {
		int index = findstudent(arr);
		if (index == -1) {
			System.out.println("删除失败");
			return;
		} else {
			String choice = "yes";
			System.out.println("是否删除?(yes/no)");
			if (choice.equals(in.next())) {
				arr.remove(index);
				System.out.println("删除成功");
				return;
			} else {
				System.out.println("删除失败");
				return;
			}
		}
	}
}
