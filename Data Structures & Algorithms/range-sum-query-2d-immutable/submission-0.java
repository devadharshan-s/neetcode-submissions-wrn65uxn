class NumMatrix {

    int[][] mat;

    public NumMatrix(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;

        mat = new int[n][m];

        for(int i = 0; i < n; i++)
            for(int j = 0; j < m; j++) mat[i][j] = matrix[i][j];
            
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {

        int res = 0;

        for(int i = row1; i <= row2; i++)
            for(int j = col1; j <= col2; j++) res += mat[i][j];

        return res;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */