package LinearSearch;

class NumberOfEvenNumbers {
    //https://leetcode.com/problems/find-numbers-with-even-number-of-digits/submissions/1185029823/
    public static void main(String[] args) {
        int[] arr = {123,4224,2,0,45,55};
        System.out.println(findNumbers(arr));
    }
    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(isEven(nums[i])){
                count+=1;
            }
        }
        return count;
    }
    static boolean isEven(int num){
        return getNoOfDigits(num) % 2 == 0;
    }
    static int getNoOfDigits(int num){
//        if(num<0){
//            num=num*-1;
//        }
//        if(num==0){
//            return 1;
//        }
//        int count = 0;
//        while(num>0){
//            count+=1;
//            num = num/10;
//        }
//        return count;
        if(num==0){
            return 1;
        }
        return (int)(Math.log10(num))+1;
    }
}