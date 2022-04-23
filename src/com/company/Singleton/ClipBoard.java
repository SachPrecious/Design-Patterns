package com.company.Singleton;

public class ClipBoard {
    private String content;

    //private static ClipBoard instance;

   /*
    private ClipBoard{




    }
    */



    public void copy(String c){
        this.content=c;
    }

    public void paste(){
        System.out.println(content);

    }



}
