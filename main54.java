class Main54 {
    
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<Integer>();
        
        if ( matrix == null || matrix.length == 0) {
            return res;
        }
        
        int rowBegin = 0;
        int rowEnd = matrix.length - 1;
        int colBegin = 0;
        int colEnd = matrix[0].length - 1;
        
        while( rowBegin <= rowEnd && colBegin <= colEnd) {
            //traverse right
            for(int i=colBegin;i<=colEnd;i++)
                res.add(matrix[rowBegin][i]);
            rowBegin++;
            
            //traverse down
            for(int i=rowBegin;i<=rowEnd;i++)
                res.add(matrix[i][colEnd]);
            colEnd--;
            
            //traverse left
            if(rowBegin <= rowEnd) {
                for(int i=colEnd;i>=colBegin;i--)
                    res.add(matrix[rowEnd][i]);
                rowEnd--;
            }
            
            //traverse up
            if(colBegin <= colEnd) {
                for(int i=rowEnd;i>=rowBegin;i--)
                    res.add(matrix[i][colBegin]);
                colBegin++;
            }
        }
        
        return res;
    }
}

