package IoException;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class IoTest {
    public static void main(String[] args) throws IOException {
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //分数按数学成绩从高到底排序
                int num = o2.getMath() - o1.getMath();
                //如果数学分数相同,按照名字降序排列
                int num1 = num==0 ? o2.getName().compareTo(o1.getName()) : num;
                return num1;
            }
        });
        //循环2次获取2个学生科目信息
        for (int i = 0; i < 2; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入第" + (i + 1) + "学生姓名:");
            String name = sc.nextLine();
            System.out.println("请输入语文成绩:");
            int chinese = sc.nextInt();
            System.out.println("请输入数学成绩");
            int math = sc.nextInt();
            System.out.println("请输入英语成绩:");
            int english = sc.nextInt();
            Student st = new Student(name, chinese, math, english);
            ts.add(st);
        }
        //创建字符串输出缓冲流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\24574\\Desktop\\Java\\ts.txt"));
        //遍历集合,获得学生成绩
        for (Student s : ts) {
            StringBuilder sb = new StringBuilder();
            sb.append(s.getName() + ",").append(s.getChinese() + ",").append(s.getMath() + ",").append(s.getEnglish());
            //调用方法输出数据
            bw.write(sb.toString());
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }
}
