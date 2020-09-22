package com.felipe.domain;

public class Producto {

    private int codigo;
    private String name;
    private int cantidad;
    private int precio;
    private String tipo;

    public Producto(int codigo, String name, int cantidad, int precio, String tipo) {
        this.codigo = codigo;
        this.name = name;
        this.cantidad = cantidad;
        this.precio = precio;
        this.tipo = tipo;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getName() {
        return name;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
