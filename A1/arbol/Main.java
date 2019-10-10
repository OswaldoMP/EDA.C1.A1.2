import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Arbol arbol;
        Arbol arbol1 = new Arbol();

        Scanner sc = new Scanner(System.in);

        Alumno alumno = new Alumno("Adrian Oswaldo", "Morales Perez", 171152, "IDS", "FonBon", "9", "Col. 15 de mayo");
        Alumno alumno2 = new Alumno("Osman Mauricio", "Morales Perez", 171152, "ITA", "Carlos", "8", "Col. 15 de mayo");
        Alumno alumno3 = new Alumno("Ramon", "Alvarado Alvarez", 171106, "IDS", "Diana", "9", "Col. santa maria");
        Alumno alumno4 = new Alumno("Juan", "Sanchez Sanchez", 171153, "BIO", "Ali", "5", "Col. la salle");
        Alumno alumno5 = new Alumno("Alejandro", "Gomez Perez", 143142, "BIO", "Velasco", "10", "Col. juarez");
        Alumno alumno6 = new Alumno("Kevin Gerardo", "Gomez Perez", 161152, "MECA", "Li", "7", "Col. juarez");
        Alumno alumno7 = new Alumno("Cesar Adolfo", "Alfaro Perez", 171182, "MECA", "Li", "6", "Col. juarez");
        Alumno alumno8 = new Alumno("Carlos Andres", "Morales Banda", 161152, "IDS", "FonBon", "9", "Col. bienestar social");
        Alumno alumno9 = new Alumno("Pedro", "Gutierrez Lopez", 173152, "ITA", "FonBon", "4", "Col. Brasilito");
        Alumno alumno10 = new Alumno("Moises", "Cholac Sanchez", 163152, "ITA", "Rocio", "6", "Col. la mision");
        Alumno alumno11 = new Alumno("Alexis Martin", "Roque Jimeno", 171142, "AGRO", "Claudia", "9", "Col. las brisas");
        Alumno alumno12 = new Alumno("Alexis", "Bartolon Diaz", 171123, "IDS", "Diana", "8", "Col. colonial");
        Alumno alumno13 = new Alumno("David", "Perez Sanchez", 171232, "AGRO", "Carlos", "3", "Col. el vergel");

        int matriculaAlumno = 0;
        String nombreAlumno = "";
        //0 = matricula - 1 = nombre
        int flag = 1;
        
    do {
        System.out.println("1.- Orden por Matricula \n2.- Orden por Apellido \n3.- Salir");
        flag = sc.nextInt();
        if (flag == 1) {
            arbol = new Arbol();
            arbol.agregar(alumno,flag);
            arbol.agregar(alumno2,flag);
            arbol.agregar(alumno3,flag);
            arbol.agregar(alumno4,flag);
            arbol.agregar(alumno5,flag);
            arbol.agregar(alumno6,flag);
            arbol.agregar(alumno7,flag);
            arbol.agregar(alumno8,flag);
            arbol.agregar(alumno9,flag);
            arbol.agregar(alumno10,flag);
            arbol.agregar(alumno11, flag);
            arbol.agregar(alumno12, flag);
            arbol.agregar(alumno13, flag);
            arbol.inOrden(arbol.getNodo());
        }else{
            arbol = new Arbol();
            arbol.agregar(alumno,flag);
            arbol.agregar(alumno2,flag);
            arbol.agregar(alumno3,flag);
            arbol.agregar(alumno4,flag);
            arbol.agregar(alumno5,flag);
            arbol.agregar(alumno6,flag);
            arbol.agregar(alumno7,flag);
            arbol.agregar(alumno8,flag);
            arbol.agregar(alumno9,flag);
            arbol.agregar(alumno10,flag);
            arbol.agregar(alumno11, flag);
            arbol.agregar(alumno12, flag);
            arbol.agregar(alumno13, flag);
            arbol.inOrdenName(arbol.getNodo());
        }
    } while (flag != 3);
        


    }



}



