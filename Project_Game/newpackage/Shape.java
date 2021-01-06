package Project_Game.newpackage;

import java.util.Random;

<<<<<<< HEAD
public class Shape 
{
=======
public class Shape {

>>>>>>> 6bc2b80946bc8302a515918423bebe4543e3d21e
    protected enum Tetrominoe { NoShape, ZShape, SShape, LineShape,
        TShape, SquareShape, LShape, MirroredLShape }

    private Tetrominoe pieceShape;
    private int coords[][];
    private int[][][] coordsTable;


<<<<<<< HEAD
    public Shape() 
    {
        initShape();
    }

    private void initShape() 
    {
        coords = new int[4][2];

        coordsTable = new int[][][] 
        {
=======
    public Shape() {

        initShape();
    }

    private void initShape() {

        coords = new int[4][2];

        coordsTable = new int[][][] {
>>>>>>> 6bc2b80946bc8302a515918423bebe4543e3d21e
                { { 0, 0 },   { 0, 0 },   { 0, 0 },   { 0, 0 } },
                { { 0, -1 },  { 0, 0 },   { -1, 0 },  { -1, 1 } },
                { { 0, -1 },  { 0, 0 },   { 1, 0 },   { 1, 1 } },
                { { 0, -1 },  { 0, 0 },   { 0, 1 },   { 0, 2 } },
                { { -1, 0 },  { 0, 0 },   { 1, 0 },   { 0, 1 } },
                { { 0, 0 },   { 1, 0 },   { 0, 1 },   { 1, 1 } },
                { { -1, -1 }, { 0, -1 },  { 0, 0 },   { 0, 1 } },
                { { 1, -1 },  { 0, -1 },  { 0, 0 },   { 0, 1 } }
        };
<<<<<<< HEAD
        setShape(Tetrominoe.NoShape);
    }

    protected void setShape(Tetrominoe shape) 
    {
        for (int i = 0; i < 4 ; i++) 
        {
            for (int j = 0; j < 2; j++) 
            {
                coords[i][j] = coordsTable[shape.ordinal()][i][j];
            }
        }
        pieceShape = shape;
    }

    private void setX(int index, int x) 
    { 
        coords[index][0] = x; 
    }
    private void setY(int index, int y) 
    { 
        coords[index][1] = y; 
    }
    public int x(int index) 
    { 
        return coords[index][0]; 
    }
    public int y(int index) 
    { 
        return coords[index][1]; 
    }
    public Tetrominoe getShape()  
    { 
        return pieceShape; 
    }
    public void setRandomShape() 
    {
=======

        setShape(Tetrominoe.NoShape);
    }

    protected void setShape(Tetrominoe shape) {

        for (int i = 0; i < 4 ; i++) {

            for (int j = 0; j < 2; ++j) {

                coords[i][j] = coordsTable[shape.ordinal()][i][j];
            }
        }

        pieceShape = shape;
    }

    private void setX(int index, int x) { coords[index][0] = x; }
    private void setY(int index, int y) { coords[index][1] = y; }
    public int x(int index) { return coords[index][0]; }
    public int y(int index) { return coords[index][1]; }
    public Tetrominoe getShape()  { return pieceShape; }

    public void setRandomShape() {

>>>>>>> 6bc2b80946bc8302a515918423bebe4543e3d21e
        var r = new Random();
        int x = Math.abs(r.nextInt()) % 7 + 1;

        Tetrominoe[] values = Tetrominoe.values();
        setShape(values[x]);
    }

<<<<<<< HEAD
    public int minX() 
    {

        int m = coords[0][0];

        for (int i=0; i < 4; i++) 
        {
=======
    public int minX() {

        int m = coords[0][0];

        for (int i=0; i < 4; i++) {
>>>>>>> 6bc2b80946bc8302a515918423bebe4543e3d21e

            m = Math.min(m, coords[i][0]);
        }

        return m;
    }


<<<<<<< HEAD
    public int minY() 
    {

        int m = coords[0][1];

        for (int i=0; i < 4; i++) 
        {
=======
    public int minY() {

        int m = coords[0][1];

        for (int i=0; i < 4; i++) {
>>>>>>> 6bc2b80946bc8302a515918423bebe4543e3d21e

            m = Math.min(m, coords[i][1]);
        }

        return m;
    }

<<<<<<< HEAD
    public Shape rotateLeft() 
    {

        if (pieceShape == Tetrominoe.SquareShape) 
        {
=======
    public Shape rotateLeft() {

        if (pieceShape == Tetrominoe.SquareShape) {
>>>>>>> 6bc2b80946bc8302a515918423bebe4543e3d21e

            return this;
        }

        var result = new Shape();
        result.pieceShape = pieceShape;

<<<<<<< HEAD
        for (int i = 0; i < 4; ++i) 
        {
=======
        for (int i = 0; i < 4; ++i) {

>>>>>>> 6bc2b80946bc8302a515918423bebe4543e3d21e
            result.setX(i, y(i));
            result.setY(i, -x(i));
        }

        return result;
    }

<<<<<<< HEAD
    public Shape rotateRight() 
    {
        if (pieceShape == Tetrominoe.SquareShape) 
        {
=======
    public Shape rotateRight() {

        if (pieceShape == Tetrominoe.SquareShape) {

>>>>>>> 6bc2b80946bc8302a515918423bebe4543e3d21e
            return this;
        }

        var result = new Shape();
        result.pieceShape = pieceShape;

<<<<<<< HEAD
        for (int i = 0; i < 4; ++i) 
        {
=======
        for (int i = 0; i < 4; ++i) {

>>>>>>> 6bc2b80946bc8302a515918423bebe4543e3d21e
            result.setX(i, -y(i));
            result.setY(i, x(i));
        }

        return result;
    }
}
