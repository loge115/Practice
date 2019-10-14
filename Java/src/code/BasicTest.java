package code;

public class BasicTest {
    public static void main(String[] args){
        System.out.println(factorial(5));
        System.out.println(getCount(20));
    }
    //求阶乘(递归）
    public static int factorial(int n){
        if (n==1){
            return 1;
        }else {
            return n*factorial(n-1);
        }
    }
    //打印第n个斐波那契数列
    public static int getCount(int n){
        if (n==1||n==2){
            return 1;
        }else {
            return getCount(n-1)+getCount(n-2);
        }
    }
}
