public class Empleado extends Usuario {
    public String cargo;
    public String sueldo;

    public Empleado(){

    }
    public Empleado(int cedula, String nombre, String apellido, String correo, String contraseña, String rol,String cargo, String sueldo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contraseña = contraseña;
        this.rol = rol;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }
}
