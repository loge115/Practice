package code;

public abstract class Animal {
    //定义属性
    private String variety;
    private int age;
    //调用Animal方法，给属性赋值
    public Animal(String variety,int age){
        this.variety = variety;
        this.age = age;
    }
    //定义抽象方法
    public abstract void eat();
    //调取variety属性值
    public String getVariety(){
        return variety;
    }
    //调取age属性值
    public int getAge(){
        return age;
    }
    //单独设定variety属性值
    public void setVariety(String variety){
        this.variety = variety;
    }
    //单独设定age属性值
    public void setAge(int age){
        this.age = age;
    }
}