//https://leetcode.com/problems/merge-sorted-array/description/
// time O(m+n) solution
class Solution {

  public void merge(int[] nums1, int m, int[] nums2, int n) {
    int q = m + n - 1; // final merged position
    n--; // set to last nums2 position
    m--; // set to last nums1 position
    while (n >= 0 && m >= 0) {
      if (nums1[m] > nums2[n]) {
        nums1[q] = nums1[m];
        m--;
      } else {
        nums1[q] = nums2[n];
        n--;
      }
      q--;
    }

    // adds the remaining elements of nums2
    while (n >= 0) {
      nums1[q] = nums2[n];
      n--;
      q--;
    }
  }
}
