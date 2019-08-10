package Dominio;

import java.util.ArrayList;

public class Aporte {
    private final ArrayList<String> archivos;
    private final String topico;
    private Puntuacion puntuacion;
    private final Usuario usuario;

    public Aporte(ArrayList<String> archivos,String topico,Usuario usuario){
        this.archivos = archivos;
        this.topico = topico;
        this.usuario = usuario;
    }
    public void serPuntuada(Puntuacion puntuacion){
        this.puntuacion = new Puntuacion(puntuacion);
        if (usuario.tieneMalaReputacion()){
            usuario.setReputacion(new MalaReputacion());
        }
    }
    public int getValueOfPuntuacion(){
        return puntuacion.getValue();
    }

    public Usuario getUsuario() {
        return usuario;
    }
}
