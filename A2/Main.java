public class Main{

    public static void main(String[] args) {
        Arbol arbol = new Arbol();
        
        int matriculaAlumno = 0;
        String nombreAlumno = "";
        //0 = expediente - 1 = apellido
        int flag = 1;
        arbol.agregar("mopa20/10/19","morales perez adrian oswaldo",flag);
        arbol.agregar("mopo04/09/17","morales perez osman mauricio",flag);
        arbol.agregar("goaf8/02/15","gonzalez alvarez fabian",flag);
        arbol.agregar("tugj10/07/14","turren gutierrez julio nathaniel",flag);
        arbol.agregar("gopa23/05/12","gomez perez alejandro",flag);
        arbol.agregar("gopk31/10/18","gomez perez kevin gerardo",flag);
        arbol.agregar("napw16/06/00","najera perez waximara isabel",flag);
        arbol.agregar("zash13/03/05","zavaleta silvestre hugo",flag);
        arbol.agregar("perr23/01/10","perez robles reyneria",flag);
        arbol.agregar("alpc25/07/11","alfaro perez cesar adolfo",flag);
        
        if (flag == 0) {
            System.out.println("ORDEN POR EXPEDIENTE: ");
            arbol.inOrden(arbol.getNodo());
            System.out.println("----------------------------");
        }else{
            System.out.println("ORDEN POR APELLIDO: ");
            arbol.inOrdenName(arbol.getNodo());
            System.out.println("----------------------------");
        }
        


    }



}



