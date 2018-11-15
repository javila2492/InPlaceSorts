public class Runner
{
    public static int[] array = new int[10000];
    public static void main(String[] args)
    {
        for(int i = 0; i < array.length - 1; i++)
        {
            array[i] = (int)(Math.random() * 10000) + 1;
        }
        double startTime = System.currentTimeMillis();
        InPlaceSorts.bubbleSort(array);
        double endTime = System.currentTimeMillis();
        System.out.println("Bubble Sort took " + (endTime - startTime) + " milliseconds.");
        startTime = System.currentTimeMillis();
        InPlaceSorts.selectionSort(array);
        endTime = System.currentTimeMillis();
        System.out.println("Selection Sort took " + (endTime - startTime) + " milliseconds.");
    }
}
