package Maths;

public class UniqueElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,1,4,3,5,4,5};
        int res = 0;
        for(int i:arr){
            res = res ^ i;
        }
        System.out.println(res);
    }
}
