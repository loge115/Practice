package day9;

/**
 * @author loge
 * @date 2019-09-27 20:38
 */
public class Dog extends Animal{
    @Override
    public void eat(String something) {
        System.out.println("狗吃"+something);
    }
    public void lookHome(){
        System.out.println("狗狗看家");
    }
}
