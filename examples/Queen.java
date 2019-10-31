public class Queen implements ChessPiece {

    boolean isWhite;

    public Queen(boolean isWhite) {
        this.isWhite = isWhite;
    }

    @Override
    public String movement() {
        return "horizontally and diagonally";
    }

    @Override
    public int getPoints() {
        return ChessPiece.points[4];
    } 

    @Override
    public ChessPiece[] toArray(int size) {
        return new Queen[size];
    }
}
