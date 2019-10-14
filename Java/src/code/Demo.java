package code;

public class Demo {
    public static void main(String[] args){
        Dog dog = new Dog("柴犬",5);
        Cat cat = new Cat("蓝白",2);
        dog.eat();
        cat.eat();
        //多态
        PickUp e = new PickUp();
        e.eat(new Dog("旺财",2));
        e.eat(new Cat("波斯",3));
    }
}
