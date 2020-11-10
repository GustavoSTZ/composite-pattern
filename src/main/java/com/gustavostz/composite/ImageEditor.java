package com.gustavostz.composite;

import java.util.Arrays;
import java.util.List;

// O código cliente trabalha com todos os componentes através de
// suas interfaces base. Dessa forma o código cliente pode
// suportar componentes folha simples e composites complexos.
public class ImageEditor {
    private CompoundGraphic all;

    public ImageEditor() {
        this.all = new CompoundGraphic();
    }

    public void load(Graphic... graphics){
        Arrays.stream(graphics).forEach(child-> all.add(child));
    }

    // Combina componentes selecionados em um componente
    // composite complexo.
    void groupSelected(Graphic... components){
        CompoundGraphic group = new CompoundGraphic();
        Arrays.stream(components).forEach(component -> {
            group.add(component);
            all.remove(component);
        });
        all.add(group);
        // Todos os componentes serão desenhados.
        all.draw();
    }
}
