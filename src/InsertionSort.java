public class InsertionSort {

    static int[] InsertionSort(int[] arr)
    {

        int key=0;
        int i=0;
        for(int j=1; j< arr.length ;j++)
        {
            key = arr[j];
            i=j-1;
            while(i>=0 && arr[i]>key)
            {
                arr[i+1]=arr[i];
                i--;
            }
            arr[i+1]=key;
        }

        return arr;
    }


    public static void main(String args[])
    {
        int[] arr =new int[]{5,2,4,6,1,3};
        int[] arr1 = InsertionSort(arr);
        for(int i=0;i<arr1.length;i++)
        {
            System.out.println(arr1[i]);
        }

    }
}
