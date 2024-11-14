package Patterns;

public class Patterns {
    public static void main(String[] args) {
        pattern1(5);
        pattern2(5);
        pattern3(5);
        pattern4(5);
        pattern5a(5);
        pattern5(5);
        pattern28a(5);
        pattern29(5);
        pattern17(5);
    }
    static void pattern1(int n){
        System.out.println("Pattern 1:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        System.out.println("Pattern 2:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        System.out.println("Pattern 3:");
        for(int i=0;i<n;i++){
            for (int j = 0; j < n-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        System.out.println("Pattern 4:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i+1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern5a(int n){
        System.out.println("Pattern 5a:");
        for (int i = 1; i <= (2*n)-1; i++) {
            int c = 0;
            if(i<n){
                c = i;
            }else{
                c = (2*n)-i;
            }
            for (int j = 1; j <= c; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        System.out.println("pattern 5:");
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
    static void pattern28a(int n){
        System.out.println("Pattern 28a:");
        for (int i = 1; i < (2*n); i++) {
            int c = 0;
            int s = 0;
            if(i<n){
                s = n-i;
                c = i;
            }else{
                s = i-n;
                c = (2*n)-i;
            }
            for (int j = 1; j <= s; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= c; j++) {
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
    static void pattern29(int n){
        System.out.println("Pattern 29:");
        for (int i = 1; i <= n; i++) {
            int spaces = 2*(n-i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print(j+" ");
            }
            for (int j = 2; j<=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void pattern17(int n){
        for (int i = 1; i < (2*n); i++) {
            int spaces = 0;
            int columns = 0;
            if(i<n){
                spaces = n-i;
                columns = i;
            }else{
                spaces = i-n;
                columns = (2*n)-i;
            }
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = columns; j > 0; j--) {
                System.out.print(j);
            }
            for (int j = 2; j<=columns; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
