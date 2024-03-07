import java.util.ArrayList;
import java.util.List;

/*
Funcionalidades de la Clase CuentaSupermercado:

Añadir productos a la cuenta. Si el producto ya existe, se deberán sumar las unidades.
Calcular el precio total de la compra, teniendo en cuenta la cantidad de cada producto.
Mostrar el tiquet segun se indica más abajo.
 */

public class CuentaSupermercado {
  private List<ProductoFactura> listaProductoFactura;
  private static int contadorFacturas = 1; // contador de facturas
  private String nombre;
  private int numeroFactura;

  //Constructor:
  public CuentaSupermercado(){
    this.numeroFactura = contadorFacturas++;
    this.listaProductoFactura = new ArrayList<ProductoFactura>();
  }


  // metodos getters:
  public String getNombre(){
    return nombre;
  }

  // metodos setters:

  public void setNombre(String nombre){
    this.nombre = nombre;
  }

  // Metodos:

  // método para añadir productos a la cuenta:
  public void addProducto(Producto productoInput, int unidades){
    boolean productoExistente = false;

    // Verificar si el producto ya existe en la lista:
    for(ProductoFactura productoFactura : listaProductoFactura){
      Producto producto = productoFactura.getProducto();
      if (producto.getNombre().equals(productoInput.getNombre())){
        productoExistente = true;
        productoFactura.incrementarCantidad(unidades);
        break;
      }
    }
    // Si el producto no existe en la lista, añadir nuevo producto:
      if (!productoExistente) {
        ProductoFactura productoFactura = new ProductoFactura(productoInput, unidades);
        listaProductoFactura.add(productoFactura);
    }
  }

  // método para calcular el precio total de la compra:
  public double calcularPrecioTotal() {
    double precioTotal = 0;
    for (ProductoFactura productoFactura : listaProductoFactura) {
      Producto producto = productoFactura.getProducto();
      precioTotal += producto.getPrecioUnitario() * productoFactura.getCantidad();
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

    sb.append("\t 1\t   2\t    3\t   4\t    5\t    6\t    7\t    8\t\n");
    sb.append("1234567890123456789012345678901234567890123456789012345678901234567890\n");
    sb.append("\n");
    sb.append(String.format("TICKET: %d\n", getNumeroFactura()));
    sb.append("Producto\t" + "Un.\t" + "\tPU\t" + "\tTotal\t\n");
    sb.append("---------------------------------------------------------------\n");
    // productos + unidades + precioUnitario + precioTotal
    for (ProductoFactura productoFactura : listaProductoFactura) {
      Producto producto = productoFactura.getProducto();
      sb.append(String.format("%s\t\t%d\t\t%.1f\t\t%.1f\n",
                              producto.getNombre(),
                              productoFactura.getCantidad(),
                              producto.getPrecioUnitario(),
                              calcularPrecioTotal())); //falta el precio total por unidad!!
      sb.append("---------------------------------------------------------------\n");
      sb.append(String.format("Total:\t\t\t\t\t\t%.1f", calcularPrecioTotal()));
    }
    return sb.toString();
  }
}
