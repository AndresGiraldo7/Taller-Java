package com.taller.condicionales;
import java.util.Scanner;

public class Drogueria {
    String cliente;
    Integer venta;
    Integer opcion;
    static Scanner input;

    public Drogueria(String cliente, Integer venta) {
        this.cliente = cliente;
        this.venta = venta;
    }

    public Integer getVenta() {
        return venta;
    }
    public void setVenta(Integer venta) {
        this.venta = venta;
    }
    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    public void Mostrar(){
        String producto1 = "Medicamento1";
        String producto2 = "Medicamento2";
        String producto3 = "Medicamento3";

        String caracteristica1 = "Para el dolor";
        String caracteristica2 = "Para la inflamacion";
        String caracteristica3 = "Para la gripa";

        String precio1 = "8000 pesos.";
        String precio2 = "9000 pesos.";
        String precio3 = "10000 pesos.";

        do{
        System.out.println("*** Bienvenido a la Drogueria Mi Salud ***");
        System.out.println("Por favor dijite su nombre:");
        input = new Scanner(System.in);
        cliente = input.next();
        System.out.print("\033[H\033[2J");
        System.out.println("*******************************************");
        System.out.println("Elije una opcion");
        System.out.println("1. Comprar Producto");
        System.out.println("2. Ver Caracteristicas y precios de los productos");
        System.out.println("3. Devoluciones");
        System.out.println("4. Para salir");
        System.out.println("*******************************************");
        input = new Scanner(System.in);
        opcion = input.nextInt();
        System.out.print("\033[H\033[2J");
        
        switch (opcion) {

            case 1:
            System.out.println("Seleccione el producto que desea comprar");
            System.out.println("1. "+producto1+" "+caracteristica1+" Tiene un costo de "+precio1);
            System.out.println("2. "+producto2+" "+caracteristica2+" Tiene un costo de "+precio2);
            System.out.println("3. "+producto3+" "+caracteristica3+" Tiene un costo de "+precio3);
            input = new Scanner(System.in);
            opcion = input.nextInt();
            System.out.print("\033[H\033[2J");
            if(opcion == 1){
                System.out.println(producto1);
                System.out.println ("Descripcion del producto: "+ producto1);
                System.out.println("Caracteristica: producto "+caracteristica1);
                System.out.println("Tiene un costo de: "+precio1);
            }
            if(opcion == 2){
                System.out.println(producto2);
                System.out.println ("Descripcion del producto: "+ producto2);
                System.out.println("Caracteristica: producto "+caracteristica2);
                System.out.println("Tiene un costo de: "+precio2);
            }
            if(opcion == 3){
                System.out.println(producto3);
                System.out.println ("Descripcion del producto: "+ producto3);
                System.out.println("Caracteristica: producto "+caracteristica3);
                System.out.println("Tiene un costo de: "+precio3);
            }
            System.out.print("\033[H\033[2J");
            System.out.println("Elija metodo de pago");
            System.out.println("1. Pago en efectivo");
            System.out.println("2. Pago con tarjeta");
            System.out.println("3. Pago con bono sodexo");
            input = new Scanner(System.in);
            opcion = input.nextInt();

            System.out.println("*** Para confirmar la compra por favor digite nuevamente el numero del medicamento ***");
            input = new Scanner(System.in);
            venta = input.nextInt();
            System.out.print("\033[H\033[2J");

            if(venta == 1){
                System.out.println("Factura emitida al Cliente: "+cliente);
                System.out.println("Descripcion del producto: "+producto1);
                System.out.println("Caracteristicas del producto "+caracteristica1);
                System.out.println("Tiene un costo de: "+precio1+"\n" );
                
            }
            if(venta == 2){
                System.out.println("Factura emitida al Cliente: "+cliente);
                System.out.println("Descripcion del producto: "+producto2);
                System.out.println("Caracteristicas del producto "+caracteristica2);
                System.out.println("Tiene un costo de: "+precio2+"\n");
                
            }
            if(venta == 3){
                System.out.println("Factura emitida al Cliente: "+cliente);
                System.out.println("Descripcion del producto: "+producto3);
                System.out.println("Caracteristicas del producto "+caracteristica3);
                System.out.println("Tiene un costo de: "+precio3+"\n");
                
            }
        break;
            case 2:
            System.out.println("Seleccione el producto que desea comprar");
            System.out.println("1. "+producto1+" "+caracteristica1+" Tiene un costo de "+precio1);
            System.out.println("2. "+producto2+" "+caracteristica2+" Tiene un costo de "+precio2);
            System.out.println("3. "+producto3+" "+caracteristica3+" Tiene un costo de "+precio3);
        break;
            
            case 3:
            System.out.println("Seccion Devoluciones");
            System.out.println("*** Para confirmar la devolucion del producto por favor digite nuevamente el numero del medicamento ***");
            System.out.println("1. "+ producto1);
            System.out.println("2. "+ producto2);
            System.out.println("3. "+ producto3);
            
            input = new Scanner(System.in);
            opcion = input.nextInt();
            System.out.print("\033[H\033[2J");
            if (opcion == 1)
                System.out.println("Devolucion confirmada para el producto "+producto1+"\n");
            if(opcion == 2 )
                System.out.println("Devolucion confirmada para el producto "+producto2+"\n");
            if(opcion == 3 )
                System.out.println("Devolucion confirmada para el producto "+producto3+"\n");
        break;
            }
        }while(opcion !=4);

    }
}
