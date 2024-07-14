class Solution {
    fun twoOutOfThree(nums1: IntArray, nums2: IntArray, nums3: IntArray): List<Int> {
        var set_nums1 = nums1.toSet()
        var set_nums2 = nums2.toSet()
        var set_nums3 = nums3.toSet()

        var set_nums1_and_nums2 = set_nums1 intersect set_nums2
        var set_nums2_and_nums3 = set_nums2 intersect set_nums3
        var set_nums1_and_nums3 = set_nums1 intersect set_nums3
 
        set_nums1_and_nums2 = set_nums1_and_nums2 union set_nums2_and_nums3
        var answer = set_nums1_and_nums2 union set_nums1_and_nums3        
        
        return answer.toList()

    }
}