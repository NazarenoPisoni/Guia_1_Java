public class Rectangulo {
    double alto = 1.0;
    double ancho = 1.0;
    public Rectangulo(){};

    public Rectangulo(double alto, double ancho){
        this.alto = alto;
        this.ancho = ancho;
    }


    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double calcularArea(){
        return ancho * alto;
    }

    public double calcularPerimetro(){
        return (ancho + alto) * 2;
    }
}
