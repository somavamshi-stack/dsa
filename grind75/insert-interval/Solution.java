import java.util.*;

class Solution {
  public int[][] insert(int[][] intervals, int[] newInterval) {
      int newStartPoint = newInterval[0];
      int newEndPoint = newInterval[1];
      int left = 0, right = intervals.length;
      List<int[]> output = new ArrayList<>();
      while (left < right && newStartPoint > intervals[left][0]) {
          output.add(intervals[left++]);
      }

      int[] interval = new int[2];

      if (output.isEmpty() || output.getLast()[1] < newStartPoint) {
          output.add(newInterval);
      } else {
          interval = output.removeLast();
          interval[1] = Math.max(interval[1], newEndPoint);
          output.add(interval);
      }
      while (left < right) {
          interval = intervals[left++];
          int start = interval[0], end = interval[1];
          if (output.getLast()[1] < start) {
              output.add(interval);
          } else {
              interval = output.removeLast();
              interval[1] = Math.max(interval[1], end);
              output.add(interval);
          }
      }

      return output.toArray(new int[output.size()][2]);
  }
}