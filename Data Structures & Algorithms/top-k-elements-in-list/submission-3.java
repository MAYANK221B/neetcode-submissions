class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer>  map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        
    List<Integer>[] buckets = new ArrayList[nums.length+1];
    
    for(int num : map.keySet()){
        int freq = map.get(num);

        if(buckets[freq]==null)
            buckets[freq] = new ArrayList<>();

        buckets[freq].add(num);
    }

    int index =0;
    int[] result = new int[k];
    
    for(int i=buckets.length -1; i>=0; i--){
        if(buckets[i]==null)
            continue;
        
        for(int num : buckets[i])
            result[index++] = num;

        if(index==k)
            return result;
    }

return result;
    }
}
