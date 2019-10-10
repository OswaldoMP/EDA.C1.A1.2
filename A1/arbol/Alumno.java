public class Alumno{

    private String nombre, carrera, tutor, direccion, cuatrimestre, apellido;
    private int matricula;

    public Alumno(String nombre, String apellido, int matricula,String carrera, String tutor, String cuatrimestre,String direccion){
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
        this.carrera = carrera;
        this.tutor = tutor;
        this.cuatrimestre = cuatrimestre;
        this.direccion = direccion;
    }

    public void setNombre(String nombre){ this.nombre = nombre;}
    public void setApellido(String apellido){this.apellido = apellido;}
    public void setMatricula (int matricula){this.matricula = matricula;}
    public void setCarrera(String carrera){this.carrera = carrera;}
    public void setTutor(String tutor){this.tutor = tutor;}
    public void setcuatrimestre(String cuatrimestre){this.cuatrimestre = cuatrimestre;}
    public void setdireccion(String direccion){this.direccion = direccion;}

    public String getNombre(){return this.nombre;}
    public String getApellido(){return this.apellido;}
    public int getMatricula(){return this.matricula;}
    public String getCarrera(){return this.carrera;}
    public String getTutor(){return this.tutor;}
    public String getcuatrimestre(){return this.cuatrimestre;}
    public String getDireccion(){return this.direccion;}

    public String toString(){
        return "Matricula: "+ matricula +", Nombre: " + nombre+ " "+ apellido +", Carrera: "+carrera+", Cuatrimestre: "+ cuatrimestre + ", Tutor: "+tutor + ", Dirrecion: " + direccion; 
    }

    


}












