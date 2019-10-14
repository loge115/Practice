package code;

public class Cat extends Animal{
    public Cat(String variety,int age){
        super(variety,age);
    }
    public void eat(){
        System.out.println(getVariety()+"吃小鱼~~~~");
    }
}
