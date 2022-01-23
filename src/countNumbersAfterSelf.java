import java.util.ArrayList;
import java.util.List;

class countNumbersAfterSelf {
    public static int[] mergeHalves(int[] nums, int[] temp, int leftStart, int rightEnd) {
        int leftEnd = (rightEnd + leftStart) / 2;
        int rightStart = leftEnd + 1;
        int size = rightEnd - leftStart + 1;

        int left = leftStart;
        int right = rightStart;
        int index = leftStart;

        while (left <= leftEnd && right <= rightEnd) {
            if (nums[left] <= nums[right]) {
                temp[index] = nums[left];
                left++;
            } else {
                temp[index] = nums[right];
                right++;
            }
            index++;
        }

        System.arraycopy(nums, left, temp, index, leftEnd - left + 1);
        System.arraycopy(nums, right, temp, index, rightEnd - right + 1);
        System.arraycopy(temp, leftStart, nums, leftStart, size);

        return nums;


    }

    public static int[] mergesort(int[] nums) {
        mergesort(nums, new int[nums.length], 0, nums.length - 1);
        return nums;
    }

    public static int[] mergesort(int[] nums, int[] temp, int leftStart, int rightEnd) {
        int[] arrayMerged = new int[nums.length];

        if (leftStart >= rightEnd) {
            return nums;
        } else {
            int middle = (leftStart + rightEnd) / 2;
            mergesort(nums, temp, leftStart, middle);
            mergesort(nums, temp, middle + 1, rightEnd);
            mergeHalves(nums, temp, leftStart, rightEnd);
        }
        return nums;
    }

    public static List<Integer> countSmaller(int[] nums) {


        int[] count = new int[nums.length];
        List<Integer> list = new ArrayList<>(count.length);
        int add = 0;
        int a = 0;
        for (int i = 0; i <=nums.length - 1; i++) {
            int val = nums[i];
            int[] copy = new int[(nums.length - 1) - i];
            for (int k = i, j = 0; k < nums.length; k++) {
                if (k != i) {
                    copy[j] = nums[k];
                    j++;
                }
            }
            int[] sortedNums = mergesort(copy);

            




        }
        return list;
    }

    public static void main(String args[]) {
        int[] arr = new int[]{-1,0};
        List<Integer> count=countSmaller(arr);

        for(int i=0;i<=count.size()-1;i++)
        {
            System.out.println(count.get(i));
        }


    }
}


       