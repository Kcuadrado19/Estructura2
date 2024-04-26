import java.util.LinkedList;
import java.util.Scanner;
public class proyecto{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       LinkedList <empleado> empleados= new LinkedList<>();
        for (int i=0; i<3; i++) {
            empleado item = new empleado(null, i, null, null, null);
            System.out.println("Ingrese nombre");
            item.setNombre(sc.next());
            System.out.println("Ingrese la edad");
            item.setEdad(sc.nextInt());
            System.out.println("Ingrese direccion");
            item.setDireccion(sc.next());
            System.out.println("Ingrese apellido");
            item.setApellido(sc.next());
            System.out.println("Ingrese cargo");
            item.setCargo(sc.next());
            
            empleados.add(item);
          }

          String cadena = " ";
          for (empleado empleado : empleados) {

            cadena = cadena + empleado.getNombre()+ "\n" +empleado.getApellido()+"\n"+empleado.getEdad()+ "\n"+ empleado.getDireccion()+"\n" +empleado.getCargo();

            System.out.println(cadena);
          }
     sc.close();  

        
    }
}