public class SortColors {
        public void sortColors(int[] nums) {
            if(nums.length==1) return;
            int n0=0,i=0,n2=nums.length-1;
            while(n0<n2 && i<=n2){
                while(n0<nums.length && nums[n0]==0){n0++;i=n0;}
                while(n2>=0 && nums[n2]==2){n2--;}
                if(n0<n2 && i<=n2){
                    if(nums[i]==1)i++;
                    else{
                        if(n0<nums.length && i<nums.length && nums[i]==0){swap(i,n0,nums);n0++;}
                        if(n2>=0 && i<nums.length && nums[i]==2){swap(i,n2,nums);n2--;}
                    }
                }
            }
        }
        public void swap(int a,int b,int[] nums){
            int temp;
            temp=nums[a];
            nums[a] = nums[b];
            nums[b]=temp;
        }
    }

