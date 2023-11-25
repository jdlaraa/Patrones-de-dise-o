public class AutomovilFlyweight {
    private FlyweightState estado;

    public void setState(String stateType) {
        this.estado = FlyweightStateFactory.getState(stateType);
    }

    public void realizarAccion() {
        this.estado.realizarAccion();
    }
}
