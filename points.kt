class Solution {
    fun count_time(x1: Int, y1: Int, x2: Int, y2: Int): Int
    {
        return max(max(x1, x2) - min(x1, x2), max(y1, y2) - min(y1, y2))
    }
    fun minTimeToVisitAllPoints(points: Array<IntArray>): Int {
        var total_time = 0;
        for(i in 1..points.size-1)
        {
            total_time += count_time(points[i-1][0], points[i-1][1], points[i][0], points[i][1])
        }
        return total_time
    }
}