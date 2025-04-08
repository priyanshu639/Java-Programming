import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

       
        System.out.println("Enter the sorted array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        
        System.out.print("Enter the target sum: ");
        int target = sc.nextInt();

        boolean found = findPair(arr, target);

        if (!found) {
            System.out.println("No pair found.");
        }

        sc.close();
    }

    public static boolean findPair(int arr[], int target) {
        int i = 0, j = arr.length - 1; 

        while (i < j) {
            int sum = arr[i] + arr[j];

            if (sum == target) {
                System.out.println("Pair found: (" + arr[i] + ", " + arr[j] + ")");
                return true; 
            } else if (sum < target) {
                i++; 
            } else {
                j--; 
            }
        }

        return false; 
    }
}
