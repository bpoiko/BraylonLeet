import java.util.*;


public class bin{
    public boolean searchMatrix(int[][]matrix, int target){
        int low = 0;
        int high = (matrix.length * matrix[0].length) - 1;
        int mid = 0;
        if(matrix.length == 0 || matrix[0].length == 0){
            return false; // empty rows and or columns
        }
        while(low <= high){
            mid = low + (high - low) / 2;
            //This line below is a work of art, the integer division will isolate the row, while the modulo division will isolate the column
            if(matrix[mid / matrix[0].length][mid % matrix[0].length] == target){
                return true;
            }else if(target > matrix[mid / matrix[0].length][mid % matrix[0].length]){
                low = mid + 1; // just like good old binary search
            }else{
                high = mid - 1; // too big get smaller
            }
        }
        return false;
    }
}