package com.gustavostz.composite;

public class Main {
    public static void main(String[] args) {
        Graphic graphic = new Dot(1, 2);

        ImageEditor imageEditor = new ImageEditor();
        imageEditor.load(
                graphic,
                new Circle(5, 3, 10)
        );

        imageEditor.groupSelected(
                graphic,
                new Circle(9, 9, 90));

    }
}
