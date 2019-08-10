package Dominio;

public class MalaReputacion implements Reputacionable {

    public void realizarAporte(Aporte aporte) throws Exception {
        throw new Exception("No tienes la reputacion para realizar esta accion");
    }
}
