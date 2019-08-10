package Dominio.Roles;

import Dominio.BuenaReputacion;
import Dominio.Usuario;

public class EmpleadoAdministrativo extends Rol{
    @Override
    public void darChance(Usuario usuario){
        usuario.setReputacion(new BuenaReputacion());
    }
}
