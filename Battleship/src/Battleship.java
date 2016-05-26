
import java.awt.Color;
import java.awt.Graphics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author apieprz6
 * Makes a battleship object
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
    public Battleship(int size, int speed, Pattern pattern, int row, int col/*, String direction*/){
        this.size = size;
        this.speed = speed;
        this.pattern = pattern;
        this.row = row;
        this.col = col;
        conditionOfShip = new int[size];
        pattern.updateOrientation(this);
        //this.orientation = orientation;
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
    
    public int getSize(){
        return size;
    }
    
    public void setSpeed(int speed){
        this.speed=speed;
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
    
    
    public void drawSetUp(int y,int x,Graphics g){
        g.setColor(Color.BLACK);
        g.drawRect(x, y, 10, 10*size);
        
        
    }
    
    public void drawGame(Graphics g){
        g.setColor(Color.BLACK);
    }
    
    public Pattern getPattern(){
        return pattern;
    }
    
    /**
     * Moves ship around in it's the gameboard
     * @param gameBoard
     * @return returns the new array of gameboard with the ship marked as 1's or 2's
     * for hits and the rest marked as 0's 
     */
    
    public int[][] move(int[][] gameBoard){
        pattern.getNewPosition(this);
        
        //CLEAR CURRENT PATTERN
        int lengthOfPattern = pattern.getLength()-1;
        int widthOfPattern = pattern.getWidth()-1;
        //if (pattern instanceof rectangle)
        int startR = pattern.getStartR();
        int startC = pattern.getStartC();
        for(int i=startC; i<=startC+widthOfPattern; i++){
            gameBoard[startR][i] = 0;
            gameBoard[startR+lengthOfPattern][i] = 0;
        }
        for(int i=startR; i<=startR+lengthOfPattern; i++){
            gameBoard[i][startC] = 0;
            gameBoard[i][startC+widthOfPattern] = 0;
        }
//        for(int r=0;r<gameBoard.length;r++){
//            for (int c=0;c<gameBoard[0].length;c++){
//                System.out.print(gameBoard[r][c]+ " ");
//            }
//            System.out.println();
//        }
        pattern.getNewPosition(this);
        System.out.println("New Position = " + row + " " + col);
        if(orientation.equals(east)){
            if(col-size >= startC){ //HIT CONDITION DONE
                for(int i=0; i<size; i++){
                    if(conditionOfShip[i] == 1){
                        gameBoard[row][col-i]=2;
                    }
                    else{
                        gameBoard[row][col-i]=1;
                    }
                }
            }
            else{
                int up = startC - (col-size);
                for(int i=0; i<=size-up; i++){ //check the less than and equal to math
                    if(conditionOfShip[i] == 1){
                        gameBoard[row][col-i] = 2;
                    }
                    else{
                        gameBoard[row][col-i] = 1;
                    }
                }
                for(int j=0; j<up;j++){ //same with comment above
                    if(conditionOfShip[size-up]==1){
                        gameBoard[row-j][startC]=2;
                    }
                    else{
                        gameBoard[row-j][startC]=1;
                    }
                }   
            }
        }
        if(orientation.equals(north)){
            if(row+size<=startR+lengthOfPattern){
                for(int i=0;i<size;i++)
                    gameBoard[row+i][col]=1;
            }
            else{
                int left=(row+size)-(startR+lengthOfPattern);
                for(int i=0;i<=size-left;i++)
                    gameBoard[row+i][col]=1;
                for(int j=0;j<left;j++)
                    gameBoard[startR + lengthOfPattern][col-j]=1;
            }
        }
        if(orientation.equals(west)){//FIXED
            if((col+size)<=(startC+widthOfPattern)){
                for(int i=0;i<size;i++)
                    gameBoard[row][col+i]=1;

            }
            else{//FIXED
                int down=(col+size)-(startC+widthOfPattern);
                for(int i=0;i<size-down;i++)
                    gameBoard[row][col+i]=1;
                for(int j=0;j<down;j++)
                    gameBoard[row+j][startC+widthOfPattern]=1; 
            }            
        }
        if(orientation.equals(south)){//FIXED
            if(row-size>=startR){
                for(int i=0;i<size;i++){
                    gameBoard[row-i][col]=1;
                }
            }
            else{
                int right= startR - (row-size);
                for(int i=0;i<size-right;i++){
                    gameBoard[row-i][col]=1;
                }
                for(int j=0;j<right;j++){
                    gameBoard[startR][col+j]=1;
                }

            }
        }
        return gameBoard;
    }
    
    public String toString(){
        return "size: "+size+ "speed: "+speed;
    }
    
}
