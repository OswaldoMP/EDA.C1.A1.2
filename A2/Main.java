import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Arbol arbol;
        
        Scanner sc = new Scanner(System.in);


        int matriculaExpedienteMedico = 0;
        String nombreExpedienteMedico = "";
        //0 = expediente - 1 = apellido

      ExpedienteMedico ExpedienteMedico = new ExpedienteMedico("Adrian Oswaldo", "Morales Perez", "MOPA980113", "10/10/19");
      ExpedienteMedico ExpedienteMedico2 = new ExpedienteMedico("Osman Mauricio", "Morales Perez", "MOPA000904", "31/12/14");
      ExpedienteMedico ExpedienteMedico3 = new ExpedienteMedico("Ramon", "Alvarado Alvarez", "ALAR02515", "52/18/96");
      ExpedienteMedico ExpedienteMedico4 = new ExpedienteMedico("Juan", "Sanchez Sanchez", "SASJ000201", "8/12/14");
      ExpedienteMedico ExpedienteMedico5 = new ExpedienteMedico("Alejandro", "Gomez Perez", "GOPA970616", "8/14/12");
      ExpedienteMedico ExpedienteMedico6 = new ExpedienteMedico("Kevin Gerardo", "Gomez Perez", "GOPK000905", "10/08/12");
      ExpedienteMedico ExpedienteMedico7 = new ExpedienteMedico("Cesar Adolfo", "Alfaro Perez", "ALPC961113", "23/8/00");
      ExpedienteMedico ExpedienteMedico8 = new ExpedienteMedico("Carlos Andres", "Morales Banda", "MOBC981025", "10/10/15");
      ExpedienteMedico ExpedienteMedico9 = new ExpedienteMedico("Pedro", "Gutierrez Lopez", "GULP972312", "25/04/13");
      ExpedienteMedico ExpedienteMedico10 = new ExpedienteMedico("Moises", "Cholac Sanchez", "CHSM032703", "23/04/17");
     

        int flag = 1;

        do {
            System.out.println("1.- ORDEN POR APELLIDO \n2.- ORDEN POR EXPEDIENTE \n3.- Salir");
            flag = sc.nextInt();
            if (flag == 1) {
                arbol = new Arbol();
                arbol.agregar(ExpedienteMedico,flag);
                arbol.agregar(ExpedienteMedico2,flag);
                arbol.agregar(ExpedienteMedico3,flag);
                arbol.agregar(ExpedienteMedico4,flag);
                arbol.agregar(ExpedienteMedico5,flag);
                arbol.agregar(ExpedienteMedico6,flag);
                arbol.agregar(ExpedienteMedico7,flag);
                arbol.agregar(ExpedienteMedico8,flag);
                arbol.agregar(ExpedienteMedico9,flag);
                arbol.agregar(ExpedienteMedico10,flag);
                System.out.println("ORDEN POR APELLIDO: ");
                arbol.inOrden(arbol.getNodo());
                System.out.println("----------------------------");
            }else{
                arbol = new Arbol();
                arbol.agregar(ExpedienteMedico,flag);
                arbol.agregar(ExpedienteMedico2,flag);
                arbol.agregar(ExpedienteMedico3,flag);
                arbol.agregar(ExpedienteMedico4,flag);
                arbol.agregar(ExpedienteMedico5,flag);
                arbol.agregar(ExpedienteMedico6,flag);
                arbol.agregar(ExpedienteMedico7,flag);
                arbol.agregar(ExpedienteMedico8,flag);
                arbol.agregar(ExpedienteMedico9,flag);
                arbol.agregar(ExpedienteMedico10,flag);
                System.out.println("ORDEN POR EXPEDIENTE: ");
                arbol.inOrdenName(arbol.getNodo());
                System.out.println("----------------------------");
            }
        } while (flag != 3);

    }



}



