package Project_Game.newpackage;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;

<<<<<<< HEAD
public class Tetris extends JFrame 
{
    private static char N;

    private JLabel statusbar;

    public Tetris()
    {
        initUI();
    }

    private void initUI()
    {
=======
public class Tetris extends JFrame {

    private JLabel statusbar;

    public Tetris() {

        initUI();
    }

    private void initUI() {

>>>>>>> 6bc2b80946bc8302a515918423bebe4543e3d21e
        statusbar = new JLabel(" 0");
        add(statusbar, BorderLayout.SOUTH);

        var board = new Board(this);
        add(board);
        board.start();

        setTitle("Tetris");
        setSize(400, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

<<<<<<< HEAD
    JLabel getStatusBar() 
    {
        return statusbar;
    }

    public static void main(String[] args) 
    { 
        EventQueue.invokeLater (() -> 
        {
            var game = new Tetris();
            game.setVisible(true);          
        }
        );
=======
    JLabel getStatusBar() {

        return statusbar;
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {

            var game = new Tetris();
            game.setVisible(true);
        });
>>>>>>> 6bc2b80946bc8302a515918423bebe4543e3d21e
    }
}