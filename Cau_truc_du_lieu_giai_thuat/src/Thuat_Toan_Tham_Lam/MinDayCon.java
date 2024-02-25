package Thuat_Toan_Tham_Lam;

// THUẬT TOÁN TÌM DÃY CON LIÊN TỤC CÓ TỔNG LỚN NHẤT
public class MinDayCon {
	public static int maxSubArraySum(int[] nums) {
        int maxEndingHere = nums[0];
        int maxSoFar = nums[0];

        for (int i = 1; i < nums.length; i++) {
            maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = maxSubArraySum(array);
        System.out.println("Tong lon nhat cua day con lien tuc la: " + result);
    }
	
	
}
