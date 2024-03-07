/*
Funcionalidades de la Clase Producto:

Almacenar el nombre del producto, el precio unitario.
Proveer métodos para obtener y modificar estas propiedades (getters y setters).

Definir la Clase Producto:
Debe contener dos propiedades privadas: nombre (String) y precioUnitario (double).
Implementar un constructor para inicializar estas propiedades.
Proporcionar métodos getters y setters para cada propiedad.

 */
public class ProductoFactura {
  // atributos:
  private Producto producto;
  private int cantidad;
  

  // constructor:
  public ProductoFactura(Producto producto, int cantidad){
    this.producto = producto;
    this.cantidad = cantidad;
  }

  // metodos getters:
  public Producto getProducto(){
    return producto;
  }

  public int getCantidad(){
    return cantidad;
  }

  // metodos setter:
  public void incrementarCantidad(int cantidad){
    this.cantidad += cantidad;
  }
}