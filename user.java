package com.company;

/**
 * Created by frunz on 31/03/2017.
 */
public class User {
    private String nume;
    private int id;
    private float request;
    private String subject;

    User(String nume,int id,float request,String subject){
        this.nume=nume;
        this.id=id;
        this.request=request;
        this.subject=subject;

    }

    public void setRequest(float request){
        this.request=request;
    }


}
