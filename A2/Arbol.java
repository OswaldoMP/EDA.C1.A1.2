public class Arbol{

    private Nodo nodoRaiz;

    public Arbol(){
        this.nodoRaiz = null;
    }

    public void agregar(ExpedienteMedico expedienteMedico,int flag) {
        if (flag == 1) {
            Nodo nodoNew = new Nodo(expedienteMedico, null, null);
            add(nodoNew, nodoRaiz);
            
        }else{

        Nodo nodoNew2 = new Nodo(expedienteMedico, null, null);
        addName(nodoNew2,nodoRaiz);
        }
        //return true;
    }
 

    public void add(Nodo nodoNew, Nodo pivote) {//orden expediente
        if (this.nodoRaiz == null) {
            nodoRaiz = nodoNew;
        } else {
            if (nodoNew.getexpedienteMedico().getApellido().compareTo(pivote.getexpedienteMedico().getApellido())<0) {
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
            if (nodoNew.getexpedienteMedico().getExpediente().compareTo(pivote.getexpedienteMedico().getExpediente())<0) {
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
            System.out.println(nodo.getexpedienteMedico().toString());
            inOrden(nodo.getDer());
        }
    }

    public void inOrdenName(Nodo nodo){
        if(nodo!=null){
            inOrdenName(nodo.getIzq());
            System.out.println(nodo.getexpedienteMedico().toStringExpediente());
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









