package Test;

import day7.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        getArray();
    }
    /*创建字符串对象,并对其遍历
    public static void getArray(){
        ArrayList<String> array = new ArrayList<>();
        array.add("loge");
        array.add("wx");
        array.add("lyu");
        for (int i =0;i < array.size();i++){
            String s = array.get(i);
            System.out.println(s);
        }
    }

     */
    public static void getArray(){
        //创建集合对象
        ArrayList<Student> array = new ArrayList<>();
        //循环3次用户输入信息
        for (int i =1;i <4;i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入第"+i+"个学生姓名:");
            String name = sc.nextLine();
            System.out.println("请输入第"+i+"个学生年龄:");
            int age = sc.nextInt();
            Student st = new Student(name,age);
            array.add(st);
        }
        /* 程序静态输入
        Student st1 = new Student("loge",18);
        Student st2 = new Student("wx",19);
        Student st3 = new Student("lyu",16);
        ArrayList<Student> array= new ArrayList<>();
        array.add(st1);
        array.add(st2);
        array.add(st3);}
         */
        //遍历输出集合内元素
        for (int i = 0;i < array.size();i++){
            Student st = array.get(i);
            System.out.println(st.getName()+","+st.getAge());
        }
    }
}
