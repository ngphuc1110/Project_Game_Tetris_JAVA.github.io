package Project_Game.newpackage;

import Project_Game.newpackage.Shape.Tetrominoe;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

<<<<<<< HEAD
public class Board extends JPanel 
{
=======
public class Board extends JPanel {

>>>>>>> 6bc2b80946bc8302a515918423bebe4543e3d21e
    private final int BOARD_WIDTH = 15;
    private final int BOARD_HEIGHT = 35;
    private final int PERIOD_INTERVAL = 600;

    private Timer timer;
    private boolean isFallingFinished = false;
    private boolean isPaused = false;
    private int numLinesRemoved = 0;
    private int curX = 0;
    private int curY = 0;
    private JLabel statusbar;
    private Shape curPiece;
    private Tetrominoe[] board;

<<<<<<< HEAD
    public Board(Tetris parent) 
    {
        initBoard(parent);
    }

    private void initBoard(Tetris parent) 
    {
=======
    public Board(Tetris parent) {

        initBoard(parent);
    }

    private void initBoard(Tetris parent) {

>>>>>>> 6bc2b80946bc8302a515918423bebe4543e3d21e
        setFocusable(true);
        statusbar = parent.getStatusBar();
        addKeyListener(new TAdapter());
    }

<<<<<<< HEAD
    private int squareWidth() 
    {
        return (int) getSize().getWidth() / BOARD_WIDTH;
    }

    private int squareHeight() 
    {
        return (int) getSize().getHeight() / BOARD_HEIGHT;
    }

    private Tetrominoe shapeAt(int x, int y) 
    {
        return board[(y * BOARD_WIDTH) + x];
    }

    void start() 
    {
=======
    private int squareWidth() {

        return (int) getSize().getWidth() / BOARD_WIDTH;
    }

    private int squareHeight() {

        return (int) getSize().getHeight() / BOARD_HEIGHT;
    }

    private Tetrominoe shapeAt(int x, int y) {

        return board[(y * BOARD_WIDTH) + x];
    }

    void start() {

>>>>>>> 6bc2b80946bc8302a515918423bebe4543e3d21e
        curPiece = new Shape();
        board = new Tetrominoe[BOARD_WIDTH * BOARD_HEIGHT];

        clearBoard();
        newPiece();

        timer = new Timer(PERIOD_INTERVAL, new GameCycle());
        timer.start();
    }

<<<<<<< HEAD
    private void pause() 
    {
        isPaused = !isPaused;

        if (isPaused) 
        {
            statusbar.setText("paused");
        } 
        else 
        {
=======
    private void pause() {

        isPaused = !isPaused;

        if (isPaused) {

            statusbar.setText("paused");
        } else {

>>>>>>> 6bc2b80946bc8302a515918423bebe4543e3d21e
            statusbar.setText(String.valueOf(numLinesRemoved));
        }

        repaint();
    }

    @Override
<<<<<<< HEAD
    public void paintComponent(Graphics g) 
    {
=======
    public void paintComponent(Graphics g) {

>>>>>>> 6bc2b80946bc8302a515918423bebe4543e3d21e
        super.paintComponent(g);
        doDrawing(g);
    }

<<<<<<< HEAD
    private void doDrawing(Graphics g) 
    {
        var size = getSize();
        int boardTop = (int) size.getHeight() - BOARD_HEIGHT * squareHeight();

        for (int i = 0; i < BOARD_HEIGHT; i++) 
        {
            for (int j = 0; j < BOARD_WIDTH; j++) 
            {
                Tetrominoe shape = shapeAt(j, BOARD_HEIGHT - i - 1);

                if (shape != Tetrominoe.NoShape) 
                {
=======
    private void doDrawing(Graphics g) {

        var size = getSize();
        int boardTop = (int) size.getHeight() - BOARD_HEIGHT * squareHeight();

        for (int i = 0; i < BOARD_HEIGHT; i++) {

            for (int j = 0; j < BOARD_WIDTH; j++) {

                Tetrominoe shape = shapeAt(j, BOARD_HEIGHT - i - 1);

                if (shape != Tetrominoe.NoShape) {

>>>>>>> 6bc2b80946bc8302a515918423bebe4543e3d21e
                    drawSquare(g, j * squareWidth(),
                            boardTop + i * squareHeight(), shape);
                }
            }
        }

<<<<<<< HEAD
        if (curPiece.getShape() != Tetrominoe.NoShape) 
        {
            for (int i = 0; i < 4; i++) 
            {
=======
        if (curPiece.getShape() != Tetrominoe.NoShape) {

            for (int i = 0; i < 4; i++) {

>>>>>>> 6bc2b80946bc8302a515918423bebe4543e3d21e
                int x = curX + curPiece.x(i);
                int y = curY - curPiece.y(i);

                drawSquare(g, x * squareWidth(),
                        boardTop + (BOARD_HEIGHT - y - 1) * squareHeight(),
                        curPiece.getShape());
            }
        }
    }

<<<<<<< HEAD
    private void dropDown() 
    {
        int newY = curY;

        while (newY > 0) 
        {
            if (!tryMove(curPiece, curX, newY - 1)) 
            {
=======
    private void dropDown() {

        int newY = curY;

        while (newY > 0) {

            if (!tryMove(curPiece, curX, newY - 1)) {

>>>>>>> 6bc2b80946bc8302a515918423bebe4543e3d21e
                break;
            }

            newY--;
        }

        pieceDropped();
    }

<<<<<<< HEAD
    private void oneLineDown() 
    {
        if (!tryMove(curPiece, curX, curY - 1)) 
        {
=======
    private void oneLineDown() {

        if (!tryMove(curPiece, curX, curY - 1)) {

>>>>>>> 6bc2b80946bc8302a515918423bebe4543e3d21e
            pieceDropped();
        }
    }

<<<<<<< HEAD
    private void clearBoard() 
    {
        for (int i = 0; i < BOARD_HEIGHT * BOARD_WIDTH; i++) 
        {
=======
    private void clearBoard() {

        for (int i = 0; i < BOARD_HEIGHT * BOARD_WIDTH; i++) {

>>>>>>> 6bc2b80946bc8302a515918423bebe4543e3d21e
            board[i] = Tetrominoe.NoShape;
        }
    }

<<<<<<< HEAD
    private void pieceDropped() 
    {
        for (int i = 0; i < 4; i++) 
        {
=======
    private void pieceDropped() {

        for (int i = 0; i < 4; i++) {

>>>>>>> 6bc2b80946bc8302a515918423bebe4543e3d21e
            int x = curX + curPiece.x(i);
            int y = curY - curPiece.y(i);
            board[(y * BOARD_WIDTH) + x] = curPiece.getShape();
        }

        removeFullLines();

<<<<<<< HEAD
        if (!isFallingFinished) 
        {
=======
        if (!isFallingFinished) {

>>>>>>> 6bc2b80946bc8302a515918423bebe4543e3d21e
            newPiece();
        }
    }

<<<<<<< HEAD
    private void newPiece() 
    {
=======
    private void newPiece() {

>>>>>>> 6bc2b80946bc8302a515918423bebe4543e3d21e
        curPiece.setRandomShape();
        curX = BOARD_WIDTH / 2 + 1;
        curY = BOARD_HEIGHT - 1 + curPiece.minY();

<<<<<<< HEAD
        if (!tryMove(curPiece, curX, curY)) 
        {
=======
        if (!tryMove(curPiece, curX, curY)) {

>>>>>>> 6bc2b80946bc8302a515918423bebe4543e3d21e
            curPiece.setShape(Tetrominoe.NoShape);
            timer.stop();

            var msg = String.format("Game over. Score: %d", numLinesRemoved);
            statusbar.setText(msg);
        }
    }

<<<<<<< HEAD
    private boolean tryMove(Shape newPiece, int newX, int newY) 
    {
        for (int i = 0; i < 4; i++) 
        {
            int x = newX + newPiece.x(i);
            int y = newY - newPiece.y(i);

            if (x < 0 || x >= BOARD_WIDTH || y < 0 || y >= BOARD_HEIGHT) 
            {
                return false;
            }

            if (shapeAt(x, y) != Tetrominoe.NoShape) 
            {
=======
    private boolean tryMove(Shape newPiece, int newX, int newY) {

        for (int i = 0; i < 4; i++) {

            int x = newX + newPiece.x(i);
            int y = newY - newPiece.y(i);

            if (x < 0 || x >= BOARD_WIDTH || y < 0 || y >= BOARD_HEIGHT) {

                return false;
            }

            if (shapeAt(x, y) != Tetrominoe.NoShape) {

>>>>>>> 6bc2b80946bc8302a515918423bebe4543e3d21e
                return false;
            }
        }

        curPiece = newPiece;
        curX = newX;
        curY = newY;

        repaint();

        return true;
    }

<<<<<<< HEAD
    private void removeFullLines() 
    {
        int numFullLines = 0;

        for (int i = BOARD_HEIGHT - 1; i >= 0; i--) 
        {
            boolean lineIsFull = true;

            for (int j = 0; j < BOARD_WIDTH; j++) 
            {
                if (shapeAt(j, i) == Tetrominoe.NoShape) 
                {
=======
    private void removeFullLines() {

        int numFullLines = 0;

        for (int i = BOARD_HEIGHT - 1; i >= 0; i--) {

            boolean lineIsFull = true;

            for (int j = 0; j < BOARD_WIDTH; j++) {

                if (shapeAt(j, i) == Tetrominoe.NoShape) {

>>>>>>> 6bc2b80946bc8302a515918423bebe4543e3d21e
                    lineIsFull = false;
                    break;
                }
            }

<<<<<<< HEAD
            if (lineIsFull) 
            {
                numFullLines++;

                for (int k = i; k < BOARD_HEIGHT - 1; k++) 
                {
                    for (int j = 0; j < BOARD_WIDTH; j++) 
                    {
=======
            if (lineIsFull) {

                numFullLines++;

                for (int k = i; k < BOARD_HEIGHT - 1; k++) {
                    for (int j = 0; j < BOARD_WIDTH; j++) {
>>>>>>> 6bc2b80946bc8302a515918423bebe4543e3d21e
                        board[(k * BOARD_WIDTH) + j] = shapeAt(j, k + 1);
                    }
                }
            }
        }

<<<<<<< HEAD
        if (numFullLines > 0)
        {
=======
        if (numFullLines > 0) {

>>>>>>> 6bc2b80946bc8302a515918423bebe4543e3d21e
            numLinesRemoved += numFullLines;

            statusbar.setText(String.valueOf(numLinesRemoved));
            isFallingFinished = true;
            curPiece.setShape(Tetrominoe.NoShape);
        }
    }

<<<<<<< HEAD
    private void drawSquare(Graphics g, int x, int y, Tetrominoe shape) 
    {
=======
    private void drawSquare(Graphics g, int x, int y, Tetrominoe shape) {

>>>>>>> 6bc2b80946bc8302a515918423bebe4543e3d21e
        Color colors[] = {new Color(0, 0, 0), new Color(204, 102, 102),
                new Color(102, 204, 102), new Color(102, 102, 204),
                new Color(204, 204, 102), new Color(204, 102, 204),
                new Color(102, 204, 204), new Color(218, 170, 0)
        };

        var color = colors[shape.ordinal()];

        g.setColor(color);
        g.fillRect(x + 1, y + 1, squareWidth() - 2, squareHeight() - 2);

        g.setColor(color.brighter());
        g.drawLine(x, y + squareHeight() - 1, x, y);
        g.drawLine(x, y, x + squareWidth() - 1, y);

        g.setColor(color.darker());
        g.drawLine(x + 1, y + squareHeight() - 1,
                x + squareWidth() - 1, y + squareHeight() - 1);
        g.drawLine(x + squareWidth() - 1, y + squareHeight() - 1,
                x + squareWidth() - 1, y + 1);
    }

<<<<<<< HEAD
    private class GameCycle implements ActionListener 
    {
        @Override
        public void actionPerformed(ActionEvent e) 
        {
=======
    private class GameCycle implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

>>>>>>> 6bc2b80946bc8302a515918423bebe4543e3d21e
            doGameCycle();
        }
    }

<<<<<<< HEAD
    private void doGameCycle() 
    {
=======
    private void doGameCycle() {

>>>>>>> 6bc2b80946bc8302a515918423bebe4543e3d21e
        update();
        repaint();
    }

<<<<<<< HEAD
    private void update() 
    {
        if (isPaused) 
        {
            return;
        }

        if (isFallingFinished) 
        {
            isFallingFinished = false;
            newPiece();
        } 
        else 
        {
            oneLineDown();
        }
    }
     class TAdapter extends KeyAdapter 
     {
        @Override
        public void keyPressed(KeyEvent e) 
        {
            if (curPiece.getShape() == Tetrominoe.NoShape) 
            {
=======
    private void update() {

        if (isPaused) {

            return;
        }

        if (isFallingFinished) {

            isFallingFinished = false;
            newPiece();
        } else {

            oneLineDown();
        }
    }

    class TAdapter extends KeyAdapter {

        @Override
        public void keyPressed(KeyEvent e) {

            if (curPiece.getShape() == Tetrominoe.NoShape) {

>>>>>>> 6bc2b80946bc8302a515918423bebe4543e3d21e
                return;
            }

            int keycode = e.getKeyCode();
<<<<<<< HEAD
         
            switch (keycode) 
            {
=======

            // Java 12 switch expressions
            switch (keycode) {

>>>>>>> 6bc2b80946bc8302a515918423bebe4543e3d21e
                case KeyEvent.VK_P -> pause();
                case KeyEvent.VK_LEFT -> tryMove(curPiece, curX - 1, curY);
                case KeyEvent.VK_RIGHT -> tryMove(curPiece, curX + 1, curY);
                case KeyEvent.VK_DOWN -> tryMove(curPiece.rotateRight(), curX, curY);
                case KeyEvent.VK_UP -> tryMove(curPiece.rotateLeft(), curX, curY);
                case KeyEvent.VK_SPACE -> dropDown();
                case KeyEvent.VK_D -> oneLineDown();
            }
        }
    }
}