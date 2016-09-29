/**
 * Created by Vikram on 2016-09-29.
 */
public class Tile {
    private Piece piece;

    public Tile(){
        this.piece = null;
    }
    public Tile(Piece piece){
        this.piece = piece;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(){
        this.piece = null;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }
}