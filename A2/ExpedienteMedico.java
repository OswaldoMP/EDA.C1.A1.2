public class ExpedienteMedico{

    private String nombre,curp,fecha,apellido,expediente;

    public ExpedienteMedico(String nombre, String apellido, String curp, String fecha){
        this.nombre = nombre;
        this.curp = curp;
        this.fecha = fecha;
        this.apellido = apellido;
        createExpediente();
    }

    public void setNombre(String nombre){this.nombre = nombre;}
    public void setApellido(String apellido){this.apellido = apellido;}
    public void setCurp(String curp){ this.curp = curp;}
    public void setFecha(String fecha){this.fecha = fecha;}

    public String getNombre (){return this.nombre;}
    public String getApellido(){return this.apellido;}
    public String getCurp(){return this.curp;}
    public String getFecha(){return this.fecha;}

    public String toString() {
        // TODO Auto-generated method stub
        return "Nombre: " + apellido + " " + nombre + ", Curp: " + curp + ", Fecha: " + fecha + ", EXPEDIENTE: "+ expediente;
    }

    public String toStringExpediente(){
        return "EXPEDIENTE: " + expediente + ", Nombre: " + apellido + " " + nombre + ", Curp: " + curp + ", Fecha: " + fecha;
    }

    public void createExpediente(){
        this.expediente = curp + fecha;
    }

    public String getExpediente(){return this.expediente;}








}











