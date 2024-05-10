package Ejecricio1;

public class EstadoEliminarTarea implements Estado{

    @Override
    public void editar(Tarea tarea) {
        tarea.setEstado(tarea.getEstado());
        tarea.setEstado(new EstadoEditarTarea());
    }

    @Override
    public void completar(Tarea tarea) {

    }

    @Override
    public void eliminar(Tarea tarea) {

    }

    @Override
    public void reversar(Tarea tarea) {

    }
}
