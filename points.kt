class Solution {
    fun minTimeToVisitAllPoints(points: Array<IntArray>): Int {
        var time = 0;
        for(i in 1..points.size-1) {
            time += max(abs(points[i - 1][0] - points[i][0]), abs(points[i - 1][1] - points[i][1]))
        }
        return time
    }
}