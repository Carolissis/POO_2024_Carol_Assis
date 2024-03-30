import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cargos {

    private static final List<String> cargos = new ArrayList<>(Arrays.asList("Cliente", "Funcionário", "Gerente"));

    public static String getCargos(int cargoUsuario) {
        return cargos.get(cargoUsuario); 
    }
}
