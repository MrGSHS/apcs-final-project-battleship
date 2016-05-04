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
    
    private int width,length;
    private int[][] patternOnBoard = new int[30][30];
    
    public Rectangle(int startR, int startC, int width, int length){
        super();
        this.width=width;
        this.length=length;
        for(int r=0;r<=30;r++){
            for(int c=0;c<=30;c++){
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
    
    public void getNewPosition(Battleship battleship){
        int speed = battleship.getSpeed();
        
    }
}
