/***
 * In this question we need to find the local peak. If their
 * are many peaks then we return any one of them. A local peak is defined
 * as the element which is greater than its left element as well as right
 * element. If we plot the graph we will see that the element will be greater
 * than both its neighbors. This code traverses through the entire array once
 * and finds the local peak. The time complexity is O(n).
 */

public class peakFinding {
    public static int peakFinding(int[] arr)
    {
        int peak =0;
        for(int i=0;i<arr.length;i++)
        {
            if(i-1 == -1)
            {
                if(arr[i] > arr[i+1])
                {
                    peak = i;
                }
            }
            else if(i == arr.length-1)
            {
                if(arr[i]>arr[i-1])
                {
                    peak =i;
                }
            }
            else
            {
                if(arr[i]>arr[i+1] && arr[i]>arr[i-1])
                {
                    peak =i;
                }
            }
        }
return peak;
    }


    public static void main(String args[])
    {
        int[] arr = new int[]{7,3,1,0,0,0};
      int peak =  peakFinding(arr);
      System.out.println(peak);

    }
}
