/**
 * Created by Vikram on 2016-09-29.
 */
public class PieceLocation {
    private int row, col;

    public PieceLocation(int newRow, int newCol){
        row = newRow;
        col = newCol;
    }

    public void setLocation(int newRow, int newCol){
        row = newRow;
        col = newCol;
    }

    public int getRow(){
        return row;
    }

    public int getCol(){
        return col;
    }
}
