//You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

//Find two lines that together with the x-axis form a container, such that the container contains the most water.

//Return the maximum amount of water a container can store.


// This soln works but not for bigger no of Arrays

package QC;

import java.util.Scanner;

public class MaxArea{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter size of Array");
        int n=sc.nextInt();
        int []height=new int[n];
        System.out.println("Enter elements of Array");
        for (int i = 0; i <n ; i++) {
            height[i]=sc.nextInt();
        }
        int max=0;
        for(int i =0;i<height.length;i++)
        {
            for(int j=i+1;j<height.length;j++)
            {
                int l=j-i;
                int s=Math.min(height[i],height[j]);
                int m1=l*s;
                if (m1>max)
                    max=m1;
            }

        }
        System.out.println("Max Area of the Container can be "+ max);
    }
}

//OPTIMUM SOLN
//public int maxArea(int[] height) {
//    int left = 0;
//    int right = height.length - 1;
//    int maxArea = 0;
//
//    while (left < right) {
//        int currentArea = Math.min(height[left], height[right]) * (right - left);
//        maxArea = Math.max(maxArea, currentArea);
//
//        if (height[left] < height[right]) {
//            left++;
//        } else {
//            right--;
//        }
//    }
//
//    return maxArea;
//}