package LinearSearch;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr = {{4,5,6},{3,2,99}};
        System.out.println(getMaximumWealth(arr));
    }
    static int getMaximumWealth(int[][] accounts){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length ; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            if(sum>max){
                max = sum;
            }
        }
        return max;
    }
}
