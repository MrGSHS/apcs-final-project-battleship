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
    public static final String north = "north";
    public static final String east = "east";
    public static final String west = "west";
    public static final String south = "south";
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
    
    public void setOrientation(String orientation){
        this.orientation = orientation;
    }
    
    public void setRow(int row){
        this.row = row;
    }
    
    public void setCol(int col){
        this.col = col;
    }
    
    public int[][] move(int[][] gameBoard){
        //CLEAR CURRENT PATTERN
        int lengthOfPattern = pattern.getLength();
        int widthOfPattern = pattern.getWidth();
        //if (pattern instanceof rectangle)
        int startR = pattern.getStartR();
        int startC = pattern.getStartC();
        for(int i=startC; i<=startC+widthOfPattern; i++){
            gameBoard[startR][i] = 0;
            gameBoard[startR+lengthOfPattern][i] = 0;
        }
        for(int i=startR; i<=startR+lengthOfPattern; i++){
            gameBoard[startC][i] = 0;
            gameBoard[startC+widthOfPattern][i] = 0;
        }
        
        
        pattern.getNewPosition(this);
        
    }
    
}
