/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;

/**
 *
 * @author apieprz6
 */
public class Battleship {
    private int size;
    private int speed;
    private Pattern pattern;
    private int row;
    private int col;
    private int[] conditionOfShip;
    private boolean north= false;
    private boolean east = false;
    private boolean south = false;
    private boolean west = false;
    private boolean cw = false;
    private boolean ccw = false;
    /**
     * @param args the command line arguments
     */
    public Battleship(int size, int speed, Pattern pattern, int row, int col, String orientation, String direction){
        this.size = size;
        this.speed = speed;
        this.pattern = pattern;
        this.row = row;
        this.col = col;
        conditionOfShip = new int[size];
        if(orientation.equals("north"))
            north = true;
        else if(orientation.equals("east"))
            east = true;
        else if(orientation.equals("south"))
            south = true;
        else
            west = true;
        if(direction.equals("cw"))
            cw = true;
        else
            ccw = true;
    }
    
    int[][] move(int[][] gameBoard){
        int[] tempArray = pattern.getPosition(speed, row, col);
        row = tempArray[0];
        col = tempArray[1];
        if(tempArray[2]==0){
            
        }
    }
    
}
