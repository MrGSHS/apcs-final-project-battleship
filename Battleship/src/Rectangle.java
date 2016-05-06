/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author apieprz6
 */
public class Rectangle extends Pattern {
    private final int boardSize=30;
    private int width,length,startR,startC;
    private int[][] patternOnBoard = new int[boardSize][boardSize];
    
    /**
     *
     * @param startR
     * @param startC
     * @param width
     * @param length
     */
    public Rectangle(int startR, int startC, int width, int length){
        super();
        this.width=width;
        this.length=length; // HEIGHT U DUMBASS
        this.startR = startR;
        this.startC = startC;
        for(int r=0;r<=boardSize;r++){
            for(int c=0;c<=boardSize;c++){
                if(r == startR  && c >= startC && c<=startC + width){
                    patternOnBoard[r][c]=1;
                }
                else if(r==startR+length && c >= startC && c<=startC + width){  
                    patternOnBoard[r][c]=1;
                }
                else if(c==startC && r >=startR && r<=startR + length){
                    patternOnBoard[r][c]=1;
                }
                else if(c==startC+width && r>=startR && r<=startR + length){
                    patternOnBoard[r][c]=1;
                }
                else{
                 patternOnBoard[r][c] = 0;
                }
            }
        }
    }
    
    public int getLength(){
        return length;
    }
    
    public int getWidth(){
        return width;
    }
    
    public int getStartR(){
        return startR;
    }
        
        public int getStartC(){
        return startC;
    }
        
    @Override
    public void getNewPosition(Battleship battleship){
        int speed = battleship.getSpeed();
        int intR = battleship.getRow();
        int intC = battleship.getCol();
        if(intR == startR){
            if(intC - speed >= startC){
                battleship.setCol(intC-speed);
            }
            else{
                int down = startC - (intC - speed);
                battleship.setRow(intR - down);
                battleship.setCol(startC);
            }
        }
        else if(intC == startC){
            if(intR + speed <= startR + length){
                battleship.setRow(intR+speed);
            }
            else{
                int right = (intR + speed) - (startR + length);
                battleship.setCol(intC + right);
                battleship.setRow(intR + length);
            }
        }
        else if(intR == startR+length){
            if(intC+speed <= startC + width){
                battleship.setCol(intC+speed);
            }
            else{
                int up = (intC+speed) - (startC+width);
                battleship.setRow(startR+length-up);
                battleship.setCol(startC+width);
            }
        }
        else{
            if(intR - speed >= startR){
                battleship.setRow(intR-speed);
            }
            else{
                int left = startR - (intR - speed);
                battleship.setCol((startC + width) - left);
                battleship.setRow(startR);
            }
        }
        if(battleship.getRow() == startR && battleship.getCol() != startC){
            battleship.setOrientation(Battleship.east);
        }
        else if(battleship.getRow() == startR+length && battleship.getCol() != startC ){
            battleship.setOrientation(Battleship.west);
        }
        else if(battleship.getRow() != startR && battleship.getRow()!= startR+length && battleship.getCol()== startC){
            battleship.setOrientation(Battleship.south);
            
        }
        else if(battleship.getRow() != startR && battleship.getRow()!= startR+length && battleship.getCol()== startC+width){
            battleship.setOrientation(Battleship.north);
            
        }
        }
    }

