package Test;

public class Test03 {
    public static void main(String[] args){
        int mountainHeight = 8844430;
        double paperHeight = 0.1;
        int count = 0;
        while (paperHeight<mountainHeight){
            paperHeight *=2;
            count++;
        }
        System.out.println("0.1毫米的纸需要折叠"+count+"次后，才和珠穆拉玛峰一样高");
    }
}
