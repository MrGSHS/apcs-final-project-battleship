/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maorgozalzani
 */
public class Try {
    public static void main(String[] args) {
        Pattern rect=new Rectangle(5,5,6,6);
    Battleship battle= new Battleship(4,2,rect,5,5,"south");
    System.out.println("move");
        int[][] gameBoard = new int[30][30];
        battle.move(gameBoard);
       // System.out.print(gameBoard);
       for(int r=0;r<30;r++){
           for(int c=0;c<30;c++){
               System.out.print(gameBoard[r][c]);
           }
           System.out.println();
       }
       
                  System.out.println();

                             System.out.println();

           
           battle.move(gameBoard);
       // System.out.print(gameBoard);
       for(int m=0;m<30;m++){
           for(int n=0;n<30;n++){
               System.out.print(gameBoard[m][n]);
           }
           System.out.println();
    }
       
            
    

}
}