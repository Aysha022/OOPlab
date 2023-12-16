import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BinarySearchExample
 {
    public static void main(String arg[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of elements");
        int num = Integer.parseInt(br.readLine());
        int a[] = new int[num];
        System.out.println("Please enter "+num+" numbers");
        for (int i = 0; i < num; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("Enter the element to search");
        int find = Integer.parseInt(br.readLine());
        int index = search(a, find);
        if (index != -1) {
            System.out.println("Element found : " + (index+1));
        } else {
            System.out.println("Element not found");
        }
    }

    public static int search(int ar[], int find) 
  {
        int start = 0;
        int end = ar.length - 1;
        int mid;
        while (start <= end) 
       {
            mid = (start + end) / 2;
            if (ar[mid] == find) {
                return mid;
            } else if (ar[mid] < find) {
                start = mid + 1;
            } else if (ar[mid] > find) {
                end = mid - 1;
            }
        }
        return -1;
    }
}
