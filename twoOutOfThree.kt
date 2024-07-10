class Solution {
    fun twoOutOfThree(nums1: IntArray, nums2: IntArray, nums3: IntArray): List<Int> {
        var in1 = mutableMapOf<Int, Int>()
        var in2 = mutableMapOf<Int, Int>()
        for(index in nums1.indices)
        {
            in2[nums1[index]] = (in2[nums1[index]] ?: 0) + 1
            if(in2[nums1[index]] == 1)
            {
                in1[nums1[index]] = (in1[nums1[index]] ?: 0) + 1
            }
        }
        in2.clear()
        for(index in nums2.indices)
        {
            in2[nums2[index]] = (in2[nums2[index]] ?: 0) + 1
            if(in2[nums2[index]] == 1)
            {
                in1[nums2[index]] = (in1[nums2[index]] ?: 0) + 1
            }
        }
        in2.clear()
        for(index in nums3.indices)
        {
            in2[nums3[index]] = (in2[nums3[index]] ?: 0) + 1
            if(in2[nums3[index]] == 1)
            {
                in1[nums3[index]] = (in1[nums3[index]] ?: 0) + 1
            }
        }
        var answer = mutableListOf<Int>()
        for(key in in1.keys)
        {
            val value = in1[key]
            if (value != null && value >= 2)
            {
                answer.add(key)
            }
        }
        return answer

    }
}