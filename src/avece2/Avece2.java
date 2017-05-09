package avece2;

import excepciones.CuentafaltateException;
import java.util.Iterator;
import java.util.Scanner;

public class Avece2 {

    public static void main(String[] args) throws CuentafaltateException {
        int y = 0;
        //Material<String> ss= new Material<>();
        //ss.add("a");
        //ss.add("b");
        //ss.add("c");
        //ss.borrar("b"); 
        //ss.borrar("c"); 
        String cedula = "",agnos="";
        int cedulai = 0,agnosi=0;
        Scanner scanner = new Scanner(System.in);
       

        Material<Revista> revistas = new Material<>();

        revistas.add(new Revista("El ingeniero", "Juan Fonseca", 2012, 1));
        revistas.add(new Revista("Paragigmas", "Shared Cobo", 2015, 1));
        revistas.add(new Revista("Teoria Robotica", "Cesar Cifuentes", 2012, 1));
        revistas.borrar(new Revista("Comando", "", 2013, 1));
        revistas.borrar(new Revista("Comando2", "", 2013, 1));
        int ano = revistas.material.get(1).getAgno();
        revistas.add(new Revista("La informacion", "David Perez", 2012, 1));
        y = revistas.disponibilidad(new Revista("La informacion", "David Perez", 2012, 1));
        Material<Libro> libros = new Material<>();
        libros.add(new Libro("Teoria De La informacion", "Maria Cifuentes", 1996, 1));
        libros.add(new Libro("Programacion Orientada A Objetos", "Juan Velasquez", 1990, 1));
        libros.add(new Libro("Matematicas Discritas", "Mario Cervantes", 1990, 1));
        libros.borrar(new Libro("Calculo I", "Steven Figu", 1982, 1));
        libros.add(new Libro("Matematicas Discritas", "Mario Cervantes", 1990, 1));
        y = libros.disponibilidad(new Libro("Programacion Orientada A Objetos", "Juan Velasquez", 1990, 1));
        Material<Tesis> tesis = new Material<>();
        tesis.add(new Tesis("Maquina COrtadora De Papa", "Gloria Alzate", 2000, 1));
        tesis.add(new Tesis("Diseño Maquina Dispensadora", "Juam Martinez", 2002, 1));
        tesis.add(new Tesis("Implementacion Sistema De Informacion", "Jualian CIfuenyes", 2014, 1));
        tesis.borrar(new Tesis("Diseño Maquina Dispensadora", "Juam Martinez", 2002, 1));
        y = tesis.disponibilidad(new Tesis("Maquina COrtadora De Papa", "Gloria Alzate", 2000, 1));
        Usuario<Alumno> alumnos = new Usuario<>();
        
        while(true){ //para cada uno de los datos es necesario saber que el usuario intruduzca un numero tanto en la ceudla como en la edad, si no es asi es necesario utilizar el try catch o si no se estallaria la aplicacion
        try {
             System.out.print("Introduzca Numero de Cedula");
        cedula = scanner.next();
            cedulai = Integer.parseInt(cedula);
            break;
        } catch (NumberFormatException a) {

        }
}
        
        while(true){
        try {
             System.out.print("Introduzca su edad");
        agnos = scanner.next();
            agnosi = Integer.parseInt(agnos);
            break;
        } catch (NumberFormatException a) {

        }
}
        
        
        alumnos.add(new Alumno("Cesar ", "Cifuentes", "cesarcifigu@gmail.com", cedula, agnosi));
        alumnos.add(new Alumno("Juan ", "Guillermo", "sdfsdgu@gmail.com", "5962826", 26));
        alumnos.borrar(new Alumno("Cesar ", "Cifuentes", "cesarcifigu@gmail.com", "4758296", 25));
        alumnos.add(new Alumno("Guillermo ", "Jimenez", "Guillermo@gmail.com", "4758296", 27));
        Usuario<Funcionario> funcionarios = new Usuario<>();
        funcionarios.add(new Funcionario("Cesar ", "Cifuentes", "cesarcifigu@gmail.com", "4758296", 455));
        funcionarios.add(new Funcionario("Juan ", "Guillermo", "sdfsdgu@gmail.com", "5962826", 26));
        funcionarios.borrar(new Funcionario("Cesar ", "Cifuentes", "cesarcifigu@gmail.com", "4758296", 455));
        funcionarios.add(new Funcionario("Guillermo ", "Jimenez", "Guillermo@gmail.com", "4758296", 27));
    }

}
