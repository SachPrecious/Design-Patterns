package com.company.singletonpattern;

public class ClipBoard {
    private String content;

    private static ClipBoard instance;

    /**By making the constructor private,
     we cannot create objects from this class outside using new ClipBoard();    */
    private ClipBoard(){

    }
    /**By making the getInstance method public static,
     *  we can access the method from outside without creating an object*/
    public static ClipBoard getInstance(){
        if (instance==null){
            instance= new ClipBoard();
        }
        return instance;
    }


    public void copy(String c){

        this.content=c;
    }

    public void paste(){
        System.out.println(content);

    }



}
