package tictactoe;

import tictactoe.model.Board;
import tictactoe.model.Field.Symbol;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BoardTest //tests many win conditions
{
   
    public BoardTest() //defaul constructor
    {
    }

   
    @Before
    public void setUp()
    {
    }

    @After
    public void tearDown()
    {
    }

    @Test
    public void newBoard() 
    {
        Board board = new Board();
        // board.updateBoard(Symbol.X, 1, 2); => FAILS :)
        int[] scores = board.evaluateBoard();

        for (int score : scores) 
        {
            assertEquals(0, score);
        }
    }

    @Test
    public void firstRowXWins() 
    {
        Board board = new Board();

        board.setFieldOwner(Symbol.X, 0, 0);
        board.setFieldOwner(Symbol.X, 0, 1);
        board.setFieldOwner(Symbol.X, 0, 2);
        board.setFieldOwner(Symbol.X, 0, 3);
        
        int[] scores = board.evaluateBoard(); 
        assertEquals(4, scores[0]);        
    }

    @Test
    public void firstRowOWins() 
    {
        Board board = new Board();

        board.setFieldOwner(Symbol.O, 0, 0);
        board.setFieldOwner(Symbol.O, 0, 1);
        board.setFieldOwner(Symbol.O, 0, 2);
        board.setFieldOwner(Symbol.O, 0, 3);

        int[] scores = board.evaluateBoard(); 
        assertEquals(-4, scores[0]);
    }

    @Test
    public void secondRowXWins() 
    {
        Board board = new Board();

        board.setFieldOwner(Symbol.X, 1, 0);
        board.setFieldOwner(Symbol.X, 1, 1);
        board.setFieldOwner(Symbol.X, 1, 2);
        board.setFieldOwner(Symbol.X, 1, 3);

        int[] scores = board.evaluateBoard(); 
        assertEquals(4, scores[1]);
    }

    @Test
    public void secondRowOWins() 
    {
        Board board = new Board();

        board.setFieldOwner(Symbol.O, 1, 0);
        board.setFieldOwner(Symbol.O, 1, 1);
        board.setFieldOwner(Symbol.O, 1, 2);
        board.setFieldOwner(Symbol.O, 1, 3);

        int[] scores = board.evaluateBoard(); 
        assertEquals(-4, scores[1]);
    }

    @Test
    public void thirdRowXWins() 
    {
        Board board = new Board();

        board.setFieldOwner(Symbol.X, 2, 0);
        board.setFieldOwner(Symbol.X, 2, 1);
        board.setFieldOwner(Symbol.X, 2, 2);
        board.setFieldOwner(Symbol.X, 2, 3);

        int[] scores = board.evaluateBoard(); 
        assertEquals(4, scores[2]);
    }

    @Test
    public void thirdRowOWins() 
    {
        Board board = new Board();

        board.setFieldOwner(Symbol.O, 2, 0);
        board.setFieldOwner(Symbol.O, 2, 1);
        board.setFieldOwner(Symbol.O, 2, 2);
        board.setFieldOwner(Symbol.O, 2, 3);

        int[] scores = board.evaluateBoard(); 
        assertEquals(-4, scores[2]);
    }
    
    @Test
    public void fourthRowXWins() 
    {
        Board board = new Board();

        board.setFieldOwner(Symbol.X, 3, 0);
        board.setFieldOwner(Symbol.X, 3, 1);
        board.setFieldOwner(Symbol.X, 3, 2);
        board.setFieldOwner(Symbol.X, 3, 3);

        int[] scores = board.evaluateBoard(); 
        assertEquals(4, scores[3]);
    }
    
    @Test
    public void fourhtRowOWins() 
    {
        Board board = new Board();

        board.setFieldOwner(Symbol.O, 3, 0);
        board.setFieldOwner(Symbol.O, 3, 1);
        board.setFieldOwner(Symbol.O, 3, 2);
        board.setFieldOwner(Symbol.O, 3, 3);

        int[] scores = board.evaluateBoard(); 
        assertEquals(-4, scores[3]);
    }


    @Test
    public void firstColumnXWins() 
    {
        Board board = new Board();

        board.setFieldOwner(Symbol.X, 0, 0);
        board.setFieldOwner(Symbol.X, 1, 0);
        board.setFieldOwner(Symbol.X, 2, 0);
        board.setFieldOwner(Symbol.X, 3, 0);

        int[] scores = board.evaluateBoard(); 
        assertEquals(4, scores[4]);
    }

    @Test
    public void firstColumnOWins() 
    {
        Board board = new Board();

        board.setFieldOwner(Symbol.O, 0, 0);
        board.setFieldOwner(Symbol.O, 1, 0);
        board.setFieldOwner(Symbol.O, 2, 0);
        board.setFieldOwner(Symbol.O, 3, 0);

        int[] scores = board.evaluateBoard(); 
        assertEquals(-4, scores[4]);
    }

    @Test
    public void secondColumnXWins() 
    {
        Board board = new Board();

        board.setFieldOwner(Symbol.X, 0, 1);
        board.setFieldOwner(Symbol.X, 1, 1);
        board.setFieldOwner(Symbol.X, 2, 1);
        board.setFieldOwner(Symbol.X, 3, 1);

        int[] scores = board.evaluateBoard(); 
        assertEquals(4, scores[5]);
    }

    @Test
    public void secondColumnOWins() 
    {
        Board board = new Board();

        board.setFieldOwner(Symbol.O, 0, 1);
        board.setFieldOwner(Symbol.O, 1, 1);
        board.setFieldOwner(Symbol.O, 2, 1);
        board.setFieldOwner(Symbol.O, 3, 1);

        int[] scores = board.evaluateBoard(); 
        assertEquals(-4, scores[5]);
    }

    @Test
    public void thirdColumnXWins() 
    {
        Board board = new Board();

        board.setFieldOwner(Symbol.X, 0, 2);
        board.setFieldOwner(Symbol.X, 1, 2);
        board.setFieldOwner(Symbol.X, 2, 2);
        board.setFieldOwner(Symbol.X, 3, 2);

        int[] scores = board.evaluateBoard(); 
        assertEquals(4, scores[6]);
    }

    @Test
    public void thirdColumnOWins() 
    {
        Board board = new Board();

        board.setFieldOwner(Symbol.O, 0, 2);
        board.setFieldOwner(Symbol.O, 1, 2);
        board.setFieldOwner(Symbol.O, 2, 2);
        board.setFieldOwner(Symbol.O, 3, 2);

        int[] scores = board.evaluateBoard(); 
        assertEquals(-4, scores[6]);
    }
    
    @Test
    public void fourthColumnXWins() 
    {
        Board board = new Board();

        board.setFieldOwner(Symbol.X, 0, 3);
        board.setFieldOwner(Symbol.X, 1, 3);
        board.setFieldOwner(Symbol.X, 2, 3);
        board.setFieldOwner(Symbol.X, 3, 3);

        int[] scores = board.evaluateBoard(); 
        assertEquals(4, scores[7]);
    }

    @Test
    public void fourthColumnOWins() 
    {
        Board board = new Board();

        board.setFieldOwner(Symbol.O, 0, 3);
        board.setFieldOwner(Symbol.O, 1, 3);
        board.setFieldOwner(Symbol.O, 2, 3);
        board.setFieldOwner(Symbol.O, 3, 3);

        int[] scores = board.evaluateBoard(); 
        assertEquals(-4, scores[7]);
    }

    @Test
    public void leftToRightDiagonalXWins() 
    {
        Board board = new Board();

        board.setFieldOwner(Symbol.X, 0, 0);
        board.setFieldOwner(Symbol.X, 1, 1);
        board.setFieldOwner(Symbol.X, 2, 2);
        board.setFieldOwner(Symbol.X, 3, 3);

        int[] scores = board.evaluateBoard();
        assertEquals(4, scores[8]);
    }

    @Test
    public void leftToRightDiagonalOWins() 
    {
        Board board = new Board();

        board.setFieldOwner(Symbol.O, 0, 0);
        board.setFieldOwner(Symbol.O, 1, 1);
        board.setFieldOwner(Symbol.O, 2, 2);
        board.setFieldOwner(Symbol.O, 3, 3);

        int[] scores = board.evaluateBoard();
        assertEquals(-4, scores[8]);
    }

    @Test
    public void rightToLeftDiagonalXWins() 
    {
        Board board = new Board();            
        
        board.setFieldOwner(Symbol.X, 3, 0);
        board.setFieldOwner(Symbol.X, 2, 1);
        board.setFieldOwner(Symbol.X, 1, 2);
        board.setFieldOwner(Symbol.X, 0, 3);
        
        int[] scores = board.evaluateBoard();
        assertEquals(4, scores[9]);
    
    
    @Test
    public void rightToLeftDiagonalOWins() 
    {
        Board board = new Board();

        board.setFieldOwner(Symbol.O, 3, 0);
        board.setFieldOwner(Symbol.O, 2, 1);
        board.setFieldOwner(Symbol.O, 1, 2);
        board.setFieldOwner(Symbol.O, 0, 3);

        int[] scores = board.evaluateBoard();
        assertEquals(-4, scores[9]);
    }
    
    @Test
    public void rightToLeftDiagonalXWins2() 
    {
        Board board = new Board();               
        
        board.setFieldOwner(Symbol.X, 0, 0);
        board.setFieldOwner(Symbol.O, 0, 1);
        board.setFieldOwner(Symbol.O, 1, 0);
        board.setFieldOwner(Symbol.O, 1, 2);
        board.setFieldOwner(Symbol.O, 3, 0);
        
        board.setFieldOwner(Symbol.X, 0, 3);
        board.setFieldOwner(Symbol.X, 1, 2);
        board.setFieldOwner(Symbol.X, 2, 1);
        board.setFieldOwner(Symbol.X, 3, 0);
        
        board.printField();
        int[] scores = board.evaluateBoard();
        assertEquals(4, scores[9]);                
    }

    @Test
    public void rightToLeftDiagonalOWins2() 
    {
        Board board = new Board();               
        
        board.setFieldOwner(Symbol.O, 0, 0);
        board.setFieldOwner(Symbol.X, 0, 1);
        board.setFieldOwner(Symbol.X, 1, 0);
        board.setFieldOwner(Symbol.X, 1, 2);
        board.setFieldOwner(Symbol.X, 3, 0);
        
        board.setFieldOwner(Symbol.O, 0, 3);
        board.setFieldOwner(Symbol.O, 1, 2);
        board.setFieldOwner(Symbol.O, 2, 1);
        board.setFieldOwner(Symbol.O, 3, 0);
        
        board.printField();
        int[] scores = board.evaluateBoard();
        assertEquals(-4, scores[9]);                
    }
}
