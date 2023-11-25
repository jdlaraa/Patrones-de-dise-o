public class Automovil {

    private State estado;

    public Automovil() {
        setState(new Apagado());
    }

    public void setState(State estado){
        this.estado = estado;
        this.estado.setEstadoAutomovil(this);
    }


    public void encender() {
        this.estado.encender();
    }

    public void apagar() {
        this.estado.apagar();
    }

    public void acelerar() {
        this.estado.acelerar();
    }

    public void frenar() {
        this.estado.frenar();
    }

    public void estado() {
        this.estado.estado();
    }
}
