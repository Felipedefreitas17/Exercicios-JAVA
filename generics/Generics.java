package com.senac.generics;

public class Generics<Tipo1,Tipo2> {
    Tipo1 e;
    Tipo2 t;

    Generics(Tipo1 e, Tipo2 t) {
        this.e = e;
        this.t = t;
    }
    public String toString( )
    {
        return e.toString() + t.toString();
    }
}
