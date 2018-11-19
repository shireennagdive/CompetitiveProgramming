public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        int low=0, high=numbers.length,i=0;
        int j=high-1,flag=0;
        int[] res = new int[2];
        while(i<j){
            if(numbers[i] + numbers[j] == target){
                res[0]=i+1; res[1]=j+1;
                return res;
            }
            else if(numbers[i]+numbers[j] > target) j--;
            else i++;
        }
        return res;
    }
}
