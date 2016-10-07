package com.tes.vi.sampleoop.stockbreeding;

/**
 * Created by taufiqotulfaidah on 10/5/16.
 */

public class Duck implements AnimalBehaviour {

    public String hoby;
    protected String hobyProtected;
    private String hobyPrivate;
    String defaultHoby;

    @Override
    public String speak() {
        return "wek wek wek";   //polymorphism
    }

    public String color(){
        return "white";
    }

    private String gender(){
        return "male";
    }

    protected String favFood(){
        return "keong";
    }


}
