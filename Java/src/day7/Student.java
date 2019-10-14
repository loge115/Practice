package day7;

public class Student {
    //定义类属性
    private String name;
    private int age;
    //构造无参方法
    public Student(){}
    //构造有参方法
    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    //定义方法
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void study(){
        System.out.println(getName()+"学习");
    }
    public void doHomework(){
        System.out.println(getName()+"做作业");
    }
}
