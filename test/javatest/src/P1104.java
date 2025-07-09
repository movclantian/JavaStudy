import java.util.*;

public class P1104 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 读取总人数
        scanner.nextLine(); // 消耗掉换行符
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String name = scanner.next();
            int year = scanner.nextInt();
            int month = scanner.nextInt();
            int day = scanner.nextInt();
            students.add(new Student(name, year, month, day));
        }

        // 使用 Lambda 表达式进行排序
        students.sort((s1, s2) -> {
            if (s1.year != s2.year) {
                return s1.year - s2.year;
            } else if (s1.month != s2.month) {
                return s1.month - s2.month;
            } else if (s1.day != s2.day) {
                return s1.day - s2.day;
            } else {
                return -1; // 输入靠后的同学先输出
            }
        });

        // 输出结果
        for (Student student : students) {
            System.out.println(student.name);
        }
    }

    static class Student {
        String name;
        int year;
        int month;
        int day;

        public Student(String name, int year, int month, int day) {
            this.name = name;
            this.year = year;
            this.month = month;
            this.day = day;
        }
    }
}