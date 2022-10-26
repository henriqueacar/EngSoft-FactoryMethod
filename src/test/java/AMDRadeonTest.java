import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AMDRadeonTest {

    @Test
    void configuracao() {
        IComputador computador = ComputadorFactory.mostrarConfiguracao("AMDRadeon");
        assertEquals("AMD e Radeon", computador.configuracao());
    }
}