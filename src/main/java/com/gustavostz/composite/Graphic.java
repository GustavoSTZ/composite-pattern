package com.gustavostz.composite;

// A interface componente declara operações comuns para ambos os
// objetos simples e complexos de uma composição.
public interface Graphic {

    void move(int x, int y);
    void draw();
}
