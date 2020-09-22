package com.felipe.domain;


import java.util.ArrayList;


public class Mercado{

    public static final byte CAPACIDAD = 86;
    private final String supermercado;
    private ArrayList<Producto> productos;


    public Mercado(String supermercado) {
        this.supermercado = supermercado;
        this.productos = productos;
        this.productos = new ArrayList<>();

    }
    //Agregar un producto al Mercado
    public boolean agregar(Producto producto){
        boolean x = false;

        for (int i = 0; i < productos.size(); i++) {

            if (producto.getCantidad() < CAPACIDAD && !producto.equals(productos.get(i))) {
                x = true;
            }
            else{
                x = false;
            }
        }
        return x;
    }

    //Retirar un producto del Mercado
    public boolean retirar(String nombre){

        boolean x = false;
        int producto = 0;

        for (int i = 0; i < productos.size(); i++) {

            if (productos.get(i).getName() == nombre) {

                producto = productos.get(i).getCantidad() -1;

                x = true;
            }
            else{
                x = false;
            }
        }
        return x;
    }


    //Busqueda de Producto por nombre
    public Producto buscarPorNombre(String nombre){

        Producto producto = null;

        for (int i = 0; i < productos.size(); i++) {

            if (productos.get(i).getName() == nombre) {

                producto = productos.get(i);
            }
        }
        return producto;
    }



    public Producto buscarPorCodigo(int codigo){

        Producto producto = null;

        for (int i = 0; i < productos.size(); i++) {

            if (productos.get(i).getCodigo() == codigo) {

                producto = productos.get(i);
            }
        }
        return producto;
    }




    public ArrayList buscarPorTipo (String tipo) {

        ArrayList listaProductosDadoSuTipo = new ArrayList();

        for (int i = 0; i < productos.size(); i++) {

            if (productos.get(i).getTipo() == tipo) {

                listaProductosDadoSuTipo.add(productos.get(i));
            }
        }
        return listaProductosDadoSuTipo;
    }




    public int calcularTotal() {
        int totalMercadoSegunPrecioYCantidad = 0;

        for (int i = 0; i < productos.size(); i++) {

            totalMercadoSegunPrecioYCantidad += productos.get(i).getPrecio() * productos.get(i).getCantidad();
        }
        return totalMercadoSegunPrecioYCantidad;
    }

    public static byte getCAPACIDAD() {
        return CAPACIDAD;
    }

    public String getSupermercado() {
        return supermercado;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
}
