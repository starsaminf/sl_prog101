package chess;

import java.util.ArrayList;
class Queen extends Piece {
    Queen(final Color color, final Position source) {
        super.setColor(color);
        super.setSymbol(Symbol.Q);
        super.setStatus(Status.ALIVE);
        super.setPosition(source);
    }

    public ArrayList<Position> getPosibleMoves(final ChessBoard chb) {
        ArrayList<Position> array = new ArrayList<Position>();
        return array;
    }

    public void checkmate() {
    }
}
