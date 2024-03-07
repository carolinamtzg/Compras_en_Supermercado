/*
Funcionalidades de la Clase Producto:

- Almacenar el nombre del producto y el precio unitario.
- Implementar un constructor para inicializar estas propiedades.
- Métodos para obtener y modificar estas propiedades (getters y setters).

 */
public class Producto {
  // atributos:
  private String nombre;
  private double precioUnitario;
  

  // constructor:
  public Producto(String nombre, double precioUnitario){
    this.nombre = nombre;
    this.precioUnitario = precioUnitario;
  }

  // metodos getters:
  public String getNombre(){
    return nombre;
  }

  public double getPrecioUnitario(){
    return precioUnitario;
  }

  // metodos setter:
  public void setNombre(String nombre){
    this.nombre = nombre;
  }

  public void setPrecioUnitario(double precioUnitario){
    this.precioUnitario = precioUnitario;
  }
}