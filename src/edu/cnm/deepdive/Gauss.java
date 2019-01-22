package edu.cnm.deepdive;

import java.util.Scanner;

public class Gauss {
  public static final int DEFAULT_UPPER_LIMIT = 100;

  public static void main(String[] args) {
    int upperLimit = DEFAULT_UPPER_LIMIT;
    Scanner scanner = new Scanner(System.in); // Create Instance of Scanner Class, Using System.in as source.
    System.out.println("Upper limit: ");
    while (scanner.hasNextInt()) {
      upperLimit = scanner.nextInt();
      long sum = triangleSum(upperLimit);
      System.out.printf("Sum from 1 to %,d = %,d%n", upperLimit, sum);
      System.out.println("Upper limit: ");
    }
  }

  public static long triangleSum(int upperLimit)  {
    long sum = 0;
    for (int i =1; i <= upperLimit; i++)  {
      sum += i;
    }
    return sum;
  }
}

