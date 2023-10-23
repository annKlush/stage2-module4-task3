package com.mjc.stage2.entity;

public class SymbolLeaf extends AbstractTextComponent {

    private char value;

    // Write your code here!

    public SymbolLeaf(char val) {
        super(TextComponentType.SYMBOL);
        this.value = val;
    }
    @Override
    public String operation() {
        return Character.toString(value);
    }

    @Override
    public void add(AbstractTextComponent textComponent) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(AbstractTextComponent textComponent) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getSize() {
        return 1;
    }
}