import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntelNvidiaTest {

    @Test
    void configuracao() {
        IComputador computador = ComputadorFactory.mostrarConfiguracao("IntelNvidia");
        assertEquals("Intel e Nvidia", computador.configuracao());
    }
}