package com.datastructure.util;

import java.util.Random;

import org.junit.Test;

public class DeDupTest {
	@Test
	public void testDeDup() {
		DeDup deDup = new DeDup();
		int[] randomIntegers = deDup.randomIntegers;// generateRandomNumber(10000);
		Long startTime = getTime();
		int[] result0 = DeDup
				.removeDuplicateByInteratingAndComparing(randomIntegers);
		Long timeTaken = getTime() - startTime;
		printArray(result0);
		System.out.println("Time take in Nano :" + timeTaken);

		startTime = getTime();
		int[] result2 = DeDup.removeDuplicateUsingSet(randomIntegers);
		timeTaken = getTime() - startTime;
		printArray(result2);
		System.out.println("Time take in Nano :" + timeTaken);

		startTime = getTime();
		int[] result3 = DeDup.removeDuplicateUsingList(randomIntegers);
		timeTaken = getTime() - startTime;
		printArray(result3);
		System.out.println("Time take in Nano :" + timeTaken);

	}

	private long getTime() {
		return System.nanoTime();
	}

	public void printArray(int[] array) {
		System.out.println();
		for (int i : array) {
			System.out.print(i + ", ");
		}
		System.out.println();
	}

	private int[] generateRandomNumber(int size) {
		int[] randomNumbers = new int[size];
		Random randomGenerator = new Random();
		for (int i = 0; i < size; i++) {
			randomNumbers[i] = randomGenerator.nextInt();
		}
		return randomNumbers;
	}

}
