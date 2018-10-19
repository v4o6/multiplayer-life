package com.ze.test.Fitsner;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


public class FitMultiPlayer {


    public static Object[][] arr = new Object[][]
            {
                    {"a", "a", "a", "a"},
                    {"a", "a", "a", "a"},
                    {"a", "a", "a", "a"},
                    {"a", "a", "a", "a"},
                    {"b", "b", "b", "b"},
                    {"b", "b", "b", "b"},
                    {"b", "b", "b", "b"},
                    {"b", "b", "b", "b"},
                    {"c", "c", "c", "c"},
                    {"c", "c", "c", "c"},
                    {"c", "c", "c", "c"},
                    {"c", "c", "c", "c"},
                    {"d", "d", "d", "d"},
                    {"d", "d", "d", "d"},
                    {"d", "d", "d", "d"},
                    {"d", "d", "d", "d"},
            };

    public static Object[][] game = new Object[][]
            {
                    {1, 0, 1, 0, 0},
                    {1, "b", 1, 0, 1},
                    {1, 0, 1, 0, 1},
                    {1, 1, 1, "b", 1},
                    {0, 0, 1, 1, 1},
                    {1, "a", 1, 0, 1},
                    {0, 0, 1, 0, 1},
                    {0, 0, 1, 0, "c"},
                    {1, 0, 1, 0, 1},
                    {"b", 0, 1, 0, 1},
                    {0, 0, 1, 1, 1},
                    {1, 0, "c", 0, 1},
            };


    /**
     * Split To Arrays
     * @param baseArray baseArray to consider
     * @param numberOfArrays numberOfArrays to consider (number of players)
     * @param <T>
     * @return returns list of grouped player' T[][] arrays
     */
    public static <T> List<T[][]> splitToArrays(T[][] baseArray, int numberOfArrays) {
//        List<T[][]> listOfArrays = new ArrayList<>();
        List<T[][]> listOfArrays = null;
        // if %, gives the remainder, then false
        if ((baseArray.length != 0) && (baseArray!=null) && ((baseArray.length % numberOfArrays) == 0) && ((baseArray[0].length % numberOfArrays) == 0)) {
            int arrayLength = baseArray.length;
            int arrayWayPoint = (int) Math.floor(arrayLength / numberOfArrays);
            int arrayWayFromPoint = 0;
            int arrayWayToPoint = arrayWayPoint;
            for (int array = 0; array < numberOfArrays; array++) {
                listOfArrays.add(java.util.Arrays.copyOfRange(baseArray, arrayWayFromPoint, arrayWayToPoint));
                arrayWayFromPoint = arrayWayToPoint;
                arrayWayToPoint = arrayWayToPoint + arrayWayPoint;
            }
        }
        return listOfArrays;
    }

    /**
     * Combine To Array
     * @param listOfArrays listOfArrays to consider
     * @param <T>
     * @return returns combined T[][] array
     */
    public static <T> T[][] combineToArray(List<T[][]> listOfArrays) {
        T[][] result = null;
        if(listOfArrays!=null && !listOfArrays.isEmpty()){
            int length = 0;
            for (T[][] array : listOfArrays) { length += array.length; }
            result = (T[][]) Array.newInstance(listOfArrays.get(0).getClass().getComponentType(), length);
            int copied = 0;
            for (T[][] array : listOfArrays) {
                System.arraycopy(array, 0, result, copied, array.length);
                copied += array.length;
            }
        }
        return result;
    }


    /**
     * Count
     * @param array
     * @param countable
     * @param <T>
     * @param <K>
     * @return returns number of countable
     */
    public static <T, K> int count(T[][] array, K countable){
        int count = 0;
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if(array[row][col] == countable){
                    count++;
                }
            }
        }
        return count;
    }


    /**
     * Playing stuff
     * @param arrays
     * @param <T>
     * @return
     */
    static <T> T[] joinArrayGeneric(T[]... arrays) {
        int length = 0;
        for (T[] array : arrays) {
            length += array.length;
        }
        final T[] result = (T[]) Array.newInstance(arrays[0].getClass().getComponentType(), length);
        int offset = 0;
        for (T[] array : arrays) {
            System.arraycopy(array, 0, result, offset, array.length);
            offset += array.length;
        }
        return result;
    }

    /**
     * Playing stuff
     * @param items
     * @param maxSubArraySize
     * @param <T>
     * @return
     */
    public static <T> List<T[]> splitArray(T[] items, int maxSubArraySize) {
        List<T[]> result = new ArrayList<T[]>();
        if (items == null || items.length == 0) {
            return result;
        }
        int from = 0;
        int to = 0;
        int slicedItems = 0;
        while (slicedItems < items.length) {
            to = from + Math.min(maxSubArraySize, items.length - to);
            T[] slice = java.util.Arrays.copyOfRange(items, from, to);
            result.add(slice);
            slicedItems += slice.length;
            from = to;
        }
        return result;
    }


    /**
     * Playing stuff
     * @param args
     */
    public static void main(String[] args) {

        int count_B = count(game, "b");
        int count_C = count(game, "c");
        int countB = count(arr, "b");
        int countA = count(arr, "a");

        combineToArray(splitToArrays(game, 4));

        combineToArray(splitToArrays(arr, 4));
        combineToArray(splitToArrays(arr, 4));
    }

}
