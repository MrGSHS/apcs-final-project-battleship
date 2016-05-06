/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


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
    private String orientation;

//    private boolean cw = false;
//    private boolean ccw = false;
    /**
     * @param args the command line arguments
     */
    public Battleship(int size, int speed, Pattern pattern, int row, int col, String orientation/*, String direction*/){
        this.size = size;
        this.speed = speed;
        this.pattern = pattern;
        this.row = row;
        this.col = col;
        conditionOfShip = new int[size];
        this.orientation = orientation;
//        if(direction.equals("cw"))
//            cw = true;
//        else
//            ccw = true;
    }
    
    public int getRow(){
        return row;
    }
    
    public int getCol(){
        return col;
    }
    
    public int getSpeed(){
        return speed;
    }
    
    public String getOrientation(){
        return orientation;
    }
    
    public void setRow(int row){
        this.row = row;
    }
    
    public void setCol(int col){
        this.col = col;
    }
    
    public int[][] move(int[][] gameBoard){
        pattern.getNewPosition(this);
        int lengthOfPattern = pattern.getLength();
        int widthOfPattern = pattern.getWidth();
        
    }
    
}
