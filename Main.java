import java.util.Scanner;

/*
En el método main:
Se crearán varios productos y se añadirán a la cuenta del supermercado para mostrar la funcionalidad.
La introducción de productos se hará
1. Preguntar producto y cantidad.
2. Confirmar si hay otro producto.
3. Acabar si no hay mas productos.
4. Al acabar de introducir productos, el programa mostrará la cuenta.
*/

public class Main {
  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args){

    String respuestaNuevaFactura = "Y";

    while(respuestaNuevaFactura.equals("Y")){
      // Por la manera implementada, no se necesita preguntar numero de productos.

      CuentaSupermercado nuevaFactura = new CuentaSupermercado();

      String respuestaAddProducto = "Y";
      
      // while loop para seguir añadiendo productos en la lista:
      while(respuestaAddProducto.equals("Y")){

        // preguntar nombre del producto:
        System.out.print("Nombre del producto: ");
        String nombreProducto = scanner.next();

        // preguntar precio de productos:
        System.out.print("Precio: ");
        double precioUnitario = scanner.nextDouble();
        scanner.nextLine();

        Producto producto = new Producto(nombreProducto, precioUnitario);

        // preguntar cantidad de productos:
        System.out.print("Cantidad: ");
        int cantProducto = scanner.nextInt();
        scanner.nextLine();

        // guardar las unidades del producto:
        nuevaFactura.addProducto(producto, cantProducto);

        System.out.print("¿Desea agregar otro producto? (Y/N): ");
        respuestaAddProducto = scanner.next().toUpperCase();
        scanner.nextLine();
      }

      // imprimir la nueva factura para comprobar que el sistema funciona correctamente:
      String cuenta = nuevaFactura.mostrarCuenta();
      System.out.println(cuenta);

      System.out.print("¿Desea agregar una cuenta nueva? (Y/N): ");
      respuestaNuevaFactura = scanner.next().toUpperCase();

    }
    

  }
}

