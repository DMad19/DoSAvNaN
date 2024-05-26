package BinarySearch;

public class SmallestLetterGreaterThanTarget {
    //https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 's';
        System.out.println(getSmallestLetterGreaterThanTarget(letters,target));
    }
    static char getSmallestLetterGreaterThanTarget(char[] letters,char target){
        int start = 0;
        int end = letters.length-1;
        while(start<=end){
            int mid = start +(end-start)/2;
            if(letters[mid]<=target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return letters[start%letters.length];
    }
}
