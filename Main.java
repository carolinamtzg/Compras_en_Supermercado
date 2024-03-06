import java.util.Scanner;

/*
En el método main:
Se crearán varios productos y se añadirán a la cuenta del supermercado para mostrar la funcionalidad.
La introducción de productos se hará
1. Preguntar numero total de productos. Crear array de productos con longitud informada.
2. Preguntar producto y cantidad.
3. Confirmar si hay otro producto.
4. Acabar si no hay mas productos.
Al acabar de introducir productos, el programa mostrará la cuenta según el esquema.
*/

public class Main {
  static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args){

    // preguntar numero total de productos:
    System.out.println("Ingresa el numero total de productos: ");
    int totalProductos = scanner.nextInt();
    scanner.nextLine();

    // crear array de productos con longitud informada:
    Producto[] productos = new Producto[totalProductos];
    
    for(int i = 0; i > totalProductos; i++){

      System.out.print("Ingrese la cantidad del producto: ");
      int unidades = scanner.nextInt();
      scanner.nextLine();

      // crear el producto y añadirlo al array:
      productos[i] = new Producto(nombreProducto, 10); //producto.getPrecioUnitario()?
      productos[i].addUnidades(unidades); //producto.getUnidades()?

      System.out.print("¿Desea agregar otro producto? (Y/N): ");
      String respuesta = scanner.nextLine().toLowerCase();
      if(respuesta.equals("y")){
        break;
      }
    }

    CuentaSupermercado cuenta = new CuentaSupermercado();
    for(Producto producto : productos){
      cuenta.addProducto(producto, producto.getUnidades());
    }

    cuenta.mostrarCuenta();

    scanner.close();
  }
}
