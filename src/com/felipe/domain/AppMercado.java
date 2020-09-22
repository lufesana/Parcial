package com.felipe.domain;
import com.felipe.domain.Mercado;
import com.felipe.domain.Producto;
import com.felipe.domain.TipoProducto;


public class AppMercado {

    public static void main(String[] args) {

                Producto pernil    = new Producto((int) 5, "pernil", (int) 10,(int) 20000,"carne");
                Producto yuca      = new Producto((int) 20,"yuca", (int) 3,(int) 1000,"Verdura");
                Producto yogourt   = new Producto((int) 30, "yogourt", (int) 2,(int) 100,"lacteo");
                Producto banano    = new Producto((int) 6, "banano", (int) 52,(int) 8000,"fruta");
                Producto laAbuela  = new Producto((int) 15, "laAbuela", (int) 4,(int) 7000,"pan");
                Producto cruz      = new Producto((int) 45, "cruz", (int) 6,(int) 2000,"chocolate");
                Producto laBastilla= new Producto((int) 50, "laBastilla", (int) 7,(int) 5000,"cafe");
                Producto manuelita = new Producto((int) 20, "manuelita", (int) 1,(int) 7000,"azucar");

                Mercado LaEconomia = new Mercado("LaEconomia");
                LaEconomia.getProductos().add(pernil);
                LaEconomia.getProductos().add(yuca);
                LaEconomia.getProductos().add(yogourt);
                LaEconomia.getProductos().add(banano);
                LaEconomia.getProductos().add(laAbuela);
                LaEconomia.getProductos().add(cruz);
                LaEconomia.getProductos().add(laBastilla);


        System.out.println("Los productos que hay en el supermercado " + LaEconomia.getSupermercado() + " son: " + LaEconomia.getProductos());

        System.out.println("Se agrego correctamente el producto " + LaEconomia.agregar(manuelita));

        System.out.println("Se retiro correctamente el producto " + LaEconomia.retirar(manuelita.getName()));

        Producto buscadoNombre = LaEconomia.buscarPorNombre("pernil");

        System.out.println("Se encontro el producto: " + buscadoNombre.getCodigo() + " " + buscadoNombre.getName());

        Producto buscarCodigo = LaEconomia.buscarPorCodigo(50);

        System.out.println("Se encontro el producto: " + buscarCodigo.getCodigo() + " " + buscarCodigo.getName());

        System.out.println(LaEconomia.buscarPorTipo("cafe"));

        System.out.println("El valor del mercado es: " + LaEconomia.calcularTotal());
    }






            }



