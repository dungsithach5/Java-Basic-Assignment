package luyentap;

import java.util.Scanner;

public class solution {
	public static void inputArray(int[] nums) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0 ; i < nums.length ; i++) {
			System.out.printf("[%d] = " , i);
			nums[i] = sc.nextInt();			
		}
	}
	
	public static void printArray(int[] nums) {
		for(int i = 0 ; i < nums.length ; i++) {
			System.out.print(nums[i] + " ");
		}
	}

    public static void twoSum(int[] nums, int target) {
        for(int i = 0 ; i < nums.length ; i++) {
			if (nums[i] + nums[i+1] == target) {
				System.out.print("[" + nums[i] + "," + nums[i+1] + "]");
			}else {
				System.out.println("none");
			}
		}
    }

    public static void main(String[] args) {
    	int target;
    	int nums;
		int[] iArray;
		Scanner sc = new Scanner(System.in);
		System.out.print("Num = ");
		nums = sc.nextInt();
		
		System.out.print("Target = ");
		target = sc.nextInt();
		
		iArray = new int[nums];
		
		System.out.println("Input array: ");
		inputArray(iArray);
		
        System.out.print("nums = ");
        printArray(iArray);
        
        twoSum(iArray , target);


    }
}
