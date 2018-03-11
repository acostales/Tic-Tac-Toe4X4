package tictactoe.model;

import tictactoe.model.Field.Symbol;


public class Game //Game Logic
{
    private Board board;
    
    private int turnsCounter; // the number of turns since the start of the game
    private Symbol userSymbol; // the current players symbol
    private boolean didSomeoneWin; 
    

    public Game() 
    {
        board = new Board();
        
        turnsCounter = 0;
        userSymbol = Symbol.NONE;
        didSomeoneWin = false;
    }


    public void setFieldOwner(Symbol userSymbol, int x, int y) 
    {
        board.setFieldOwner(userSymbol, x, y);
    }


    public Symbol getFieldOwner(int x, int y) 
    {
        return board.getFieldOwner(x, y);
    }


    public void printField() 
    {
        System.out.println("---PRINTING FIELD---");
        for (int i = 0; i < 4; i++) 
        {
            for (int j = 0; j < 4; j++) 
            {
                System.out.print(getFieldOwner(i, j) + " ");
            }
            System.out.println();
        }
    }
    

    public boolean isGameOver() 
    {
        int[] scores = board.evaluateBoard();
        
        for (int score : scores) 
        {
            if (score == 4 || score == -4) 
            {
                didSomeoneWin = true;
                return true;
            }
        }
        
        if (turnsCounter == 16) return true; else return false;
    }

    public void incrementTurnsCounter() 
    {
        turnsCounter++;
    }
    

    public int getTurnsCounter() 
    {
        return turnsCounter;
    }

    public void setUserSymbol() //sets users symbol based on if its an even or odd turn
    {
        if (turnsCounter % 2 == 1) userSymbol = Symbol.X; else userSymbol = Symbol.O;
    }
    

    public Symbol getUserSymbol() 
    {
        return userSymbol;
    }
    

    public boolean getDidSomeoneWin() 
    {
        return didSomeoneWin;
    }

    /*
     * Increments the number of turns, and then sets the user symbol.
     */
    public void incTurnCounterAndSetUserSymbol() 
    {
        incrementTurnsCounter();
        setUserSymbol();
    }
}