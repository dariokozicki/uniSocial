package Dominio.Roles;

import Dominio.Usuario;

public class Rol {


    public void darChance(Usuario usuario) throws Exception {
        throw new Exception("No tienes permiso para realizar esta accion.");
    }

}
