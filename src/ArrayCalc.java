public class ArrayCalc {
	public String arrayCalc(int[] nums) {
		if (nums == null) {
			return "";
		}
		else {
			int greatest = Integer.MIN_VALUE;
			int smallest = Integer.MAX_VALUE;
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] > greatest) {
					greatest = nums[i];
				}
				if (nums[i] < smallest) {
					smallest = nums[i];
				}
			}
			return "high: " + greatest + ", " + "low: " + 
				smallest + ", " + "average: " + (greatest + smallest) / 2;
		}
	}
}
