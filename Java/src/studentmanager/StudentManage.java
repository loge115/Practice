package studentmanager;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> array = new ArrayList<Student>();
        //flag定义
        System.out.println("~~~~~~~~~~欢迎来到学生管理系统~~~~~~~~~~");
        boolean flagStart = true;
        while (true) {
            System.out.println("请输入下列指令前面的序号来进行相应操作:");
            System.out.println("1.添加学生信息");
            System.out.println("2.删除学生信息");
            System.out.println("3.修改学生信息");
            System.out.println("4.查看学生信息");
            System.out.println("5.退出系统");
            //定义用户选择变量
            int flag = sc.nextInt();
            //根据用户输入指令,执行相应操作
            if (flag == 1) {
                addStudent(array);
            } else if (flag == 2) {
                deleteStudent(array);
            } else if (flag == 3) {
                setStudent(array);
            } else if (flag == 4) {
                getStudent(array);
            } else if (flag == 5) {
                quit();
                break;
            } else {
                System.out.println("输入指令有误,请重新输入!");
            }
        }
    }

    //判断学号是否存在
    public static boolean weatherExist(ArrayList<Student> array, String number) {
        boolean flag = false;
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (number.equals(s.getNumber())) {
                flag = true;
            }
        }
        return flag;
    }

    //添加学生信息
    public static void addStudent(ArrayList<Student> array) {
        //获得学生信息
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入添加学生的学号:");
        String number = sc.next();
        if (weatherExist(array, number)) {
            System.out.println("已存在相同学号,无法添加");
        } else {
            System.out.println("请输入添加学生的姓名:");
            String name = sc.next();
            System.out.println("请输入添加学生年龄:");
            String age = sc.next();
            System.out.println("请输入添加学生地址:");
            String address = sc.next();
            //创建学生对象
            Student st = new Student(number, name, age, address);
            //添加到集合
            array.add(st);
            System.out.println("学生信息添加成功");
        }
    }

    //查看学生信息
    public static void getStudent(ArrayList<Student> array) {
        if (array.size() == 0) {
            System.out.println("暂无查询信息,请添加信息后查看");
        } else {
            System.out.println("学号\t姓名\t年龄\t地址");
            for (int i = 0; i < array.size(); i++) {
                Student student = array.get(i);
                System.out.println(student.getNumber() + "\t\t" + student.getName() + "\t" + student.getAge() + "岁\t" + student.getAddress());
            }
        }
    }

    //删除学生信息
    public static void deleteStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要删除学生的学号");
        String number = sc.next();
        //记录删除前集合元素个数
        int count = array.size();
        for (int i = 0; i < array.size(); i++) {
            Student st = array.get(i);
            if (number.equals(st.getNumber())) {
                array.remove(i);
                System.out.println("学生信息删除成功");
                break;
            }
        }
        //若删除前和删除后元素个数相同,输出删除失败
        if (count == array.size()) {
            System.out.println("删除失败,没有找到相关学生信息");
        }
    }

    //修改学生信息
    public static void setStudent(ArrayList<Student> array) {
        if (array.size() == 0) {
            System.out.println("暂无学生信息,请先添加学生信息,然后修改");
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入需要修改学生的学号");
            String number = sc.next();
            //索引初始化
            int index = -1;
            for (int i = 0; i < array.size(); i++) {
                Student st = array.get(i);
                if (number.equals(st.getNumber())) {
                    index = i;
                    System.out.println("请输入添加学生的姓名:");
                    String name = sc.next();
                    System.out.println("请输入添加学生年龄:");
                    String age = sc.next();
                    System.out.println("请输入添加学生地址:");
                    String address = sc.next();
                    Student s = new Student(st.getNumber(), name, age, address);
                    array.set(i, s);
                    System.out.println("学号" + number + "的学生信息修改成功");
                    break;
                }
            }
            if (index == -1) {
                System.out.println("没有查找到相应学号的学生信息,无法修改");
            }
        }
//            System.out.println("请输入修改学生的学号:");
//            String number = sc.next();
    }

    //退出
    public static void quit() {
        System.out.println("程序已退出");
    }
}
