public class BinarySearchTest{

    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i<100;i++){
            array[i] = i*2;
        }

        BinarySearch bs = new BinarySearch(array);
    }
}