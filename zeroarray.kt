class Solution {
    fun non_zero_numbers(nums: IntArray): Int {
        var amount = 0
        for(index in nums.indices)
        {
            if(nums[index] != 0)
            {
                amount++
            }
        }
        return amount
    }
    fun minimumOperations(nums: IntArray): Int {
        if(non_zero_numbers(nums) == 0)
        {
            return 0
        }
        var count = 0
        while(non_zero_numbers(nums) != 0)
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