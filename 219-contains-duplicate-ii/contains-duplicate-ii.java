class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> seen = new HashSet<>();
        int L=0;
        for (int R=0;R<nums.length;R++){
            if (R-L > k){
                seen.remove(nums[L]);
                L+=1;
            }
            if (seen.contains(nums[R])){
                return true;
                
            }
            seen.add(nums[R]);
        }
        return false;


  
    }
}