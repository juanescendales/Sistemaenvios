public class Usuario {

    public int cedula;
    public String nombre;
    public String apellido;
    public String correo;
    public String contraseña;
    public String rol;

    public Usuario(){

    }

    public Usuario(int cedula, String nombre, String apellido, String correo, String contraseña, String rol) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contraseña = contraseña;
        this.rol = rol;
    }


}
