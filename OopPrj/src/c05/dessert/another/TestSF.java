package c05.dessert.another;

public class TestSF {
	public boolean duplicate(int[] nums, int length, int[] duplication) {
	    if (nums == null || length <= 0)
	        return false;
	    for (int i = 0; i < length; i++) {
	        while (nums[i] != i) {
	            if (nums[i] == nums[nums[i]]) {
	                duplication[0] = nums[i];
	                return true;
	            }
	            swap(nums, i, nums[i]);
	        }
	    }
	    return false;
	}

	private void swap(int[] nums, int i, int j) {
	    int t = nums[i];
	    nums[i] = nums[j];
	    nums[j] = t;
	}

	public static void main(String[] args) {
		int[] duplication = new int[6];
		int arr[] = {2, 3, 4, 4, 4, 5};
		TestSF t = new TestSF();
		t.duplicate(arr, arr.length, duplication);
		System.out.println("1");
	}
}
