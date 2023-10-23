package com.mjc.stage2.entity;

import java.util.ArrayList;
import java.util.List;

public class TextComponent extends AbstractTextComponent {
    protected List<AbstractTextComponent> componentList = new ArrayList<>();
    private int size = 0;
// Write your code here!

    public TextComponent(TextComponentType componentType) {
        super(componentType);
    }

    @Override
    public String operation() {
        int componentListSize = componentList.size();
        String[] resultArray = new String[componentListSize];
        for (int i = 0; i < componentListSize; i++) {
            resultArray[i] = componentList.get(i).operation();
        }
        return String.join(componentType.getDelimiter(), resultArray);
    }

    @Override
    public void add(AbstractTextComponent textComponent) {
        componentList.add(textComponent);
        size += textComponent.getSize();
    }

    @Override
    public void remove(AbstractTextComponent textComponent) {
        componentList.remove(textComponent);
        size -= textComponent.getSize();
    }

    @Override
    public int getSize() {
        return size;
    }
}