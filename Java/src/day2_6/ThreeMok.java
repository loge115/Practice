package day2_6;

import java.util.Scanner;

public class ThreeMok {
    public static void main(String[] args){
        getMax();
        }
    public static void getMax(){
        Scanner sc = new Scanner(System.in);
        int height1 = sc.nextInt();
        int height2 = sc.nextInt();
        int height3 = sc.nextInt();
        int maxHeight = height1;
        maxHeight = Math.max(height1,height2);
        maxHeight = Math.max(maxHeight,height3);

        System.out.println("身高最高的人高"+maxHeight);
    }
}
