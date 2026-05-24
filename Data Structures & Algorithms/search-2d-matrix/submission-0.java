class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
         int m = matrix.length;
        int n = matrix[0].length;

        int left = 0, right = m  - 1, mid=-1;
        int row=-1;
        //find the row
        while(left<=right){
            mid=(left+ right)/2;
            if(target<matrix[mid][0])
                right =mid-1;
            else if(target>matrix[mid][n-1])
                left=mid+1;
            else{
                row=mid;
            break;
            }
        }

        if(row==-1)
            return false;

        //in a row look at the column  
        left = 0; right = n  - 1;
        while(left<=right){
            mid=(left+ right)/2;
            if(target<matrix[row][mid])
                right =mid-1;
            else if(target>matrix[row][mid])
                left=mid+1;
            else
            return true;
        }
        return false;
    }
}
