class Main48 {
    
    public void rotate(int[][] matrix) {
        int length = matrix.length;
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                list.add(matrix[i][j]);
            }
        }
        
        for (int i = 0; i < length; i++) {
            for (int j = length - 1; j >= 0; j--) {
                matrix[j][i] = list.remove(list.size() - 1);
            }
        }
    }

    public void rotate(int[][] matrix) {
        for(int i=0, temp=0, n=matrix.length-1; i<=n/2; i++) {
            for(int j=i; j<n-i; j++) {
                temp = matrix[j][n-i];
                matrix[j][n-i] = matrix[i][j];
                matrix[i][j] = matrix[n-j][i];
                matrix[n-j][i] = matrix[n-i][n-j];
                matrix[n-i][n-j] = temp;
            }
        }
    }
    
}

