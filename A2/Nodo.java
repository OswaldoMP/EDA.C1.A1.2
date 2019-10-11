public class Nodo {
    
    private ExpedienteMedico expedienteMedico;
    private String name;
    private Nodo izq, der;

    public Nodo(ExpedienteMedico expedienteMedico, Nodo izq, Nodo der) {
        this.expedienteMedico = expedienteMedico;
        this.izq = izq;
        this.der = der;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public ExpedienteMedico getexpedienteMedico() {
        return expedienteMedico;
    }

    public void setexpedienteMedico(ExpedienteMedico expedienteMedico) {
        this.expedienteMedico = expedienteMedico;
    }

    public Nodo getIzq() {
        return izq;
    }

    public void setIzq(Nodo izq) {
        this.izq = izq;
    }

    public Nodo getDer() {
        return der;
    }

    public void setDer(Nodo der) {
        this.der = der;
    } 

}
