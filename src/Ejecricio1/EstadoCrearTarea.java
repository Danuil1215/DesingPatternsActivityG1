package Ejecricio1;

public class EstadoCrearTarea implements Estado{

    @Override
    public void editar(Tarea tarea) {
        tarea.setEstadoAnterior(tarea.getEstado());
        tarea.setEstado(new EstadoEditarTarea());
    }

    @Override
    public void completar(Tarea tarea) {
        tarea.setEstadoAnterior(tarea.getEstado());
        tarea.setEstado(new EstadoCompletarTarea());
    }

    @Override
    public void eliminar(Tarea tarea) {
        tarea.setEstadoAnterior(tarea.getEstado());
        tarea.setEstado(new EstadoEliminarTarea());
    }

    @Override
    public void reversar(Tarea tarea) {
        if(tarea.getEstadoAnterior() instanceof EstadoCrearTarea){
            System.out.println("La tarea "+tarea.getTituloTarea()+" no se puede reversar a un estado anterior");
        }
        tarea.setEstado(tarea.getEstadoAnterior());
        tarea.setEstadoAnterior(new EstadoCrearTarea());
    }
}
