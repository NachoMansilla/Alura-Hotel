package pruebas;

import dao.UsuarioDAO;

public class PruebaUsuarioDAO {
    public static void main(String[] args) {
        UsuarioDAO usuario = new UsuarioDAO();
        boolean respuestaVerificacion = usuario.authUser("test", "test");
        System.out.println(respuestaVerificacion);
    }
}
