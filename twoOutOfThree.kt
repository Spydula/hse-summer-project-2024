class Solution {
    fun twoOutOfThree(nums1: IntArray, nums2: IntArray, nums3: IntArray): List<Int> {
        var set1 = nums1.toSet()
        var set2 = nums2.toSet()
        var set3 = nums3.toSet()

        var set12 = set1 intersect set2
        var set23 = set2 intersect set3
        var set13 = set1 intersect set3      
        
        return (set12 union set23 union set13).toList()

    }
}