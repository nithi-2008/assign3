import java.util.Scanner;

public class assign8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        long temp = number;
        int count = 0;

        while (temp > 0) {
            count++;
            temp = temp / 10;
        }

        int[] digits = new int[count];
        int[] frequency = new int[10];

        temp = number;
        int index = 0;

        while (temp > 0) {
            digits[index] = (int)(temp % 10);
            frequency[digits[index]]++;
            temp = temp / 10;
            index++;
        }
