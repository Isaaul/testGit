package domain;

//extends para heredar 
public class Empleado extends Personas {

    private int idEmpleado;
    private double sueldo;
//variable statica se asocia con la clase y no con los objetos
    private static int contadorEmpleado;

    public Empleado(String nombre, double sueldo) {
        super(nombre);
        this.idEmpleado = ++Empleado.contadorEmpleado;
        this.sueldo = sueldo;
    }

//constructor
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

//tostring
    @Override
    public String toString() {
//Stringbuilder en lugar de concatenar this. accede a los atributos de la clase
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{idEmpelado=").append(this.idEmpleado);
        sb.append(",sueldo=").append(this.sueldo);
        sb.append(",").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

}
