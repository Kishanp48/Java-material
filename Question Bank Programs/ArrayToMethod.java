public class ArrayToMethod {
    public static void main(String[] args)
    {
        int[] numbers = {1, 2, 3, 4, 5};
    
        printArray(numbers);

    }
    public static void printArray(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
   }