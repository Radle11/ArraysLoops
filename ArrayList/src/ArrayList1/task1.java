package ArrayList1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class task1 {
	/**
	 * Write a static method that will accept ArrayList as parameter, and will return arrayList.
	 * This method will return ordered ArrayList will missed numbers between 0 and max number that ArrayList has.
	 * For Example:
	 * [2,6,4,9,10] ->[0,1,3,5,7,8]
	 * [-5,5,6,7]   ->[0,1,2,3,4]
	 * [-2,-5,0 ]   ->[]
	 */
	
	public static ArrayList<Integer> method1(List<Integer>nums) {
		Collections.sort(nums);
		Integer maxNum=nums.get(nums.size()-1);
		ArrayList<Integer>missedNumbers=new ArrayList<>();
		for(int i=0;i<maxNum;i++) {
			if(nums.contains(i)) {
				
			}else {
				missedNumbers.add(i);
			}
		}
			return missedNumbers;
	}
	
	
	public static void main(String[]args) {
		List<Integer>num1=Arrays.asList(2,5,-8,7,10);//directly give values for List
		System.out.println(method1(num1));
		
		List<Integer>num2=Arrays.asList(-8,-5,-788);
		System.out.println(method1(num2));
		
		List<Integer>num3=Arrays.asList(0,0,0,0);
		System.out.println(method1(num3));
		
		
	}

}
