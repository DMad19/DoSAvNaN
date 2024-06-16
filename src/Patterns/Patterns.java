package Patterns;

public class Patterns {
    public static void main(String[] args) {
//        pattern28(5);
        Integer num = new Integer(10);
        System.out.println(num.toString());
    }
    static void pattern3(int n){
        for(int i=0;i<(2*n)-1;i++){
            int c = 0;
            if(i<n){
                c = i+1;
            }else{
                c = (2*n)-i-1;
            }
            for(int j=0;j<c;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern28(int n){
        for (int i = 0; i < (2*n)-1; i++) {
            int spaces = 0;
            int c = 0;
            if(i<n){
                c = i+1;
                spaces = n-c;
            }
            else{
                c = (2*n)-i-1;
                spaces = n-c;
            }
            for(int j=0;j<spaces;j++){
                System.out.print(" ");
            }
            for(int j=0 ;j<c;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
