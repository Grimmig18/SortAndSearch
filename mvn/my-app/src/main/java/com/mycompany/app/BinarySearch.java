public class BinarySearch{
    int[] numbers;

    /**
     * numbersArray must be a sorted array!
     * @param numbersArray
     */
    public BinarySearch(int[] numbersArray){
        numbers = numbersArray;
    }

    /**
     * Searches for the given number in the array. If it's not inside the array, return value wil be -1.
     * @param searchedNumber
     * @return index of the searched number in the array
     */
    public int searchNumber(int searchedNumber){
        return searchNumberRekursiv(searchedNumber, 0,numbers.length);
    }
    private int searchNumberRekursiv(int searchedNumber, int fromIndex, int toIndex){
        int middle = ((int)(fromIndex - toIndex)/2) + fromIndex;
        if(numbers[middle]>searchedNumber){
            return searchNumberRekursiv(searchedNumber,fromIndex,middle-1);
        }else if(numbers[middle]<searchedNumber){
            return searchNumberRekursiv(searchedNumber,middle+1,toIndex);
        }else if(numbers[middle]==searchedNumber)return middle;
        else return -1;
    }

}