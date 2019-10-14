package day12_RedPackage;

/**
 * @author loge
 * @date 2019-09-17 19:22
 */
public class Person {
    private String name;
    private double leftMoney;
    public Person() {
    }

    public Person(String name, double leftMoney) {
        this.name = name;
        this.leftMoney = leftMoney;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLeftMoney() {
        return leftMoney;
    }

    public void setLeftMoney(double leftMoney) {
        this.leftMoney = leftMoney;
    }
    public void showInfo(){
        System.out.println("姓名:"+getName()+","+"余额:"+getLeftMoney());
    }
}
