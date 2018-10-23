package hackathon2018.functions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class UtilsFunctions {

    public static Object[][] playerA = new Object[][]{
            {"a", "a", "a", "a", "a", "a", "a", "a"},
            {"a", "a", "a", "a", "a", "a", "a", "a"},
            {"a", "a", "a", "a", "a", "a", "a", "a"},
            {"a", "a", "a", "a", "a", "a", "a", "a"},
            {"a", "a", "a", "a", "a", "a", "a", "a"},
            {"a", "a", "a", "a", "a", "a", "a", "a"},
            {"a", "a", "a", "a", "a", "a", "a", "a"},
            {"a", "a", "a", "a", "a", "a", "a", "a"},
    };

    public static Object[][] playerB = new Object[][]{
            {"b", "b", "b", "b", "b", "b", "b", "b"},
            {"b", "b", "b", "b", "b", "b", "b", "b"},
            {"b", "b", "b", "b", "b", "b", "b", "b"},
            {"b", "b", "b", "b", "b", "b", "b", "b"},
            {"b", "b", "b", "b", "b", "b", "b", "b"},
            {"b", "b", "b", "b", "b", "b", "b", "b"},
            {"b", "b", "b", "b", "b", "b", "b", "b"},
            {"b", "b", "b", "b", "b", "b", "b", "b"},
    };

    public static Object[][] playerC = new Object[][]{
            {"c", "c", "c", "c", "c", "c", "c", "c"},
            {"c", "c", "c", "c", "c", "c", "c", "c"},
            {"c", "c", "c", "c", "c", "c", "c", "c"},
            {"c", "c", "c", "c", "c", "c", "c", "c"},
            {"c", "c", "c", "c", "c", "c", "c", "c"},
            {"c", "c", "c", "c", "c", "c", "c", "c"},
            {"c", "c", "c", "c", "c", "c", "c", "c"},
            {"c", "c", "c", "c", "c", "c", "c", "c"},
    };

    public static Object[][] playerD = new Object[][]{
            {"d", "d", "d", "d", "d", "d", "d", "d"},
            {"d", "d", "d", "d", "d", "d", "d", "d"},
            {"d", "d", "d", "d", "d", "d", "d", "d"},
            {"d", "d", "d", "d", "d", "d", "d", "d"},
            {"d", "d", "d", "d", "d", "d", "d", "d"},
            {"d", "d", "d", "d", "d", "d", "d", "d"},
            {"d", "d", "d", "d", "d", "d", "d", "d"},
            {"d", "d", "d", "d", "d", "d", "d", "d"},
    };

    public static List<Object[][]> players = new ArrayList<Object[][]>() {{add(playerA); add(playerB); add(playerC); add(playerD);}};

    public static Object[][] multiple = new Object[][]{
            {"a", "a", "a", "a", "a", "a", "a", "a", "b", "b", "b", "b", "b", "b", "b", "b"},
            {"a", "a", "a", "a", "a", "a", "a", "a", "b", "b", "b", "b", "b", "b", "b", "b"},
            {"a", "a", "a", "a", "a", "a", "a", "a", "b", "b", "b", "b", "b", "b", "b", "b"},
            {"a", "a", "a", "a", "a", "a", "a", "a", "b", "b", "b", "b", "b", "b", "b", "b"},
            {"a", "a", "a", "a", "a", "a", "a", "a", "b", "b", "b", "b", "b", "b", "b", "b"},
            {"a", "a", "a", "a", "a", "a", "a", "a", "b", "b", "b", "b", "b", "b", "b", "b"},
            {"a", "a", "a", "a", "a", "a", "a", "a", "b", "b", "b", "b", "b", "b", "b", "b"},
            {"a", "a", "a", "a", "a", "a", "a", "a", "b", "b", "b", "b", "b", "b", "b", "b"},
            {"c", "c", "c", "c", "c", "c", "c", "c", "d", "d", "d", "d", "d", "d", "d", "d"},
            {"c", "c", "c", "c", "c", "c", "c", "c", "d", "d", "d", "d", "d", "d", "d", "d"},
            {"c", "c", "c", "c", "c", "c", "c", "c", "d", "d", "d", "d", "d", "d", "d", "d"},
            {"c", "c", "c", "c", "c", "c", "c", "c", "d", "d", "d", "d", "d", "d", "d", "d"},
            {"c", "c", "c", "c", "c", "c", "c", "c", "d", "d", "d", "d", "d", "d", "d", "d"},
            {"c", "c", "c", "c", "c", "c", "c", "c", "d", "d", "d", "d", "d", "d", "d", "d"},
            {"c", "c", "c", "c", "c", "c", "c", "c", "d", "d", "d", "d", "d", "d", "d", "d"},
            {"c", "c", "c", "c", "c", "c", "c", "c", "d", "d", "d", "d", "d", "d", "d", "d"},
    };

    //----------------------------------------------------------------------------------------

    public static boolean[][] playerABoolean = new boolean[][]{
            {true, true, true, true, true, true, true, true},
            {true, true, true, true, true, true, true, true},
            {true, true, true, true, true, true, true, true},
            {true, true, true, true, true, true, true, true},
            {true, true, true, true, true, true, true, true},
            {true, true, true, true, true, true, true, true},
            {true, true, true, true, true, true, true, true},
            {true, true, true, true, true, true, true, true},
    };
    public static boolean[][] playerBBoolean = new boolean[][]{
            {true, true, true, true, true, true, true, true},
            {true, true, true, true, true, true, true, true},
            {true, true, true, true, true, true, true, true},
            {true, true, true, true, true, true, true, true},
            {true, true, true, true, true, true, true, true},
            {true, true, true, true, true, true, true, true},
            {true, true, true, true, true, true, true, true},
            {true, true, true, true, true, true, true, true},
    };
    public static boolean[][] playerCBoolean = new boolean[][]{
            {false, false, false, false, false, false, false, false},
            {false, false, false, false, false, false, false, false},
            {false, false, false, false, false, false, false, false},
            {false, false, false, false, false, false, false, false},
            {false, false, false, false, false, false, false, false},
            {false, false, false, false, false, false, false, false},
            {false, false, false, false, false, false, false, false},
            {false, false, false, false, false, false, false, false},
    };
    public static boolean[][] playerDBoolean = new boolean[][]{
            {false, false, false, false, false, false, false, false},
            {false, false, false, false, false, false, false, false},
            {false, false, false, false, false, false, false, false},
            {false, false, false, false, false, false, false, false},
            {false, false, false, false, false, false, false, false},
            {false, false, false, false, false, false, false, false},
            {false, false, false, false, false, false, false, false},
            {false, false, false, false, false, false, false, false},
    };
    public static List<boolean[][]> playersBoolean = new ArrayList<boolean[][]>() {{add(playerABoolean); add(playerBBoolean); add(playerCBoolean); add(playerDBoolean);}};


    static int[][] OFFSETS = new int[][]{
            {0, 0},
            {0, 8},
            {8, 0},
            {8, 8},
    };

    static int vArrays = 2;
    static int hArrays = 2;
    static int arrayRows = 8;
    static int arrayColumns = 8;

    /**
     * Combine To Array
     * @param listOfArrays listOfArrays to consider
     * @param <T>
     * @return returns 2D combined array
     */
    public static <T> T[][] combineToArray(List<T[][]> listOfArrays) {
        T[][] result = null;
        if (listOfArrays == null && listOfArrays.isEmpty() || listOfArrays.size() != vArrays * hArrays) { return result; }
        int commonLength = listOfArrays.get(0).length;
        // Check for common length consistency
        for (T[][] array2D : listOfArrays) {
            if (array2D.length != commonLength) { return result; }
            for (T[] array1D : array2D) { if (array1D.length != commonLength) { return result; }
            }
        }
        // Supply 2D output
        result = (T[][]) new Object[vArrays * commonLength][hArrays * commonLength];
        for (int c = 0; c < listOfArrays.size(); c++) {
            T[][] array = listOfArrays.get(c);
            for (int row = 0; row < array.length; row++) {
                for (int col = 0; col < array[row].length; col++) {
                    result[row + OFFSETS[c][0]][col + OFFSETS[c][1]] = array[row][col];
                }
            }
        }
        System.out.println(Arrays.deepToString(result));
        return result;
    }

    /**
     * Combine To Array
     * @param listOfArrays listOfArrays to consider
     * @return returns 2D combined array
     */
    public static boolean[][] combineToArrayBoolean(List<boolean[][]> listOfArrays) {
        boolean[][] result = null;
        if (listOfArrays == null && listOfArrays.isEmpty() || listOfArrays.size() != vArrays * hArrays) { return result; }
        int commonLength = listOfArrays.get(0).length;
        // Check for common length consistency
        for (boolean[][] array2D : listOfArrays) {
            if (array2D.length != commonLength) { return result; }
            for (boolean[] array1D : array2D) { if (array1D.length != commonLength) { return result; }
            }
        }
        // Supply 2D output
        result = new boolean[vArrays * commonLength][hArrays * commonLength];
        for (int c = 0; c < listOfArrays.size(); c++) {
            boolean[][] array = listOfArrays.get(c);
            for (int row = 0; row < array.length; row++) {
                for (int col = 0; col < array[row].length; col++) {
                    result[row + OFFSETS[c][0]][col + OFFSETS[c][1]] = array[row][col];
                }
            }
        }
        System.out.println(Arrays.deepToString(result));
        return result;
    }

    /**
     * Split To Arrays
     * @param baseArray baseArray to consider
     * @param <T>
     * @return
     */
    public static <T> List<T[][]> splitToArrays(T[][] baseArray) {
        List<T[][]> listOfArrays = new ArrayList<>();
        T[][] array;
        if ((baseArray == null) && (baseArray.length == 0)) { return listOfArrays; }
        for (int c = 0; c < OFFSETS.length; c++) {
            array = (T[][]) new Object[arrayRows][arrayColumns];
            for (int row = 0; row < array.length; row++) {
                for (int col = 0; col < array[row].length; col++) {
                    array[row][col] = baseArray[row + OFFSETS[c][0]][col + OFFSETS[c][1]];
                }
            }
            listOfArrays.add(array);
        }
        return listOfArrays;
    }

    /**
     * Count Countable
     *
     * @param array
     * @param countable
     * @param <T>
     * @param <K>
     * @return returns number of countable
     */
    public static <T, K> int count(T[][] array, K countable) {
        int count = 0;
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if (array[row][col] == countable) {
                    count++;
                }
            }
        }
        return count;
    }

    public static <K> void main(String[] args) {
        combineToArrayBoolean(playersBoolean);
        splitToArrays(multiple);
    }

}
