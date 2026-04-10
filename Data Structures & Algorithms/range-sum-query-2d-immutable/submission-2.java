class NumMatrix {

    int[][] mat;

    public NumMatrix(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;

        mat = new int[n + 1][m + 1];

        for(int i = 0; i < n; i++){
            int res = 0;
            for(int j = 0; j < m; j++){ 
                res += matrix[i][j];
                mat[i + 1][j + 1] = res + mat[i][j + 1];
            }
        }
            
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {    
        row1++;
        row2++;
        col1++;
        col2++;

        return mat[row2][col2] - mat[row1 - 1][col2] 
            - mat[row2][col1 - 1] + mat[row1 - 1][col1 - 1];
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */