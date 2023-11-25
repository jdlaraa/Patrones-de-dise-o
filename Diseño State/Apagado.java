public class Apagado implements State{

    private Automovil auto;
    @Override
    public void encender() {
        System.out.println("Se ha encendido el Automovil");
        auto.setState(new Encendido());

    }

    @Override
    public void acelerar() {
        System.out.println("No se puede acelerar, el automovil se encuentra apagado");

    }

    @Override
    public void frenar() {

        System.out.println("No se puede frenar, el automovil se encuentra apagado");

    }

    @Override
    public void apagar() {
        System.out.println("El automovil ya se encuentra apagado");


    }

    @Override
    public void estado() {
        System.out.println("El estado del automovil es: apagado");

    }

    @Override
    public void setEstadoAutomovil(Automovil auto) {
        this.auto = auto;

    }
}
