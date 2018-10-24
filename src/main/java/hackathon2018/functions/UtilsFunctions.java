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

    public static List<Object[][]> players = new ArrayList<Object[][]>() {{
        add(playerA);
        add(playerB);
        add(playerC);
        add(playerD);
    }};

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

    public static int[][] playerABoolean = new int[][]{
            {1, 1, 1, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 1, 1, 1},
    };
    public static int[][] playerBBoolean = new int[][]{
            {1, 1, 1, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 1, 1, 1},
    };
    public static int[][] playerCBoolean = new int[][]{
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
    };
    public static int[][] playerDBoolean = new int[][]{
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
    };
    public static List<int[][]> playersBoolean = new ArrayList<int[][]>() {{
        add(playerABoolean);
        add(playerBBoolean);
        add(playerCBoolean);
        add(playerDBoolean);
    }};

    static int[][] OFFSETS = new int[][]{
            {0, 0},
            {0, 1},
            {1, 0},
            {1, 1},
    };

    static int vArrays = 2;
    static int hArrays = 2;

    /**
     * Combine To Array
     *
     * @param listOfArrays listOfArrays to consider
     * @param <T>
     * @return returns 2D combined array
     */
    public static <T> T[][] combineToArray(List<T[][]> listOfArrays) {
        T[][] result = null;
        if (listOfArrays == null && listOfArrays.isEmpty() || listOfArrays.size() != vArrays * hArrays) {
            return result;
        }
        int commonLength = listOfArrays.get(0).length;
        // Check for common length consistency
        for (T[][] array2D : listOfArrays) {
            if (array2D.length != commonLength) {
                return result;
            }
            for (T[] array1D : array2D) {
                if (array1D.length != commonLength) {
                    return result;
                }
            }
        }
        // Supply 2D output
        result = (T[][]) new Object[vArrays * commonLength][hArrays * commonLength];
        for (int c = 0; c < listOfArrays.size(); c++) {
            T[][] array = listOfArrays.get(c);
            for (int row = 0; row < array.length; row++) {
                for (int col = 0; col < array[row].length; col++) {
                    result[row + (OFFSETS[c][0] * commonLength)][col + (OFFSETS[c][1] * commonLength)] = array[row][col];
                }
            }
        }
        System.out.println(Arrays.deepToString(result));
        return result;
    }

    /**
     * Split To Arrays
     *
     * @param baseArray baseArray to consider
     * @param <T>
     * @return
     */
    public static <T> List<T[][]> splitToArrays(T[][] baseArray, int rows, int cols) {
        List<T[][]> listOfArrays = new ArrayList<>();
        T[][] array;
        if ((baseArray == null) && (baseArray.length == 0)) {
            return listOfArrays;
        }
        for (int c = 0; c < OFFSETS.length; c++) {
            array = (T[][]) new Object[rows][cols];
            for (int row = 0; row < array.length; row++) {
                for (int col = 0; col < array[row].length; col++) {
                    array[row][col] = baseArray[row + (OFFSETS[c][0] * rows)][col + (OFFSETS[c][1] * cols)];
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

    //-------------------------------------------------------------

    public static int[][] combineToArrayBoolean(List<int[][]> listOfArrays) {
        int[][] result = null;
        if (listOfArrays == null && listOfArrays.isEmpty() || listOfArrays.size() != vArrays * hArrays) {
            return result;
        }
        int commonLength = listOfArrays.get(0).length;
        // Check for common length consistency
        for (int[][] array2D : listOfArrays) {
            if (array2D.length != commonLength) {
                return result;
            }
            for (int[] array1D : array2D) {
                if (array1D.length != commonLength) {
                    return result;
                }
            }
        }
        // Supply 2D output
        result = new int[vArrays * commonLength][hArrays * commonLength];
        for (int c = 0; c < listOfArrays.size(); c++) {
            int[][] array = listOfArrays.get(c);
            for (int row = 0; row < array.length; row++) {
                for (int col = 0; col < array[row].length; col++) {
                    result[row + (OFFSETS[c][0] * commonLength)][col + (OFFSETS[c][1] * commonLength)] = array[row][col];
                }
            }
        }
        System.out.println(Arrays.deepToString(result));
        return result;
    }


    public static List<int[][]> splitToArraysBoolean(int[][] baseArray) {
        List<int[][]> listOfArrays = new ArrayList<>();
        int[][] array;
        int rows = baseArray.length / 2;
        int cols = baseArray[0].length / 2;
        if ((baseArray == null) && (baseArray.length == 0)) {
            return listOfArrays;
        }
        for (int c = 0; c < OFFSETS.length; c++) {
            array = new int[rows][cols];
            for (int row = 0; row < array.length; row++) {
                for (int col = 0; col < array[row].length; col++) {
                    array[row][col] = baseArray[row + (OFFSETS[c][0] * rows)][col + (OFFSETS[c][1] * cols)];
                }
            }
            listOfArrays.add(array);
        }
        return listOfArrays;
    }


    public static int countBoolean(int[][] array, int countable) {
        int count = 0;
        if ((array != null)) {
            for (int row = 0; row < array.length; row++) {
                for (int col = 0; col < array[row].length; col++) {
                    if (array[row][col] == countable) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static int[][] convertBoolToIntArr(int[][] boolArr) {
        int[][] intArr = null;
        if (boolArr != null && boolArr.length != 0){
            intArr = new int[boolArr.length][boolArr[0].length];
            for (int row = 0; row < boolArr.length; row++) {
                for (int col = 0; col < boolArr[row].length; col++) {
                    if (boolArr[row][col] == 1) {
                        intArr[row][col] = 1;
                    } else {
                        intArr[row][col] = 0;
                    }
                }
            }
        }
        System.out.println(Arrays.deepToString(intArr));
        return intArr;
    }

    public static boolean[][] convertIntToBoolArr(int[][] intArr) {
        boolean[][] boolArray = null;
        if (intArr != null && intArr.length != 0){
            boolArray = new boolean[intArr.length][intArr[0].length];
            for (int row = 0; row < intArr.length; row++) {
                for (int col = 0; col < intArr[row].length; col++) {
                    if (intArr[row][col] == 1) {
                        boolArray[row][col] = true;
                    } else {
                        boolArray[row][col] = false;
                    }
                }
            }
        }
        System.out.println(Arrays.deepToString(boolArray));
        return boolArray;
    }



    public int[][] compute(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] next = new int[rows][cols];
        // Compute next based on grid
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                int state = grid[i][j];
                // Count live neighbors!
                int sum = 0;
                int neighbors = countNeighbors(grid, i, j);
                if (state == 0 && neighbors == 3) {
                    next[i][j] = 1;
                } else if (state == 1 && (neighbors < 2 || neighbors > 3)) {
                    next[i][j] = 0;
                } else {
                    next[i][j] = state;
                }
            }
        }
        return next;
    }


    public int countNeighbors(int[][] grid, int x, int y) {
        int sum = 0;
        int rows = grid.length;
        int cols = grid[0].length;
        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
                int col = (x + i + cols) % cols;
                int row = (y + j + rows) % rows;
                sum += grid[col][row];
            }
        }
        sum -= grid[x][y];
        return sum;
    }


    public static <K> void main(String[] args) {


        countBoolean(playerABoolean, 1);
        splitToArraysBoolean(combineToArrayBoolean(playersBoolean));

        //        convertIntToBoolArr(convertBoolToIntArr(combineToArrayBoolean(playersBoolean)));
//        convertBoolToIntArr(combineToArrayBoolean(playersBoolean));
        combineToArrayBoolean(playersBoolean);
    }

}
