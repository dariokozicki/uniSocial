package Dominio;

import Dominio.Roles.Rol;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private String apellido;
    private LocalDateTime fechaDeNacimiento;
    private long legajo;
    private String mail;
    private long telefono;
    private Rol rol;
    private ArrayList<Aporte> aportes;
    private Reputacionable reputacion;

    public Usuario(String nombre,String apellido,LocalDateTime fechaDeNacimiento, long legajo,String mail,
                   long telefono, Rol rol){
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.legajo = legajo;
        this.mail = mail;
        this.telefono = telefono;
        this.rol = rol;
        aportes = new ArrayList<>();
        reputacion = new BuenaReputacion();
    }
    public void realizarAporte(ArrayList<String> archivos,String topico) throws Exception {
           reputacion.realizarAporte(new Aporte(archivos, topico, this));
    }
    public boolean tieneMalaReputacion(){
        return aportes.stream()
                .map(aporte -> aporte.getValueOfPuntuacion())
                .reduce(0,(sub,e)->sub+e) / aportes.size() * 2 < 3;
    }
    public void setReputacion(Reputacionable reputacion){
        this.reputacion = reputacion;
    }
    public void darChance(Usuario usuario) throws Exception {
        rol.darChance(usuario);
    }
    public void agregarAporte(Aporte aporte){
        aportes.add(aporte);
    }
    public void puntuar(Aporte aporte,Puntuacion puntuacion){
        aporte.serPuntuada(puntuacion);
    }
}
