package com.wang.design.chapter11;

/**
 * @author tracy
 *
 * 11-桥接模式
 */
public class Pen {
    private Color color;
    private Texture texture;
    private Shape shape;

    public Pen(Color color, Texture texture, Shape shape) {
        this.color = color;
        this.texture = texture;
        this.shape = shape;
    }

    public void print(){
        this.color.showColor();
        this.texture.showTexture();
        this.shape.shape();
        System.out.println();
    }
}
