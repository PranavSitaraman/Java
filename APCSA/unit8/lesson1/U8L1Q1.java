public class U8_L1_Activity_One {

    public static int diagSum(int[][] array) {
        int total = 0;

        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if (row == col)
                    total += array[row][col];
            }
        }

        return total;
    }
}
