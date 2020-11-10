package com.gustavostz.composite;

// Todas as classes componente estendem outros componentes.
public class Circle extends Dot {

    private int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    public void draw() {
        // Desenhar um círculo em X e Y com raio R.
        System.out.println(
                "                   ooo OOO OOO ooo\n" +
                "               oOO                 OOo\n" +
                "           oOO                         OOo\n" +
                "        oOO                               OOo\n" +
                "      oOO                                   OOo\n" +
                "    oOO                                       OOo\n" +
                "   oOO                                         OOo\n" +
                "  oOO                                           OOo\n" +
                " oOO            Desenhando na coordenada         OOo\n" +
                " oOO                 "+ this.x +", "+ this.y+", "+ this.radius+"                    OOo\n" +
                " oOO                (x, y, radius)               OOo\n" +
                " oOO                                             OOo\n" +
                " oOO                                             OOo\n" +
                "  oOO                                           OOo\n" +
                "   oOO                                         OOo\n" +
                "    oOO                                       OOo\n" +
                "      oOO                                   OOo\n" +
                "        oO                                OOo\n" +
                "           oOO                         OOo\n" +
                "               oOO                 OOo\n" +
                "                   ooo OOO OOO ooo\n\n\n\n");
    }
}
