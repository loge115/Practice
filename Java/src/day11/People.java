package day11;

/**
 * @author loge
 * @date 2019-09-12 11:18
 */
public abstract class People {
    //定义属性
    private String name;
    private int age;
    //创建无参构造方法
    public People() {
    }
    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void eat();
}
