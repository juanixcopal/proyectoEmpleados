
package trabajo_Herencia_proyecto;
public abstract class Empleado {
    // attributes
  private String nombre;
  private String apellido;
  private String dni;
  private String direccion;
  private int edad;
  private String formacionAcademica;
  private int anosExperiencia;
  private int horas_trabajadas;
  private int pagoPorHora;
   // constructor without parameter
  public Empleado(){
      
  }
      // constructor with parameter
    public Empleado(String nombre, String apellido, String dni, String direccion, int edad, String formacionAcademica, 
            int anosExperiencia, int horas_trabajadas, int pago_horas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.edad = edad;
        this.formacionAcademica = formacionAcademica;
        this.anosExperiencia = anosExperiencia;
        this.horas_trabajadas = horas_trabajadas;
        this.pagoPorHora = pago_horas;
    }
  
  // get and set method 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getFormacionAcademica() {
        return formacionAcademica;
    }

    public void setFormacionAcademica(String formacionAcademica) {
        this.formacionAcademica = formacionAcademica;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }
     public int getHoras_trabajadas() {
        return horas_trabajadas;
    }

    public void setHoras_trabajadas(int horas_trabajadas) {
        this.horas_trabajadas = horas_trabajadas;
    }

    public int getPagoPorHora() {
        return pagoPorHora;
    }

    public void setPagoPorHora(int pagoPorHora) {
        this.pagoPorHora = pagoPorHora;
    }
    // abstract method
    
    public abstract String imprimirBoletaPago();
    public abstract int horasExtras();
    public abstract int cant_horas_extras();
    public abstract double sueldoBruto();
    public abstract double sueldoNeto();

   
}
