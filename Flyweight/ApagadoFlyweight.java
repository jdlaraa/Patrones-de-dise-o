public class ApagadoFlyweight implements FlyweightState {
    @Override
    public void realizarAccion() {
        System.out.println("No se puede realizar la acción, el automóvil se encuentra apagado");
    }
}
