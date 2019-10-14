package IoException;

public class Student {
    //设定属性
    private String name;
    private int chinese;
    private int math;
    private int english;
    //无参构造方法
    public Student(){}
    //有参构造
    public Student(String name,int chinese,int math,int english){
        this.name = name;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getChinese(){
        return chinese;
    }
    public void setChinese(int chinese){
        this.chinese=chinese;
    }
    public int getMath(){
        return math;
    }
    public void setMath(int math){
        this.math = math;
    }
    public int getEnglish(){
        return english;
    }
    public void setEnglish(int english){
        this.english = english;
    }
}
