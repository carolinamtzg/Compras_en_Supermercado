/*
Funcionalidades de la Clase ProductoFactura:

- Almacenar el producto y la cantidad (unidades de producto).
- Proveer métodos para obtener y modificar estas propiedades (getters y setters).
- Implementar un constructor para inicializar estas propiedades.
- Proporcionar método para incrementar las unidades.

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

  // metodo:
  public void incrementarCantidad(int cantidad){
    this.cantidad += cantidad;
  }
}