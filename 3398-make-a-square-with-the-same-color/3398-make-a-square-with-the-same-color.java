public class Solution {
    public static boolean canMakeSquare(char[][] grid) {
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 1; j++) {
                if (check(grid, i, j)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean check(char[][] grid, int row, int col) {
        int white = 0, black = 0;
        for (int i = row; i < row + 2; i++) {
            for (int j = col; j < col + 2; j++) {
                if (grid[i][j] == 'W') {
                    white++;
                } else if (grid[i][j] == 'B') {
                    black++;
                }
            }
        }
        return (white == 4 || black == 4) || (white == 1 && black == 3) || (white == 3 && black == 1);
    }
}