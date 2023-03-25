// write a java program to copy all the elements of an array to another array.
import java.util.Scanner;
public class ArrayCopy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("size of the array: ");
        int size = input.nextInt();

        int[] arr1 = new int[size];
        int[] arr2 = new int[size];

        System.out.println("elements of the array:");

        for (int i = 0; i < size; i++) {
            arr1[i] = input.nextInt();
        }

        for (int i = 0; i < size; i++) {
            arr2[i] = arr1[i];
        }

        System.out.println("copied array:");

        for (int i = 0; i < size; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}

