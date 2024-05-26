package Array;
import java.util.Arrays;
import java.util.Scanner;
public class Arr {
    public static void main(String[] args) {
        //https://youtu.be/n60Dn0UsbEk?si=ERHL0FP3XBI7aIJU
        //Java Array Objects may not be continuous => depends on JVM
        //datatype[] referenceVariable = new datatype[size];
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        String[] arrStr = new String[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(Arrays.toString(arr));
        for (int i:arr) {
            System.out.println(i);
        }
        for (int i = 0; i < arrStr.length; i++) {
            arrStr[i] = sc.nextLine();
        }
        for (int i = 0; i < arrStr.length; i++) {
            System.out.println(arrStr[i]);
        }
        System.out.println();
        for (String i:arrStr) {
            System.out.println(i);
        }
        System.out.println(Arrays.toString(arrStr));
    }
}
