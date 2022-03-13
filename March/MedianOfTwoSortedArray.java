import java.util.Arrays;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
     //  int[] arr = nums1 + nums2;
     //   Arrays.sort(arr);
        double median;
        
        
        int a1 = nums1.length;
        int b1 = nums2.length;
  
        int c1 = a1 + b1;
  
        int[] c = new int[c1];
  
        for (int i = 0; i < a1; i = i + 1) {

            c[i] = nums1[i];
        }
  
        for (int i = 0; i < b1; i = i + 1) {
  
            c[a1 + i] = nums2[i];
        }
         Arrays.sort(c);
            for(int i=0;i<c1;i++)
            System.out.println(c[i]);

        
            int mid = (c.length)/2;
            if((c.length % 2) != 0) //even
                median = c[mid];
            else{ //odd
                median = (c[mid] + c[mid-1]) / 2.0;

            }
            return median;
        }
    }

