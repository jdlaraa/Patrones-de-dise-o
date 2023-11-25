import java.util.HashMap;
import java.util.Map;

public class FlyweightStateFactory {
    private static final Map<String, FlyweightState> stateMap = new HashMap<>();

    static {
        stateMap.put("Encendido", new EncendidoFlyweight());
        stateMap.put("Apagado", new ApagadoFlyweight());
        stateMap.put("Acelerado", new AceleradoFlyweight());
        stateMap.put("Frenado", new FrenadoFlyweight());
    }

    public static FlyweightState getState(String stateType) {
        return stateMap.get(stateType);
    }
}
