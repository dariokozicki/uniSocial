package Dominio;

public class BuenaReputacion implements Reputacionable {

    @Override
    public void realizarAporte(Aporte aporte) throws Exception {
        aporte.getUsuario().agregarAporte(aporte);
    }
}
