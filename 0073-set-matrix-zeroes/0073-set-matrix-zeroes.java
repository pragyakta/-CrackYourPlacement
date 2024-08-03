class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] dup = new int[n][m];
        
        for(int i = 0; i< n;i++){
            for(int j = 0 ;j < m;j++){
                dup[i][j] = matrix[i][j];
            }
        }
        
        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                if(matrix[i][j] == 0){
                    for(int k = j;k < m;k++){
                        dup[i][k] = 0;
                    }
                    for(int k = j;k >= 0;k--){
                        dup[i][k] = 0;
                    }
                    for(int k = i;k < n;k++){
                        dup[k][j] = 0;
                    }
                    for(int k = i;k >= 0;k--){
                        dup[k][j] = 0;
                    }   
                }
            }
        }
        for(int i = 0; i< n;i++){
            for(int j = 0 ;j < m;j++){
                matrix[i][j] = dup[i][j] ;
            }
        }
    }
}