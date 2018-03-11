package tictactoe.view;

import tictactoe.model.Field.Symbol;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class View extends JFrame implements ViewInterface 
{
    private final GridLayout grid;     // default grid-size for tic-tac-toe
    private final JButton[] buttons;   // an array containing the 9 buttons

    public View() 
    {
        super("Tic-Tac-Toe 4X4");
        grid = new GridLayout(4, 4);
        buttons = new JButton[16];

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addComponentsToPane(getContentPane());
        pack();
        setVisible(true);

        getRootPane().setDefaultButton(buttons[4]);
        buttons[4].requestFocus();
    }


    public void addComponentsToPane(final Container pane) //adds panel with its buttons to the window pane
    {
        final JPanel panel = new JPanel();
        panel.setLayout(grid);        
        panel.setPreferredSize(new Dimension(1000, 1000));

        for (int i = 0; i < buttons.length; i++) 
        {
            buttons[i] = new JButton();
            buttons[i].getPreferredSize();
            panel.add(buttons[i]);
        }

        pane.add(panel);
    }

    @Override
    public void updateBoard(Symbol userSymbol, JButton button) //changes a square to the users symbol
    {
        try 
        {
            Image icon = ImageIO.read(View.class.getResource("icons/" + userSymbol.toString() + ".png"));
            button.setIcon(new ImageIcon(icon));
            button.setEnabled(false);
        } 
        catch (IOException ex) 
        {
            System.out.println("icons/" + userSymbol.toString() + ".png not found.");
        }
    }

    @Override
    public void informWin(Symbol userSymbol) //tells user who won
    {
        for (JButton button : buttons) 
        {
            button.setEnabled(false);
        }
        UIManager.put("OptionPane.minimumSize",new Dimension(500, 250));
        JOptionPane.showMessageDialog(null, "<html><font size='24' align=center>Player " + userSymbol.toString() + " has won!");
    }

    @Override
    public void informTie() //tells user if a tie had occurred 
    {
        JOptionPane.showMessageDialog(null, "Tie!");
    }


    public JButton getButton(int index)   //returns specific index of a button
    {
        return buttons[index];
    }

    public int getNumberOfButtons() //returns the size of button array
    {
        return buttons.length;
    }
}