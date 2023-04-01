public class Hora {
    int horas;
    int minutos;
    int segundos;

    public Hora(){};
    public Hora(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }


    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public void mostrarHora(){
        if(horas < 10 || minutos < 10 || segundos < 10){
            String horasFormat = String.format("%02d", horas);
            String minutosFormat = String.format("%02d", minutos);
            String segundosFormat = String.format("%02d", segundos);
            System.out.println("La Hora es " + horasFormat + ":" + minutosFormat + ":" + segundosFormat);
        }
        else{
            System.out.println("La Hora es " + getHoras() + ":" + getMinutos() + ":" + getSegundos());
        }
    }

    public void avanzarSegundo(){
        segundos += 1;
        mostrarHora();
    }

    public void retrocederSegundo(){
        segundos -= 1;
        mostrarHora();
    }
}
