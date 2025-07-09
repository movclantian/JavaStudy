package studentsPlus;
import java.util.*;


public class StudentsTest extends ManageMethod {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		ArrayList<Student> Students =new ArrayList<>();
		
		while (true) {
			System.out.println("---------");
			System.out.println("1-添加学生");
			System.out.println("2-显示学生");
			System.out.println("3-查找学生");
			System.out.println("4-更改学生");
			System.out.println("5-删除学生");
			System.out.println("6-退出系统");
			System.out.println("请输入序号:");
			System.out.println("---------");

			int select = in.nextInt();
			switch (select) {
			case 1:
//				addstudent(Students);
//				Collections.sort(Students,new Comparator<Student>() {//对后来的进行排序
//					public int compare(Student a,Student b) {
//						Integer a1=Integer.valueOf(a.getId());
//						Integer b1=Integer.valueOf(b.getId());
//						return a1.compareTo(b1);
//					}
//				});
//				break;
				addstudent(Students);
				Collections.sort(Students,(a,b)->a.getId().compareTo(b.getId()));
				break;
			case 2:
				printarr(Students);
				break;
			case 3:
				findstudent(Students);
				break;
			case 4:
				changestudent(Students);
				break;
			case 5:
				deletestudent(Students);
				break;
			case 6:
				System.out.println("退出成功!");
				System.exit(0);
			default:
				System.out.println("输入有误,请重新输入");
			}

		}

	}

	
}
