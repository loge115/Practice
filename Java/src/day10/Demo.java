package day10;

/**
 * @author loge
 * @date 2019-09-29 11:29
 */
public class Demo {
    public static void main(String[] args) {
//        Inter show = new Inter() {
//            @Override
//            public void show() {
//                System.out.println("show");
//            }
//        };
//        show.show();
        InterOperator operator = new InterOperator();
        operator.useInter(new Inter() {
            @Override
            public void show() {
                System.out.println("show");
            }
        });
    }
}
