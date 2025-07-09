package studentManage;

import java.util.Scanner;

public class ManageMethod {
	static Scanner in = new Scanner(System.in);

	public static void addstudent(Student arr[]) {
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
//			} else {
//				int index1 = getcount(arr);
//				if (index1 != -1) {
//					arr[index1] = s;
//					System.out.println("成功在第" + (index1 + 1) + "个位置添加了一个新学生");
//				} else {
//					Student newarr[] = creatnewarr(arr);
//					int index2 = getcount(newarr);
//					newarr[index2] = s;
//					System.out.println("成功在第" + (index2 + 1) + "个位置添加了一个新学生");
//				}
				}
			} while (flag);
			int index1 = getcount(arr);
			if (index1 != -1) {
				arr[index1] = s;
				System.out.println("成功在第" + (index1 + 1) + "个位置添加了一个新学生");
			}
			System.out.println("是否继续添加学生?(yes");
		} while (choice1.equals(in.next()));
	}

	public static boolean judge(Student[] arr, String id) {
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != null && arr[i].getId().equals(id)) {
				return true;
			}
		}
		return false;
	}

	public static int getcount(Student[] arr) {
		int i = 0;
		for (i = 0; i < arr.length; i++) {
			if (arr[i] == null) {
				return i;
			}
		}

		return -1;
	}

	public static Student[] creatnewarr(Student[] arr) {
		Student newarr[] = new Student[1 + arr.length];

		for (int i = 0; i < arr.length; i++) {
			newarr[i] = arr[i];
		}
		return newarr;
	}

	public static void printarr(Student[] arr) {
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null) {
				System.out.println(arr[i].getId() + "," + arr[i].getName() + "," + arr[i].getAge());
				count++;
			}
		}
		if(count==0) {
		System.out.println("库中没有学生");
		return;
		}else {
			return;
		}
	}

	public static int findstudent(Student[] arr) {
		System.out.println("请输入ID");
		String id = in.next();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null && arr[i].getId().equals(id)) {
				System.out.println("找到该学生,以下是该学生信息");
				System.out.println(arr[i]);
				return i;
			}
		}
		System.out.println("未找到该学生");
		return -1;
	}

	public static void changestudent(Student[] arr) {
		int index = findstudent(arr);
		if (index == -1) {
			System.out.println("更改失败");
			return ;
		} else {
			System.out.println("输入更改的姓名");
			arr[index].setName(in.next());
			System.out.println("输入更改的年龄");
			arr[index].setAge(in.nextInt());
			boolean flag;
			do {
				System.out.println("输入更改的ID");
				String newid = in.next();
				flag = judge(arr, newid);
				if (flag) {
					System.out.println("当前ID重复请重新输入ID");
				} else {
					arr[index].setId(newid);
				}
			} while (flag);
			System.out.println("更改成功");
			return ;
		}

	}

	public static void deletestudent(Student[] arr) {
		int index = findstudent(arr);
		if (index == -1) {
			System.out.println("删除失败");
			return ;
		} else {
			String choice = "yes";
			System.out.println("是否删除?(yes/no)");
			if (choice.equals(in.next())) {
				for (int i = 0; i < arr.length - 1; i++) {
					arr[index] = arr[index + 1];
				}
				System.out.println("删除成功");
				return ;
			}else {
				System.out.println("删除失败");
				return ;
			}
		}
	}
}
