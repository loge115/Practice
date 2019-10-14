package code;

public class HelloWorld {
    //计算a+b，返回结果
    public static int sum(int a,int b){
        int sum=a+b;
        return sum;
    }
    //计算长方形面积
    public static double s(double width,double height){
        double s = width*height;
        return s;
    }
    //计算长方形周长
    public static float c(float width,float height){
        float c= (width+height)*2;
        return c;
    }
    //计算圆的面积
    private static double circleArea(int r){
        double area=3.14* (Math.pow(r,2));
        return area;
    }
    //判断奇偶
    public static String oddOrEven(int num){
        if (num%2==0){
            String result = num+"是偶数";
            return result;
        }else {
            String result = num+"是奇数";
            return result;
        }
    }
    //多条件判断
    public static int fn(int x){
        if (x>=3){
            int y = 2*x+1;
            return y;
        }else if (-1<x&&x<3){
            int y=2*x;
            return y;
        }else {
            int y = 2*x - 1;
            return y;
        }
    }
    //循环语句求任意数和
    public static void summation(int x){
        int sum = 0;
        for (int i = 1;i<=x;i++){
            sum+=i;
        }
        System.out.println("1-"+x+"求和结果="+sum);
    }

    //循环求1-任意数的偶数和
    public static void summationEven(int x){
        int sum = 0;
        for (int i = 1;i<=x;i++){
            if (i%2==0){
                sum+=i;
            }
        }
        System.out.println("1-"+x+"的偶数求和结果="+sum);
    }
    /*
    判断是否是水仙花数，水仙花数个位十位百位的立方为水仙花数本身
    个位立方，十位立方，百位立方=本身
     */
    public static void daffodil(){
        for (int i=100;i<=999;i++){
            int a = i%10;
            int b = i/10%10;
            int c = i/100;
            if (Math.pow(a,3)+ Math.pow(b,3)+ Math.pow(c,3)==i){
                System.out.println(i+"是水仙花数");
            }
        }
    }
    /*
    给出一个数，求1-该数之间，能被3整除，也能被5整除
     */
    public static void fn2(int x){
        for (int i =1;i<=x;i++){
            if (i%3==0&&i%5==0){
                System.out.println(i+"能被3整除且能被5整除");
        }
        }
    }
    //打印三角形*形状
    public static void triangle(){
        //i用于设定几行
        for (int i = 1;i<=5;i++){
            //j用于设定一行打印多少*
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //打印99乘法表
    public static void table(){
        for (int i = 1;i<=9;i++){
            for (int j = 1;j<=i;j++){
                int y=i*j;
                System.out.print(j+"*"+i+"="+y+"\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int A = 3;
        int B =A++;
        System.out.println("helloworld");
        System.out.println("b="+B);
        System.out.println("a="+A);
        System.out.println("a&b="+ (A&B));
        System.out.println("a|b="+(A|B));
        System.out.println("3^3="+(3^3));
        int score = 80;
        String str = score>60?"及格":"不及格";
        System.out.println("成绩为:"+str);
        int big = A<B?B:A;
        System.out.println("最大值:"+big);
        int result=sum(20,15);
        System.out.println("20+15="+result);
        System.out.println("长方形面积="+(s(20.5,5.8))+"m²");
        System.out.println("长方形周长="+(c(5.8F,2.11F)));
        System.out.println("圆的面积="+circleArea(5));
        System.out.println(oddOrEven(4869));
        System.out.println("当x=5时，y="+fn(5));
        summation(100);
        summationEven(10);
        daffodil();
        fn2(20);
        triangle();
        table();
    }
}
