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
                pattern.getNewPosition(this);

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
            gameBoard[i][startC] = 0;
            gameBoard[i][startC+widthOfPattern] = 0;
        }
        for(int r=0;r<gameBoard.length;r++){
            for (int c=0;c<gameBoard[0].length;c++){
                System.out.print(gameBoard[r][c]+ " ");
            }
            System.out.println();
        }
        pattern.getNewPosition(this);
        if(orientation.equals(east)){
            if(col+size <= startC+widthOfPattern){ //Isn't it just size? why col+size?
                for(int i=0; i<size; i++){
                    gameBoard[row][col+i]=1;
                }
            }
            else{
                int up = (col+size) - (startC+widthOfPattern);
                for(int i=0; i<=size-up; i++){ //check the less than and equal to math
                    gameBoard[row][col+i] = 1;
                }
                for(int j=0; j<up;j++){ //same with comment above
                   gameBoard[row+j][col]=1; 
                }   
            }
        }
        if(orientation.equals(north)){
            if(row+size<=startR+lengthOfPattern){
                for(int i=0;i<size;i++)
                    gameBoard[startR+lengthOfPattern-i][startC]=1;
            }
            else{
                int left=(row+size)-(startR+lengthOfPattern);
                for(int i=0;i<=size-left;i++)
                    gameBoard[row-i][col]=1;
                for(int j=0;j<left;j++)
                    gameBoard[row][col-j]=1;
            }
        }
        if(orientation.equals(west)){
            if((col+size)<=(startC+widthOfPattern)){
                for(int i=0;i<size;i++)
                    gameBoard[row][col-i]=1;

            }
            else{
                int down=(col+size)-(startC+widthOfPattern);
                for(int i=0;i<=size-down;i++)
                    gameBoard[row][col-i]=1;
                for(int j=0;j<down;j++)
                    gameBoard[row+j][col]=1; //shouldn't startC be col?        
            }            
        }
        if(orientation.equals(south)){
            if(row+size<=startR+lengthOfPattern){
                System.out.println("enters if");
                for(int i=0;i<size;i++){
                    gameBoard[row+i][col]=1;
                }
            }
            else{
                System.out.println("enters else");
                int right=(row+size)-(startR+lengthOfPattern);
                for(int i=0;i<size-right;i++){
                    gameBoard[row+i][col]=1;
                        System.out.print("First if");}
                for(int j=0;j<right;j++){
                    gameBoard[row][col+j]=1;
                                System.out.print("second if");
                }

            }
        }
        return gameBoard;
    }
    
}
