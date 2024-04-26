public class empleado {

    private String Nombre;
    private int Edad;
    private String Apellido;
    private String Direccion;
    private String Cargo;


public empleado (String nombre, int edad, String direccion, String apellido, String cargo) {
        Nombre = nombre;
        Edad = edad;
        Direccion = direccion;
        Apellido = apellido;
        Cargo = cargo;
    
}


public String getNombre() {
    return Nombre;
}


public void setNombre(String nombre) {
    Nombre = nombre;
}


public int getEdad() {
    return Edad;
}


public void setEdad(int edad) {
    Edad = edad;
}


public String getApellido() {
    return Apellido;
}


public void setApellido(String apellido) {
    Apellido = apellido;
}


public String getDireccion() {
    return Direccion;
}


public void setDireccion(String direccion) {
    Direccion = direccion;
}


public String getCargo() {
    return Cargo;
}


public void setCargo(String cargo) {
    Cargo = cargo;
}



}