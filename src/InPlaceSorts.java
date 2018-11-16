import static java.lang.Integer.parseInt;

public class InPlaceSorts
{
    public static void insertionSort(int[] arr)
    {
        int a = 0;
        int b = 0;
        for(int i = 0; i < arr.length - 1; i++)
        {
            for(int j = i; j >= 0; j--)
            {
                if (arr[i] < arr[j])
                {
                    arr[i] = a;
                    arr[j] = b;
                    arr[i] = b;
                    arr[j] = a;
                }
            }
        }
    }

    public static void selectionSort(int[] arr)
    {
        int counter = 0;
        int lesser = 0;
        while(counter < arr.length - 1)
        {
            for(int i = counter; i < arr.length - 1; i++)
            {
                int a = arr[i];
                int b = arr[i + 1];
                if(a < b)
                {
                    lesser = a;
                }
            }
            arr[counter] = lesser;
            counter++;
        }
    }

    public static void bubbleSort(int[] arr)
    {
        boolean done = false;
        int a;
        int b;
        while(!done)
        {
            done = true;
            for(int i = 0; i < arr.length - 1; i++)
            {
                a = arr[i];
                b = arr[i + 1];
                if(a > b)
                {
                    arr[i] = b;
                    arr[i + 1] = a;
                    done = false;
                }
            }
        }
    }

    public static void bubbleSortAlpha(String[] arr)
    {
        boolean done = false;
        String a;
        String b;
        while(!done)
        {
            done = true;
            for(int i = 0; i < arr.length - 1; i++)
            {
                a = arr[i];
                b = arr[i + 1];
                if(a.compareTo(b) < 0)
                {
                    arr[i] = b;
                    arr[i + 1] = a;
                    done = false;
                }
            }
        }
    }
}
