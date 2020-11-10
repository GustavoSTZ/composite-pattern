package com.gustavostz.composite;

// A classe folha representa objetos finais de uma composição.
// Um objeto folha não pode ter quaisquer sub-objetos.
// Geralmente, são os objetos folha que fazem o verdadeiro
// trabalho, enquanto que os objetos composite somente delegam
// para seus sub componentes.
public class Dot implements Graphic{

    protected int x;
    protected int y;

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }

    public void draw() {
        // Desenhar um ponto em X e Y.
        System.out.println("||=============================================================||\n");
        System.out.println("\t\tDesenhando ponto na coordenada ("+ this.x +", "+ this.y+")...        .");
        System.out.println("\n||============================================================||\n\n\n");
    }
}
