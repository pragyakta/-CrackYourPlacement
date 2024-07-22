class Solution {
    public void setZeroes(int[][] matrix) {
        int[] dummy1 = new int[matrix.length];
        int[] dummy2 = new int[matrix[0].length];
        Arrays.fill(dummy1,-1); //for rows zeros
        Arrays.fill(dummy2,-1); //for cols zeros
        
        for(int row=0 ; row < matrix.length; row++){
            for(int col=0 ; col < matrix[row].length; col++){
                if(matrix[row][col]==0){  //if this element is zero
                    dummy1[row]=0;       //set this index to zero
                    dummy2[col]=0;        
                }
            }
        }
        for(int row=0 ; row < matrix.length; row++){
            for(int col=0 ; col < matrix[row].length; col++ ){
                if(dummy1[row]==0 || dummy2[col]==0){ //if any of the array's element on this index is zero
                    matrix[row][col]=0; //set those index as zero
                }
            }
        }
        
    }
}