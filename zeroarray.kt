class Solution {
    fun minimumOperations(nums: IntArray): Int {
        var count = 0
        while(nums.count{ x -> x > 0} != 0)
        {
            var positive_min = nums.filter {x -> x > 0}.min()
            for(index in nums.indices)
            {
                if(nums[index] == 0)
                {
                    continue
                }
                nums[index] -= positive_min
            }
            count++
        }
        return count        
    }
}