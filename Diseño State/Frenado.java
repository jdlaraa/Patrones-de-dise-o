public class Frenado implements State {
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
        System.out.println("El automovil ya esta frenado");
    }

    @Override
    public void apagar() {
        System.out.println("El automovil ha sido apagado");
        auto.setState(new Apagado());


    }

    @Override
    public void estado() {
        System.out.println("El estado del automovil es: Frenado");

    }

    @Override
    public void setEstadoAutomovil(Automovil auto) {
        this.auto = auto;

    }
}
