//Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
//
//The overall run time complexity should be O(log (m+n)).
//
//
//
//Example 1:
//
//Input: nums1 = [1,3], nums2 = [2]
//Output: 2.00000
//Explanation: merged array = [1,2,3] and median is 2.
//Example 2:
//
//Input: nums1 = [1,2], nums2 = [3,4]
//Output: 2.50000
//Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

package QC;

import java.util.Scanner;

public class Median {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Sorted Array size and values");
        int m = sc.nextInt();
        int[] nums1 = new int[m];
        System.out.println("enter data");
        for(int i=0;i<m;i++)
        {
            nums1[i]=sc.nextInt();
        }
        System.out.println("Enter Second Sorted Array Size");
        int n = sc.nextInt();
        int[] b = new int[n];
        System.out.println("enter data");
        for(int i=0;i<n;i++)
        {
            b[i]=sc.nextInt();
        }
        Median obj =new Median();
        int []a=obj.findMedianSortedArrays(nums1,b);
        System.out.println("\n Merged array=");
        for(int i=0;i<a.length;i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println("\n");
        obj.MedianV(a);
    }
    void MedianV(int [] a)
    {
        if(a.length%2==0) {
            float d=(a[(a.length / 2)-1] + a[(a.length / 2)]) / 2f;
            System.out.println("Median is " +d);
        }
        else
            System.out.println("Median is "+ a[a.length/2]);
    }

    int[] findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m =nums1.length;int n=nums2.length;
        int x=0,y=0,z=0;
        int []mnums=new int[m+n];
        while(x<m&&y<n)
        {
            if(nums1[x]<=nums2[y])
                mnums[z++]=nums1[x++];
            else
                mnums[z++]=nums2[y++];
        }
        while(x<m)
        {
            mnums[z++]=nums1[x++];
        }
        while(y<n)
        {
            mnums[z++]=nums2[y++];
        }
        return mnums;
    }
}
