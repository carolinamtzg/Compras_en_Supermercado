/*
Funcionalidades de la Clase Producto:

Almacenar el nombre del producto, el precio unitario.
Proveer métodos para obtener y modificar estas propiedades (getters y setters).

Definir la Clase Producto:
Debe contener dos propiedades privadas: nombre (String) y precioUnitario (double).
Implementar un constructor para inicializar estas propiedades.
Proporcionar métodos getters y setters para cada propiedad.

 */
public class Producto {
  // atributos:
  private String nombre;
  private double precioUnitario;
  private int unidades;

  // constructor:
  public Producto(String nombre, double precioUnitario){
    this.nombre = nombre;
    this.precioUnitario = precioUnitario;
    this.unidades = 0;
  }

  // metodos getters:
  public String getNombre(){
    return nombre;
  }

  public double getPrecioUnitario(){
    return precioUnitario;
  }

  public int getUnidades(){
    return unidades;
  }

  // metodos setter:
  public void setNombre(String nombre){
    this.nombre = nombre;
  }

  public void setPrecioUnitario(double precioUnitario){
    this.precioUnitario = precioUnitario;
  }

  public void setUnidades(int unidades){
    this.unidades = unidades;
  }

  // metodo para sumar unidades:
  public void addUnidades(int unidades){
    this.unidades += unidades;
  }
  
  // metodo para calcularPrecioTotal:
  public double calcularPrecioTotal() {
    return precioUnitario * unidades;
}
}