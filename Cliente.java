package domain;

import java.util.Date;

public class Cliente extends Personas {

    private int idCliente;
    private Date fechaREgistro;
    private boolean vip;
    private static int contadorCliente;

    public Cliente(Date fechaREgistro, boolean vip, String nombre, char genero, int edad, String direccion) {
        super(nombre, genero, edad, direccion);
        this.idCliente = ++Cliente.contadorCliente;
        this.fechaREgistro = fechaREgistro;
        this.vip = vip;

    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Date getFechaREgistro() {
        return fechaREgistro;
    }

    public void setFechaREgistro(Date fechaREgistro) {
        this.fechaREgistro = fechaREgistro;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
//Stringbuilder en lugar de concatenar this. accede a los atributos de la clase
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{idCliente=").append(this.idCliente);
        sb.append(",fechaREgistro=").append(this.fechaREgistro);
        sb.append(",vip=").append(this.vip);
        sb.append(",").append(super.toString());
        sb.append('}');
        return sb.toString();
    }




}
