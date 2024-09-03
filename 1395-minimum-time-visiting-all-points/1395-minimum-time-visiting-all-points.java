class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int diff1,diff2,count=0;
        for(int i=0;i<points.length-1;i++){
            diff1 = Math.abs(points[i+1][0] - points[i][0]);
            diff2 = Math.abs(points[i+1][1] - points[i][1]);
            count += Math.max(diff1,diff2);
        }
        return count;
    }
}