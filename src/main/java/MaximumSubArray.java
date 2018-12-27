package main.java;

public class MaximumSubArray {


    public static void main(String[] args) {
        String s = "The      girl is      beauty";
        for(String temp : s.split(" ")){
            System.out.println(temp);
        }
    }

        public static int maxSubArray(int[] nums) {
            int maxSum = Integer.MIN_VALUE;
            int[] sums = new int[nums.length];
            sums[0]=nums[0];
            int max=nums[0];
            for(int i=1;i<nums.length;i++){
                if(nums[i]+sums[i-1] > nums[i]){
                    sums[i] = nums[i]+sums[i-1];
                }else{
                    sums[i] = nums[i];
                }
                if(sums[i] > max){
                    max = sums[i];
                }
                //System.out.println(sums[i]);
            }
            return max;
        }

    {

    }
    }


