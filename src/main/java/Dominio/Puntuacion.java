package Dominio;

public class Puntuacion {
    private final int value;
    public Puntuacion(int value) throws Exception {
        if (value>=1 && value<=5){
            this.value = value;
        }else{
            throw new Exception("Dominio.Puntuacion fuera de rango. Debe estar entre 1 y 5.");
        }
    }
    public int getValue(){
        return value;
    }
    public Puntuacion(Puntuacion puntuacion){
        this.value = puntuacion.getValue();
    }
}
