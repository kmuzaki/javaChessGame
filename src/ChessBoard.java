/* Materials or references used:
 hackr.io, How To Create A Java Chess Game Application for Beginners, https://hackr.io/blog/how-to-build-a-java-chess-game-app

 */


public class ChessBoard {
    private Piece[][] board;

    public ChessBoard() {
        this.board = new Piece[8][8];
        setupPieces();       
    }

    private void setupPieces(){
        // Initial setup
    }
}