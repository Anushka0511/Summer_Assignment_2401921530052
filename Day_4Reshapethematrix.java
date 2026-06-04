class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
          int m = mat.length;
        int n = mat[0].length;

        // Agar reshape possible nahi hai
        if (m * n != r * c) {
            return mat;
        }

        int[][] result = new int[r][c];
        int row = 0, col = 0;

        // Row-wise traversal
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[row][col] = mat[i][j];
                col++;
                if (col == c) {
                    col = 0;
                    row++;
                } 
             }
        }
        return result;
    }
}
