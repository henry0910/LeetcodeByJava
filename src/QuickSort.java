public class QuickSort {
    public void quickSort(int[] nums, int left, int right) {
        if (nums == null || nums.length == 0) return;
        if (left >= right) return;
        int pos = partition(nums, left, right);
        quickSort(nums, left, pos - 1);
        quickSort(nums, pos + 1, right);
    }
    private int partition(int[] nums, int left, int right) {
        int pivotElement = nums[left];
        int pos = left - 1;
        for (int i = left; i <= right; i++) {
            if (nums[i] <= pivotElement) {
                pos++;
                int temp = nums[i];
                nums[i] = nums[pos];
                nums[pos] = temp;
            }
        }
        int temp = nums[pos];
        nums[pos] = nums[left];
        nums[left] = temp;
        return pos;
    }
    public static void main(String[] args) {
        int[] nums = {2, 5, 4, 3, 9, 8, 7, 6, 4, 9, 8, 1, 2, 7, 4, 3, 9};
        QuickSort q1 = new QuickSort();
        q1.quickSort(nums, 0, nums.length - 1);
        for (int i = 0; i < nums.length; ++i) {
            System.out.print(nums[i]);
        }
    }

}
