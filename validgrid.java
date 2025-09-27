import java.util.*;

public class validgrid{
    public boolean isValidSudoku(char[][]board){
        Set<Character>[] rowStorage = new HashSet[9];
        Set<Character>[] columnStorage= new HashSet[9];
        Set<Character>[]  boxStorage = new HashSet[9];
        for(int i = 0; i < 9; i++){
            rowStorage[i] = new HashSet<>();
            columnStorage[i] = new HashSet<>();
            boxStorage[i] = new HashSet<>();
        }

        for(int r = 0; r < board.length; r++){
            for(int c = 0; c < board[0].length; c++){
                char val = board[r][c];
                if(val == '.'){
                    continue;
                }
                if(val < '1' || val > '9'){
                    return false;
                }
                
                if(!rowStorage[r].add(val)) return false;
                rowStorage[r].add(val);

                if(!columnStorage[c].add(val)) return false;
                columnStorage[c].add(val);

                int boxIndex = (r / 3 ) * 3 + (c / 3);
                if(!boxStorage[boxIndex].add(val)) return false;
                boxStorage[boxIndex].add(val);

            }
        }
        return true;   
    }
}