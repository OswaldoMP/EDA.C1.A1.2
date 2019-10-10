public class Arbol{

    private Nodo nodoRaiz;

    public Arbol(){
        this.nodoRaiz = null;
    }

    public void agregar(Alumno alumno, int flag) {
        if (flag == 1) {
            Nodo nodoNew = new Nodo(alumno, null, null);
            add(nodoNew, nodoRaiz);
            
        }else{

        Nodo nodoNew2 = new Nodo(alumno, null, null);
        addName(nodoNew2,nodoRaiz);
        }
        //return true;
    }
 

    public void add(Nodo nodoNew, Nodo pivote) {
        if (this.nodoRaiz == null) {
            nodoRaiz = nodoNew;
        } else {
            if (nodoNew.getAlumno().getMatricula() <= pivote.getAlumno().getMatricula()) {
                if (pivote.getIzq() == null) {
                    pivote.setIzq(nodoNew);
                } else {
                    add(nodoNew, pivote.getIzq());
                }
            } else {
                if (pivote.getDer() == null) {
                    pivote.setDer(nodoNew);
                } else {
                    add(nodoNew, pivote.getDer());
                }
            }
        }

    }

    public void addName(Nodo nodoNew, Nodo pivote) {
        if (this.nodoRaiz == null) {
            nodoRaiz = nodoNew;
        } else {
            if (nodoNew.getAlumno().getApellido().compareTo(pivote.getAlumno().getApellido())<0) {
                if (pivote.getIzq() == null) {
                    pivote.setIzq(nodoNew);
                } else {
                    addName(nodoNew, pivote.getIzq());
                }
            } else {
                if (pivote.getDer() == null) {
                    pivote.setDer(nodoNew);
                } else {
                    addName(nodoNew, pivote.getDer());
                }
            }
        }

    }

    public Nodo getNodo(){
        return nodoRaiz;
    }

    public void inOrden(Nodo nodo){
        if(nodo!=null){
            inOrden(nodo.getIzq());
            System.out.println(nodo.getAlumno().toString());
            inOrden(nodo.getDer());
        }
    }

    public void inOrdenName(Nodo nodo){
        if(nodo!=null){
            inOrdenName(nodo.getIzq());
            System.out.println(nodo.getAlumno().toString());
            inOrdenName(nodo.getDer());
        }
    }

    // public ArrayList inOrden() {
    //     ArrayList l=new ArrayList();
    //     inOrden(raiz,l);
    //     return l;
    // }

    // private void inOrden(Nodo reco,ArrayList l) {
    //     if (reco != null) {
    //         inOrden(reco.getIzq(),l);
    //         l.add(reco.getDato() + " ");
    //         inOrden(reco.getDer(),l);
    //     }
    // }


}









