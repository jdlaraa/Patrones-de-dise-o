public class Acelerado implements State {
    private Automovil auto;
    @Override
    public void encender() {
        System.out.println("El automovil ya se encuentra encendido");

    }

    @Override
    public void acelerar() {
        System.out.println("El automovil se esta acelerando");
        auto.setState(new Acelerado());

    }

    @Override
    public void frenar() {

        System.out.println("El vehiculo esta frenado");
        auto.setState(new Frenado());

    }

    @Override
    public void apagar() {
        System.out.println("Para apagar primero debes frenar");


    }

    @Override
    public void estado() {
        System.out.println("El estado del automovil es: Acelerado");

    }

    @Override
    public void setEstadoAutomovil(Automovil auto) {
        this.auto = auto;

    }
}
