import java.util.ArrayList;
import java.util.List;

/*
Funcionalidades de la Clase CuentaSupermercado:

Añadir productos a la cuenta. Si el producto ya existe, se deberán sumar las unidades.
Calcular el precio total de la compra, teniendo en cuenta la cantidad de cada producto.
Mostrar el tiquet segun se indica más abajo.

Definir la Clase CuentaSupermercado:

Debe contener una coleccion para almacenar los objetos de tipo Producto.
Recuerda la clase lineaFactura de clase.

Implementar un método para añadir productos a la cuenta:
Este método debe verificar si el producto ya existe en la lista;
si es así, sumar las unidades, de lo contrario, añadir el nuevo producto.

Implementar un método para calcular el precio total de la compra:
Implementar un método para mostrar el listado de productos y el precio total.
 */

public class CuentaSupermercado {
  private List<Producto> productos;
  private static int contadorFacturas = 1; // contador de facturas
  private String nombre;
  private int numeroFactura;

  //Constructor:
  public CuentaSupermercado(){
    this.numeroFactura = contadorFacturas++;
    this.productos = new ArrayList<Producto>();
  }


  // metodos getters:
  public String getNombre(){
    return nombre;
  }

  public List<Producto> getProductos(){
    return productos;
  }

  // metodos setters:

  public void setNombre(String nombre){
    this.nombre = nombre;
  }

  // Metodos:

  // método para añadir productos a la cuenta:
  public void addProducto(Producto nuevoProducto, int unidades){
    boolean productoExistente = false;

    // Verificar si el producto ya existe en la lista:
    for(Producto producto : productos){
      if (producto.getNombre().equals(nuevoProducto.getNombre())){
        productoExistente = true;
        break;
      }
    }
    // Si el producto no existe en la lista, añadir nuevo producto:
      if (!productoExistente) {
        nuevoProducto.setUnidades(unidades);
        productos.add(nuevoProducto);
    }
  }

  // método para calcular el precio total de la compra:
  public double calcularPrecioTotal() {
    double precioTotal = 0;
    for (Producto producto : productos) {
    precioTotal += producto.calcularPrecioTotal();
  }
  return precioTotal;
}

  // metodo para obtener el número de factura:
  public int getNumeroFactura() {
    return numeroFactura;
  }

    // metodo para imprimir factura:
  public String mostrarCuenta(){

    StringBuilder sb = new StringBuilder();

    sb.append("\t1\t   2\t     3\t       4\t 5\n");
    sb.append("12345678901234567890123456789012345678901234567890\n");
    sb.append(String.format("TICKET: %d\n")); //falta añadir CuentaSupermercado.getNumeroFactura()
    sb.append("Producto\t\t" + "\t\tUnidad\n"+ "\t\tPU\n"+ "\t\tTotal\n");
    sb.append("-------------------------------------------------\n");
    // productos + unidades + precioUnitario + precioTotal
    for(Producto producto : productos){
      sb.append(String.format("%s\t\t\t\t\t%.1f\n",
                              producto.getNombre(),
                              producto.getUnidades(),
                              producto.getPrecioUnitario())); //falta el precio total por unidad!!
      sb.append("-------------------------------------------------\n");
      sb.append(String.format("Total:\t\t\t\t%.1f", calcularPrecioTotal()));
    }
    return sb.toString();
  }
}
