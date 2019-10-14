package code;

public class Dog extends Animal{
    public Dog(String variety,int age){
        super(variety,age);
    }
    public void eat(){
        System.out.println(getVariety()+"啃骨头~~~~");
    }
}
