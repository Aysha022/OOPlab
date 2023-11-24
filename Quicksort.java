import java.util.Arrays;
import java.io.*;

public class QuickSortExample
{

    public static void main(String[] args) throws IOException
    {
        BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of names: ");
        int n=Integer.parseInt(r.readLine());
        String[] names=new String[n];
        System.out.println("Enter "+n+" names in new lines: ");
        for(int i=0;i<n;i++)
        {
          names[i]=r.readLine();
        }
        
        Quicksort sort=new Quicksort(names);
        Quicksort.quickSort(names,0,names.length-1);
        
        System.out.println("Sorted Names: ");
        for(int i=0;i<n;i++)
        {
         System.out.println(names[i]);
        }
    }
}

class Quicksort
{
    private String[] arr;
    
    public Quicksort(String[] arr)
    {
      this.arr=arr;
    }
    
    public static void quickSort(String[] arr, int low, int high) 
    {
        if (low < high) 
        {
            int partitionIndex = partition(arr, low, high);

            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }

    public static int partition(String[] arr, int low, int high) 
    {
        String pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) 
        {
            if (arr[j].compareTo(pivot) <= 0)
            {
               i++;

      
                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        String temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
    }
  
