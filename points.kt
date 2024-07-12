class Solution {
    fun min(a: Int, b: Int) = if(a > b) b else a
    fun max(a: Int, b: Int) = if(a > b) a else b
    fun count_time_between(a: Int, b: Int, c: Int, d: Int): Int
    {
        val e = min(a - b, c - d)
        val f = max(a - b, c - d) - e
        return e + f
    }
    fun count_time(first_point_xx: Int, first_point_yy: Int, second_point_xx: Int, second_point_yy: Int): Int
    {
        var diagonal_time: Int = 0
        var horisontal_vertical_time: Int = 0
        data class PointPair (val x1: Int, val y1: Int, val x2: Int, val y2: Int)
        val point = PointPair(first_point_xx, first_point_yy, second_point_xx, second_point_yy)
        var time = 0
        if(point.x1 >= point.x2 && point.y1 >= point.y2){
            time = count_time_between(point.x1, point.x2, point.y1, point.y2)
        }
        else if(point.x1 < point.x2 && point.y1 >= point.y2){
            time = count_time_between(point.x2, point.x1, point.y1, point.y2)
        } 
        else if(point.x1 >= point.x2 && point.y1 < point.y2){ 
            time = count_time_between(point.x1, point.x2, point.y2, point.y1)
        }
        else
        {
            time = count_time_between(point.x2, point.x1, point.y2, point.y1)
        }
        return time
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