class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] suf = new int[nums.length];
        int[] pre = new int[nums.length];
        int[] output = new int[nums.length];

        for(int i =0;i<nums.length;i++){
            if(i==0)
                pre[i]=1;
            else
                pre[i] = pre[i-1]*nums[i-1];
        }

        for(int i=nums.length-1; i>=0 ;i--){
            if(i==nums.length-1)
                suf[i]=1;
            else
                suf[i]= suf[i+1]*nums[i+1];
        }

        for(int i =0 ; i< nums.length; i++){
            output[i]=suf[i]*pre[i];
        }

        return output;
    }
}  
