package com.company.singletonpattern;

public class ClipBoardMain {

    public static void main(String[] args) {
        /**By making the constructor private, we cannot create objects from this class outside using new ClipBoard();
        ClipBoard clipBoard =new ClipBoard();               */

        ClipBoard clipBoard =ClipBoard.getInstance();
        clipBoard.copy("Amo Amo");
        clipBoard.paste();

    }
}
