package Q2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(3,3);
        matrix.set(0,0,"Top-left");
        matrix.set(1,1,"Center");
        matrix.set(2,2,"Bottom-Right");

        System.out.println("Description at(1,1): "+matrix.get(1,1));
        ArrayList<Matrix.Cell> describedCells = matrix.getDescribedCell();
        System.out.println("DEscribed cells:");
        for(Matrix.Cell cell:describedCells)
            System.out.println(cell + " With description: " + matrix.get(cell.getRow, cell.getCollumn));

    }
}
