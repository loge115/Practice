package day2_6;

public class ArrayEqual {
    public static void main(String[] args) {
        int[] arrayA = {1,2,3,4,5};
        int[] arrayB = {1,2,3,4,5};
        int[] arrayC = {5,4,3,2,1};
        System.out.println(equal(arrayA,arrayB));
        System.out.println(equal(arrayA,arrayC));
    }
    public static boolean equal(int[] array1,int[] array2){
        if (array1.length!=array2.length){
            return false;
        }
        for (int i = 0;i < array1.length;i++){
            if (array1[i]!=array2[i]){
                return false;
            }
        }
        return true;
    }
}
