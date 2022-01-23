public class MaxSubarray {

public static int maxSubarray(int[] arr) {
    if(arr ==null||arr.length ==0)
    {
        return 0;
    }
int maxSum=maxSubarray(arr,0,arr.length-1);
return maxSum;
}
public static int maximum(int maximumLeftSubarray,int maximumRightSubarray,int maximumCrossingSubarray)
{
if(maximumLeftSubarray>=maximumRightSubarray && maximumRightSubarray>=maximumCrossingSubarray)
{
    return maximumLeftSubarray;
}
else if(maximumRightSubarray>=maximumLeftSubarray && maximumRightSubarray>=maximumCrossingSubarray)
{
    return maximumRightSubarray;
}
else
{
    return maximumCrossingSubarray;
}
}
public static int maxCrossingSubarray(int[] arr,int leftStart,int rightEnd)
{
    int middle = leftStart+rightEnd/2;
    int left_sum = Integer.MIN_VALUE;
    int sum =0;

    for(int i=middle;i>=leftStart;i--)
    {
        sum+=arr[i];
        if(sum>left_sum)
        {
            left_sum =sum;
        }
    }

    int right_sum =Integer.MIN_VALUE;
    sum =0;

    for(int j=middle+1; j<=rightEnd;j++)
    {
        sum+=arr[j];
        if(sum>right_sum)
        {
            right_sum=sum;
        }
    }
return left_sum+right_sum;
}
public static int maxSubarray(int[] arr, int leftStart, int rightEnd)
{
    int maximumLeftSubarray=0;
    int maximumRightSubarray=0;
    int maximumCrossingSubarray=0;



    if(arr[leftStart]==arr[rightEnd])
    {
        return arr[leftStart];
    }
    int middle = (leftStart + rightEnd) / 2;
    int leftMax =Integer.MIN_VALUE;
    int sum =0;
    for(int i= middle;i>=leftStart;i--)
    {
        sum+=arr[i];
        if(sum > leftMax)
        {
            leftMax = sum;
        }
    }

    int rightMax = Integer.MIN_VALUE;
    sum =0;
    for(int i=middle+1;i<=rightEnd;i++)
    {
        sum+=arr[i];
        if(sum>rightMax)
        {
            rightMax=sum;
        }
    }

    int maxLeftRight = Integer.max(maxSubarray(arr,leftStart,middle),maxSubarray(arr,middle+1,rightEnd));
    return Integer.max(maxLeftRight,leftMax+rightMax);
}

    public static void main(String args[])
    {
        int[] arr =new int[]{13,-3,-25,20,-3,-16,-23,18,20,-7,12,-5,-22,15,-4,7};
        int maxSum=maxSubarray(arr);
        System.out.println(maxSum);
    }
}
