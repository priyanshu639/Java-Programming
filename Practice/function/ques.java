public class ques {
    public static void BubbleSort(int A[], int n) {
        int flag;
        for (int i = 0; i < n - 1; i++) {
            flag = 0; 
            for (int j = 0; j < n - i - 1; j++) { 
                if (A[j] > A[j + 1]) {
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                    flag = 1; 
                }
            }           
            if (flag == 0) break;
        }       
    }
    public static void main(String[] args) {
        int[] arr = {8, 3, 2, 5, 7};
        int n = arr.length;
        BubbleSort(arr, n); 
        System.out.println("Array after sorting:");
        for (int i=0;i<n;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

