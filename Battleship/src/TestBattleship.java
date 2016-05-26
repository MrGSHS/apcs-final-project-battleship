/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maorgozalzani
 */
public class TestBattleship {

    public static void main(String[] args) {
        Pattern rect = new Rectangle(0, 0, 6, 6);

        System.out.println(rect.toString());
        Battleship battle = new Battleship(3, 0, rect, 0, 0);
        //Battleship battle2 = new Battleship()
        System.out.println(battle.getOrientation() + "\n" + "move");
        int[][] gameBoard = new int[30][30];
        Battleship[] array = new Battleship[1];
        array[0] = battle;
        //GameBoard game1 = new GameBoard(array);
        //game1.drawBoard(g);
        System.out.println("Before Move " + battle.getRow() + " " + battle.getCol());
        System.out.println("speed = " + battle.getSpeed());
        battle.move(gameBoard);
        System.out.println("After Move " + battle.getRow() + " " + battle.getCol());
        for (int r = 0; r < 30; r++) {
            for (int c = 0; c < 30; c++) {
                System.out.print(gameBoard[r][c] + " ");
            }
            System.out.println();
        }

//        System.out.println();
//
//        System.out.println();
//
//        battle.move(gameBoard);
//        //System.out.print(gameBoard);
//        for (int m = 0; m < 30; m++) {
//            for (int n = 0; n < 30; n++) {
//                System.out.print(gameBoard[m][n] + " ");
//            }
//            System.out.println();
//        }

    }
}

