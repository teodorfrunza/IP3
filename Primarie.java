package com.company;
// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3)
// Source File Name:   Primarie.java

import com.sun.xml.internal.bind.v2.model.core.ID;

import java.lang.reflect.Array;
import java.security.spec.InvalidParameterSpecException;
import java.util.ArrayList;
import java.util.Vector;

public class Primarie {
    private String Nume;
    private int IDPrimarie;
    private ArrayList<Notificare> myNotificare=new ArrayList();
    private static Primarie primarie = new Primarie();

    private Primarie() {
    }

    public static Primarie getInstance() {
        return primarie;
    }

    public void setNume(String Nume) {
        try {
            if (!Nume.equals(null)) {
                this.Nume = Nume;
            } else throw new InvalidParameterSpecException("Invalid Name");
        } catch (InvalidParameterSpecException e) {
            e.printStackTrace();
        }
    }

    public void setIDPrimarie(int IDPrimarie) {
        try {
            if (IDPrimarie >= 0 && IDPrimarie <= 999) {
                this.IDPrimarie = IDPrimarie;
            } else throw new InvalidParameterSpecException("Invalid IDPrimarie");
        } catch (InvalidParameterSpecException e) {
            e.printStackTrace();
        }
    }


    public void generateNotif(String subject, String mesaj, String data, Boolean priority) {
        try {
            if (!subject.equals(null) && !mesaj.equals(null) && !data.equals(null) && !priority.equals(null)) {
                Notificare notificare = new Notificare(subject, mesaj, data, priority, getInstance());
                this.myNotificare.add(notificare);
            } else throw new InvalidParameterSpecException("One of parameters invalid");
        } catch (InvalidParameterSpecException e) {
            e.printStackTrace();
        }
    }


}
