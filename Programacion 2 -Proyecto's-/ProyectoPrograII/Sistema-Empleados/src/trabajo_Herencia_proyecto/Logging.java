
package trabajo_Herencia_proyecto;

public class Logging {
    public String logging_usuario(String usuario, String password)
    {
        // auxi
        String mensaje;
        if (usuario.equals("Admin")&& password.equals("1111"))
            mensaje = "Usuario Admin logeado";
        else if ((usuario.equals("Juan")&& password.equals("1234")))
                mensaje = "Usuario Juan René logeado";
        else if ((usuario.equals("Santiago")&& password.equals("4321")))
                mensaje = "Usuario Santiago logeado";
        else if ((usuario.equals("Elder")&& password.equals("0000")))
                mensaje = "Usuario Elder Bol logeado";
        else 
            mensaje = "Usurio y/o contraseña incorrecta";
        
        return mensaje;
                         
    }
}
