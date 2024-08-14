class Solution {
    fun minimumOperations(nums: IntArray): Int {
        var num_operations = 0
        var positive_nums = nums.count{ x -> x > 0}
        while(positive_nums != 0) {
            var positive_min = nums.filter {x -> x > 0}.min()
            for(index in nums.indices) {
                if(nums[index] == 0) {
                    continue
                }
                nums[index] -= positive_min
                if(nums[index] == 0) {
                    positive_nums-- 
                }
            }
            num_operations++
        }
        return num_operations        
    }
}