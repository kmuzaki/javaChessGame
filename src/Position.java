/*
 This class represents piece's location within the board in rows and columns
 */

public class Position {
    private int row;
    private int column;
    
    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }
}
