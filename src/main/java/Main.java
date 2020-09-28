import java.util.ArrayList;

public class Main {
    public static Usuario usuarioLogueado;
    public static void main(String[] args) {
        ArrayList<Usuario> misUsuarios = new ArrayList<Usuario>();
        Empleado empleado1 = new Empleado();
        Empleado empleado2 = new Empleado();
        Usuario usuario1 = new Usuario();

        misUsuarios.add(empleado1);
        misUsuarios.add(empleado2);
        misUsuarios.add(usuario1);

        Usuario ejemplo = empleado1;

        for(Usuario miUsuario : misUsuarios){
            if(miUsuario.cedula == 1012010012){
                usuarioLogueado = miUsuario;
                break;
            }
        }

    }
}
