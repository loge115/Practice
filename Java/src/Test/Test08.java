package Test;
//将数组打印成字符串
public class Test08 {
    public static void main(String[] args) {
        int[] array = {2,4,6,8,10};
        System.out.println(arrange(array));
    }
    /* 基础方法,字符串拼接,效率低
    public static String arrange(int[] array){
        String s = "";
        s += "[";
        for (int i =0;i<array.length;i++){
            if (i == array.length-1){
                s += array[i];
            }else {
                s += array[i];
                s += ",";
            }
        }
        s += "]";
        return s;
    }
     */
    //利用StringBuilt拼接字符串,效率高
    public static String arrange(int[] array){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i =0;i < array.length;i++){
            if (i == array.length -1){
                sb.append(array[i]).append("]");
            }else {
                sb.append(array[i]).append(",");
            }
        }
        String s = sb.toString();
        return s;
    }
}
