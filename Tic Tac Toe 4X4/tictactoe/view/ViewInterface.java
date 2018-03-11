package tictactoe.view;

import tictactoe.model.Field.Symbol;

import javax.swing.JButton;

public interface ViewInterface
{
    public void updateBoard(Symbol owner, JButton button); //changes a square to the users symbol
    
    public void informWin(Symbol userSymbol); //tells user who won

    public void informTie();//tells user if there's a tie
}
