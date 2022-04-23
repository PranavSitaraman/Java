public class U8_L1_Activity_Two {

    public static int[][] multTable(int col, int rows) {
        int[][] table = new int[col][rows];

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < rows; j++) {
                table[i][j] = i * j;
            }
        }

        return table;
    }
}
