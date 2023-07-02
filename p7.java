 public void moveZeroes(int[] nums) {
        for(int turns=0;turns<nums.length-1;turns++){
            for(int i=0;i<nums.length-1-turns;i++){
                if(nums[i]==0){
                    nums[i]=nums[i+1];
                    nums[i+1]=0;
                }
            }
        }
    }