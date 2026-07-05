class Solution {
    public int findMaxLength(int[] nums) {
        // below code is worst -> O(N^2) and tle occured
        // int maxi = 0;
        // for(int i=0;i<nums.length;i++){
        //     int zero = 0, one = 0, length=0;
        //     for(int j=i;j<nums.length;j++){
        //         if(nums[j]==0) zero++;
        //         else one++;
        //         if(zero == one){
        //             length = j-i+1;
        //         }
        //         maxi = Math.max(maxi,length);
        //     }
        // }
        // return maxi;

        // below code we convert all zeros to -1 and add the elements of subarray , if we get zero then that subarray has equal no. of zeros and ones take its length put it in maxi and compare everytime then return maxi
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
            nums[i] = -1;
            sum += nums[i];
            if (sum == 0) {
            res = Math.max(res, i + 1);
            }
            if (map.containsKey(sum)) {
            res = Math.max(res, i - map.get(sum));
            } else {
             map.put(sum, i);
            }
        }
        return res;
    }
}