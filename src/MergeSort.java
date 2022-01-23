class MergeSort
{
    public static boolean IsSumExist(int[] array,int val)
    {
        boolean flag=false;
        int i=0;
        int j= array.length-1;

        while(i<j)
        {
            if(array[i]+array[j]==val)
            {
                flag =true;
                break;

            }
            else if(array[i]+array[j]<val)
            {
                flag= false;
                i++;

            }
            else
            {
                flag =false;
                j--;
            }


        }


        return flag;
    }
public static int[]  mergeHalves(int[] array,int[] temp,int leftStart,int rightEnd)
{
    int leftEnd =(rightEnd+leftStart)/2;
    int rightStart = leftEnd+1;
    int size = rightEnd-leftStart+1;

    int left = leftStart;
    int right = rightStart;
    int index = leftStart;

    while(left<=leftEnd && right <= rightEnd)
    {
        if(array[left]<=array[right])
        {
            temp[index]= array[left];
            left++;
        }
        else
        {
            temp[index]=array[right];
            right++;
        }
        index++;
    }

    System.arraycopy(array,left,temp,index,leftEnd-left+1);
    System.arraycopy(array,right,temp,index,rightEnd-right+1);
    System.arraycopy(temp,leftStart,array,leftStart,size);

    return array;


}
public static int[] mergesort(int[] array) {
    mergesort (array, new int[array.length],0, array.length - 1);
return array;
}
public static int[] mergesort(int[] array,int[] temp,int leftStart,int rightEnd)
    {
        int[] arrayMerged = new int[array.length];

        if(leftStart >= rightEnd)
        {
            return array;
        }
        else
        {
            int middle = (leftStart+rightEnd)/2;
            mergesort(array,temp,leftStart,middle);
            mergesort(array,temp,middle+1,rightEnd);
            mergeHalves(array,temp,leftStart,rightEnd);
        }
return array;
    }



    public static void main(String args[])
    {
        int[] arr = new int[]{3,41,52,26,38,57,9,49,45,-1};
        int[] sortedarray=mergesort(arr);
        int sum =44;

        for(int i=0;i<sortedarray.length;i++)
        {
            System.out.println(sortedarray[i]);
        }

        boolean IsSumExist= IsSumExist(sortedarray,sum);
        System.out.println(IsSumExist);

    }
}