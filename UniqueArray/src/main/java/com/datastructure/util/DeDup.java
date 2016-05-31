package com.datastructure.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Gvenkatesh
 * 
 */
public class DeDup {
	public int[] randomIntegers = { 1, 2, 34, 34, 25, 1, 45, 3, 26, 85, 4, 34,
			86, 25, 43, 2, 1, 10000, 11, 16, 19, 1, 18, 4, 9, 3, 20, 17, 8, 15,
			6, 2, 5, 10, 14, 12, 13, 7, 8, 9, 1, 2, 15, 12, 18, 10, 14, 20, 17,
			16, 3, 6, 19, 13, 5, 11, 4, 7, 19, 16, 5, 9, 12, 3, 20, 7, 15, 17,
			10, 6, 1, 8, 18, 4, 14, 13, 2, 11 };

	public static void main(String[] args) {

	}

	/**
	 * This method will iterate the array and compare for duplicate in the new
	 * array. Elements order guaranteed in the resultant array.
	 * 
	 * @param inputArray
	 * @return
	 */
	public static int[] removeDuplicateByInteratingAndComparing(int[] inputArray) {
		// With same size as input array. After unique value, it will have
		// default value 0.
		int[] uniqueArrayFullLength = new int[inputArray.length];
		int uniqueCount = 0;
		for (int i = 0; i < inputArray.length; i++) {
			boolean alreadyExist = false;
			int value = inputArray[i];
			for (int k = 0; k <= uniqueCount; k++) {
				if (value == uniqueArrayFullLength[k]) {
					alreadyExist = true;
					break;
				}
			}
			if (!alreadyExist) {
				uniqueArrayFullLength[uniqueCount] = value;
				uniqueCount++;
			}
			alreadyExist = false;
		}
		int[] uniqueArrayExactLength = new int[uniqueCount];
		for (int k = 0; k < uniqueCount; k++) {
			uniqueArrayExactLength[k] = uniqueArrayFullLength[k];
		}
		return uniqueArrayExactLength;
	}

	/**
	 * This method uses Set interface to remove duplicate. Elements order not
	 * guaranteed in the resultant array.
	 * 
	 * @param inputArray
	 * @return
	 */
	public static int[] removeDuplicateUsingSet(int[] inputArray) {
		Set<Integer> uniqueData = new HashSet<>();
		for (int i : inputArray) {
			uniqueData.add(i);
		}
		int[] uniqueArray = new int[uniqueData.size()];
		int j = 0;
		for (int i : uniqueData) {
			uniqueArray[j++] = i;
		}
		return uniqueArray;
	}

	/**
	 * This method uses List interface to remove duplicate by validating.
	 * Elements order guaranteed in the resultant array.
	 * 
	 * @param inputArray
	 * @return
	 */
	public static int[] removeDuplicateUsingList(int[] inputArray) {
		List<Integer> uniqueData = new ArrayList<>();
		for (int i : inputArray) {
			if (!uniqueData.contains(i)) {
				uniqueData.add(i);
			}
		}
		int[] uniqueArray = new int[uniqueData.size()];
		int j = 0;
		for (int i : uniqueData) {
			uniqueArray[j++] = i;
		}
		return uniqueArray;
	}

}
