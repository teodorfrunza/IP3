// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3)
// Source File Name:   Notificare.java
package com.company;

import java.security.spec.InvalidParameterSpecException;

public class Notificare
{

    private String subject;
    private String mesaj;
    private String data;
    private Boolean priority;
    private Primarie expeditor;
    private float lifespan;

    public Notificare(String subject,String mesaj,String data,Boolean priority,Primarie expeditor )
    {
        try {
            if (!subject.equals(null) && !mesaj.equals(null) && !data.equals(null) && !priority.equals(null)) {
                this.subject=subject;
                this.mesaj=mesaj;
                this.data=data;
                this.priority=priority;
                this.expeditor=expeditor;
            } else throw new InvalidParameterSpecException("One of parameters invalid");
        } catch (InvalidParameterSpecException e) {
            e.printStackTrace();
        }
    }

    public void editNotif(String subject,String mesaj,String data,Boolean priority,Primarie expeditor)
    {
        try {
            if (!subject.equals(null) && !mesaj.equals(null) && !data.equals(null) && !priority.equals(null)) {
                this.subject=subject;
                this.mesaj=mesaj;
                this.data=data;
                this.priority=priority;
                this.expeditor=expeditor;
            } else throw new InvalidParameterSpecException("One of parameters invalid");
        } catch (InvalidParameterSpecException e) {
            e.printStackTrace();
        }
    }

    public void postNotif()
    {
        System.out.println(this.subject+" "+this.mesaj+" "+this.data+" "+this.expeditor.getName());
    }

    public String getSubject()
    {
        return this.subject;
    }

    public float lifespan(String startDate,String endDate){
        
    }

    public void setLifeSpan (float lifeSpan){
        this.lifespan=lifeSpan;
    }

}
