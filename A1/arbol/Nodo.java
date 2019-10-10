public class Nodo {
    
    private int dato;
    private Alumno alumno;
    private String name;
    private Nodo izq, der;

    public Nodo(Alumno alumno, Nodo izq, Nodo der) {
        this.alumno = alumno;
        this.izq = izq;
        this.der = der;
    }

    public void setAlumno(Alumno alumno){ this.alumno = alumno;}
    public Alumno getAlumno(){ return this.alumno;}

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
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
