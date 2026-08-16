public class Solution {
    public double findMedianSortedArrays(int[] a, int[] b) {
      if (a.length > b.length) {
            return findMedianSortedArrays(b, a);  
        }
        int h = a.length;  
        int l = 0, left = (a.length + b.length + 1) / 2;
        int n = a.length + b.length;

        while (l <= h) {
            int mid1 = (l + h) >> 1, mid2 = left - mid1;
            int l1 = Integer.MIN_VALUE, l2 = Integer.MIN_VALUE;
            int r1 = Integer.MAX_VALUE, r2 = Integer.MAX_VALUE;

            if (mid1 < a.length) r1 = a[mid1];
            if (mid2 < b.length) r2 = b[mid2];
            if (mid1 - 1 >= 0) l1 = a[mid1 - 1];
            if (mid2 - 1 >= 0) l2 = b[mid2 - 1];

            if (l1 <= r2 && l2 <= r1) {
                if (n % 2 == 1) return (double) Math.max(l1, l2);
                return ((double) (Math.max(l1, l2) + Math.min(r1, r2))) / 2.0;
            } else if (l1 > r2) {
                h = mid1 - 1;
            } else {
                l = mid1 + 1;
            }
        }
        return 0;
    }}