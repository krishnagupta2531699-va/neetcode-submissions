class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] brr=nums;
        int a=brr.length+nums.length;
        int[] crr=new int[a];
         for(int i=0;i<nums.length;i++){
            crr[i]=nums[i];
         }
         for(int i=0;i<brr.length;i++){
            crr[i+nums.length]=nums[i];
         }
         return crr;
    }
}