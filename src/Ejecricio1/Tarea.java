package Ejecricio1;

import java.util.Date;

public class Tarea {

    private String tituloTarea;
    private String descipcion;
    private  Date fechaEntrega;

    private Estado estado;
    private Estado estadoAnterior;

    public Tarea(String tituloTarea, String descipcion, Date fechaEntrega, Estado estado) {
        this.tituloTarea = tituloTarea;
        this.descipcion = descipcion;
        this.fechaEntrega = fechaEntrega;
        this.estado = estado;
        this.estadoAnterior = estado;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Estado getEstadoAnterior() {
        return estadoAnterior;
    }

    public void setEstadoAnterior(Estado estadoAnterior) {
        this.estadoAnterior = estadoAnterior;
    }

    public String getTituloTarea() {
        return tituloTarea;
    }

    public void setTituloTarea(String tituloTarea) {
        this.tituloTarea = tituloTarea;
    }

    public String getDescipcion() {
        return descipcion;
    }

    public void setDescipcion(String descipcion) {
        this.descipcion = descipcion;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }
}
