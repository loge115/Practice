package day9;

/**
 * @author loge
 * @date 2019-09-27 20:40
 */
public class Cat extends Animal{
    @Override
    public void eat(String something) {
        System.out.println("猫吃"+something);
    }
    public void catchMouse(){
        System.out.println("猫猫逮耗子");
    }
}
