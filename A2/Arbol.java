public class Arbol{

    private Nodo nodoRaiz;

    public Arbol(){
        this.nodoRaiz = null;
    }

    public void agregar(String dato,String name,int flag) {
        if (flag == 0) {
            Nodo nodoNew = new Nodo(dato, null, null,name);
            add(nodoNew, nodoRaiz);
            
        }else{

        Nodo nodoNew2 = new Nodo(dato, null, null,name);
        addName(nodoNew2,nodoRaiz);
        }
        //return true;
    }
 

    public void add(Nodo nodoNew, Nodo pivote) {//orden expediente
        if (this.nodoRaiz == null) {
            nodoRaiz = nodoNew;
        } else {
            if (nodoNew.getDato().compareTo(pivote.getDato())<0) {
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

    public void addName(Nodo nodoNew, Nodo pivote) {//orden alfabetico
        if (this.nodoRaiz == null) {
            nodoRaiz = nodoNew;
        } else {
            if (nodoNew.getName().compareTo(pivote.getName())<0) {
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
            System.out.println(nodo.getDato());
            inOrden(nodo.getDer());
        }
    }

    public void inOrdenName(Nodo nodo){
        if(nodo!=null){
            inOrdenName(nodo.getIzq());
            System.out.println(nodo.getName());
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









