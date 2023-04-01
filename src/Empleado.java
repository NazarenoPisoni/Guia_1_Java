public class Empleado {
    String dni;
    String nombre;
    String apellido;
    double salario;

    public Empleado(){};

    public Empleado(String dni, String nombre, String apellido, double salario){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }


    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalarioAnual(){
        return salario * 12;
    }

    public double aumentarSalario(int porcentaje){
        double aumento = (salario / 100) * porcentaje;
        salario += aumento;
        return salario;
    }

    public void mostrarEmpleado(){
        System.out.println("Empleado [dni = " + getDni() + " , Nombre = " + getNombre()
                + " , Apellido = " + getApellido() + " , Salario = $" + getSalario() + " ]");
    }
}
