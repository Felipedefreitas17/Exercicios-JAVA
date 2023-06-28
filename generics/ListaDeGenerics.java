package com.senac.generics;

import java.util.ArrayList;
import java.util.List;

public class ListaDeGenerics {
    List<Generics> list = new ArrayList<>();

    public void preencheList() {
        this.list.add(new Generics<Integer, String>(1,"Maria"));
        this.list.add(new Generics<Boolean, String>(true,"Maria"));
    }

    public List<Generics> getList() {
        return list;
    }
}
