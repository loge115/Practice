package studentmanager;

public class Student {
    //定义类属性
    private String number;
    private String name;
    private String age;
    private String address;

    //无参数构造方法
    public Student() {
    }

    //有参数构造
    public Student(String number, String name, String age, String address) {
        this.name = name;
        this.number = number;
        this.age = age;
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
