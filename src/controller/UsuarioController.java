package controller;

import dao.UsuarioDAO;
import factory.ConnectionFactory;

public class UsuarioController {

    private UsuarioDAO usuarioDAO;

    public UsuarioController() {
        this.usuarioDAO = new UsuarioDAO();
    }


    public boolean autenticar(String usuario, String password) {
        return usuarioDAO.authUser(usuario, password);

    }

}
