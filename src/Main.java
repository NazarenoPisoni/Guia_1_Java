import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //1. Modele el objeto Rectángulo con sus propiedades, ancho y alto. Ambas con valor 
        //1,0 por defecto. Este objeto debe exponer los getters y setters necesarios. También 
        //debe contar con un método para calcular el área y perímetro del mismo. Ejecute las 
        //siguientes pruebas: 
        //a. Inicializar un objeto Rectángulo estableciendo ancho y alto. 
        //b. Imprimir por pantalla el alto y ancho. 
        //c. Imprimir por pantalla el área y perímetro. 
        //d. Modificar el alto y el ancho de la instancia. 
        //e. Imprimir por pantalla nuevamente el cálculo del área y perímetro. 
        //f. Inicializar un objeto Rectángulo con los valores por defecto y verificar 

        Rectangulo rect = new Rectangulo();
        System.out.print("Ingrese el ancho: ");
        Scanner scanner = new Scanner(System.in);
        double ancho = scanner.nextDouble();
        rect.setAncho(ancho);
        System.out.print("Ingrese el alto: ");
        double alto = scanner.nextDouble();
        rect.setAlto(alto);
        System.out.println("Ancho: " + rect.getAncho());
        System.out.println("Alto: " + rect.getAlto());
        System.out.println("El Area es de: " + rect.calcularArea());
        System.out.println("El Perimetro es de: " + rect.calcularPerimetro());

        rect.setAncho(30);
        rect.setAlto(15);
        System.out.println("Ancho actualizado: " + rect.getAncho());
        System.out.println("Alto actualizado: " + rect.getAlto());
        System.out.println("Area actualizada: " + rect.calcularArea());
        System.out.println("Perímetro actualizado: " + rect.calcularPerimetro());

        Rectangulo rect2 = new Rectangulo();
        System.out.println(rect2.getAlto());
        System.out.println(rect2.getAncho());

        //2. Modele el objeto Empleado que posee las siguientes características, dni, nombre, 
        //apellido y salario. El mismo debe contar con la posibilidad de calcular el salario 
        //anual. A su vez se requiere otro método que permita aumentar el salario 
        //dependiendo del porcentaje que se le pase por parámetro. Considere crear un 
        //método que facilite imprimir por pantalla las características del objeto de la 
        //siguiente forma: 
        //Empleado[dni=?, nombre=?, apellido=?, salario=?] 
        //a. Inicialice un empleado Carlos Gutiérrez, con dni 23456345 y salario inicial de 
        //25000. 
        //b. Inicialice un empleado Ana Sánchez, con dni 34234123 y salario inicial de 
        //27500. 
        //c. Imprima ambos objetos por pantalla 
        //d. Aumente el salario del empleado Carlos en un 15% e imprima en pantalla el 
        //salario anual del mismo. 

        Empleado emp = new Empleado("23456345", "Carlos", "Gutiérrez", 25000);
        Empleado emp2 = new Empleado("34234123", "Ana", "Sánchez", 27500);
        System.out.println("El empleado se llama " + emp.getNombre() + " " + emp.getApellido());
        System.out.println("Su DNI es " + emp.getDni());
        System.out.println("Su salario mensual es $ " + emp.getSalario());
        System.out.println("Su salario anual es $ " + emp.getSalarioAnual());

        emp.mostrarEmpleado();
        emp2.mostrarEmpleado();
        emp.aumentarSalario(15);
        System.out.println("El nuevo salario de Carlos es de $ " + emp.getSalario()
                + " y su salario anual pasa a ser ahora de $ " + emp.getSalarioAnual());

        //3. Modele el objeto Ítem de Venta con las siguientes propiedades, identificador,
        //descripción, cantidad y precio unitario. Cree los métodos para calcular el precio
        //total teniendo en cuenta el precio unitario y cantidad. Un método que permita
        //imprimir por pantalla los atributos del objeto de la siguiente forma:
        //ItemVenta[id=?, descripción=?, cantidad=?, pUnitario=?, pTotal=?]
        //a. Inicialice el objeto con los atributos necesarios
        //b. Imprima por pantalla el objeto inicializado.

        ItemVenta item1 = new ItemVenta(2425, "Monitor 22", 4, 50000);
        item1.mostrarItemVenta();

        //4. Modele el objeto que representa la cuenta de un banco, con identificador, nombre
        //y balance. Considere los getters, setters y constructores necesarios. Tenga en
        //cuenta los siguientes métodos.
        //a. El método crédito que representa un depósito de dinero en la cuenta. Este
        //método debe devolver el balance luego de la operación.
        //b. El método débito que representa una sustracción de dinero de la cuenta.
        //Este método debe devolver el balance luego de la operación. Si el dinero en
        //la cuenta no es suficiente para cubrir la sustracción, se debe imprimir por
        //pantalla un aviso.
        //c. Un método que imprima por pantalla las características del objeto.

        //Realice las siguientes operaciones:
        //1. Inicialice una cuenta con un monto inicial de 15000.
        //2. Realice una operación de crédito de 2500.
        //3. Realice una operación de compra de 1500.
        //4. Realice una operación de compra de 30000.
        //5. Imprima por pantalla los valores de la cuenta y verifique que el balance sea
        //correcto.

        Cuenta cnt1 = new Cuenta("AR2379324", "Mercado Libre", 15000);
        cnt1.mostrarCuenta();

        cnt1.credito(2500);
        System.out.println("Su saldo actual es de $ " + cnt1.getBalance());

        cnt1.debito(1500);
        System.out.println("Su saldo actual es de $ " + cnt1.getBalance());

        cnt1.debito(30000);
        System.out.println("Su saldo actual es de $ " + cnt1.getBalance());

        //5. Modele el objeto Hora, teniendo en cuenta sus atributos, hora, minuto y segundo.
        //Tenga en cuenta el rango de valores aceptados para cada uno de estos.
        //a. Hora: 0 … 23
        //b. Minuto: 0 … 59
        //c. Segundo: 0 … 59
        //Considere el siguiente comportamiento:
        //1. Un método que imprima la hora bajo el siguiente formato hh:mm:ss
        //usando zero a la izquierda ejemplo 13:04:22 .
        //2. Un método que avance en 1 segundo y devuelva la instancia del objeto.
        //3. Un método que retroceda en 1 segundo y devuelva la instancia del objeto.
        //4. Instanciar el objeto y probar los métodos creados.

        Hora hora1 = new Hora();
        int horas;
        int minutos;
        int segundos;

        do {
            System.out.println("Ingrese la Hora: ");
            horas = scanner.nextInt();
            hora1.setHoras(horas);
            if(horas < 0 || horas > 23){
                System.out.println("ERROR. Debe ingresar una Hora válida");
            }
        } while(horas < 0 || horas > 23);

        do {
            System.out.println("Ingrese los Minutos: ");
            minutos = scanner.nextInt();
            hora1.setMinutos(minutos);
            if(minutos < 0 || minutos > 59){
                System.out.println("ERROR. Debe ingresar un Minuto válido");
            }
        } while(minutos < 0 || minutos > 59);

        do {
            System.out.println("Ingrese los Segundos: ");
            segundos = scanner.nextInt();
            hora1.setSegundos(segundos);
            if(segundos < 0 || segundos > 59){
                System.out.println("ERROR. Debe ingresar un Segundo válido");
            }
        } while(segundos < 0 || segundos > 59);

        hora1.mostrarHora();
        hora1.avanzarSegundo();
        hora1.retrocederSegundo();
    }

} 