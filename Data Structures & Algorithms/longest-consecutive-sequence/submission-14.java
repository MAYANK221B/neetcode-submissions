class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length==0)
            return 0;

       HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);}

        int count = 1;
        int result =1;
        for(int i : nums){
            if(i!=Integer.MIN_VALUE && set.contains(i-1))
                continue;
            else{
                boolean flag = true;
                while(flag){
                    if(i!=Integer.MAX_VALUE && set.contains(i+1)){
                        i++;
                        count++;
                }
                    else
                        flag=false;
                }
                result = Math.max(result, count);
                count=1;
            }
        }
        return result;
        }
    
}
