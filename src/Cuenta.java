public class Cuenta {
    String id;
    String nombreCuenta;
    double balance;

    public Cuenta(){}


    public Cuenta(String id, String nombreCuenta, double balance) {
        this.id = id;
        this.nombreCuenta = nombreCuenta;
        this.balance = balance;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreCuenta() {
        return nombreCuenta;
    }

    public void setNombreCuenta(String nombreCuenta) {
        this.nombreCuenta = nombreCuenta;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double credito(double dinero){
        balance += dinero;
        return balance;
    }

    public double debito(double dinero){

        if(balance > dinero){
            balance -= dinero;
            return balance;
        }
        else{
            System.out.println("No posee dinero suficiente para efectuar la operación");
            return balance;
        }
    }

    public void mostrarCuenta(){
        System.out.println("Cuenta [id = " + getId() + " , Nombre = " + getNombreCuenta()
                + " , Balance = $" + getBalance() + " ]");
    }
}
