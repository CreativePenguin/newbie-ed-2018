public interface ChessPiece {
    int[] points = {1, 3, 3, 5, 9};
    String movement();
    int getPoints();
    ChessPiece[] toArray(int size);
}
