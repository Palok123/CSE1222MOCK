package Q2;
import  java.util.ArrayList;
public class Matrix {
    private  String[][] grid;
    public class Cell {
        public int getRow;
        public int getCollumn;
        private int row;
        private int column;
        public  Cell(int row,int column)
        {
            this.row = row ;
            this.column = column;
        }
        public  int getRow()
        {
            return row;
        }
        public  int getColumn()
        {
            return column;
        }
        @Override
        public  String toString()
        {
            return "Cell at row "+row+", column "+column;
        }
    }
    public  Matrix(int numRows,int numColumns)
    {
        grid = new String[numRows][numColumns];
    }
    public void set(int row,int column,String description)
    {
        if(row>=0 && row<grid.length && column <grid[0].length)
        {
            grid[row][column] =description;
        }
        else
        {
            System.out.println("invalid row or column index");
        }
    }
    public String get(int row,int column)
    {
        if(row>=0 && row <grid.length && column>0 && column<grid[0].length)
        {
            return  grid[row][column];
        }
        return null;
    }
    public ArrayList<Cell>getDescribedCell()
    {
        ArrayList<Cell> describedCells = new ArrayList<>();
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                if(grid[i][j]!=null)
                {
                    describedCells.add(new Cell(i,j));
                }
            }
        }
        return  describedCells;
    }
   
}
