package com.gustavostz.composite;

import java.util.ArrayList;
import java.util.List;

// A classe composite representa componentes complexos que podem
// ter filhos. Objetos composite geralmente delegam o verdadeiro
// trabalho para seus filhos e então "somam" o resultado.
public class CompoundGraphic implements Graphic  {

    private List<Graphic> children;

    public CompoundGraphic() {
        this.children = new ArrayList<Graphic>();
    }

    // Um objeto composite pode adicionar ou remover outros
    // componentes (tanto simples como complexos) para ou de sua
    // lista de filhos.
    void add(Graphic child){
        // Adiciona um filho para o vetor de filhos.
        children.add(child);
    }

    void remove(Graphic child) {
        // Remove um filho do vetor de filhos.
        children.remove(child);
    }


    public void move(int x, int y) {
        children.forEach(child -> child.move(x,y));
    }

    // Um composite executa sua lógica primária em uma forma
    // particular. Ele percorre recursivamente através de todos
    // seus filhos, coletando e somando seus resultados. Já que
    // os filhos do composite passam essas chamadas para seus
    // próprios filhos e assim em diante, toda a árvore de
    // objetos é percorrida como resultado.
    public void draw() {
        children.forEach(child -> child.draw());
    }
}
