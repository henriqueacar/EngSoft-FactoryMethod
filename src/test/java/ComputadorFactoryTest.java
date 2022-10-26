import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputadorFactoryTest {

    @Test
    void mostrarConfiguracaoIntelNvidia() {
        try{
            IComputador computador = ComputadorFactory.mostrarConfiguracao("IntelNvidia");
        } catch (Exception e){
            assertEquals("Configuração inválida.", e.getMessage());
        }
    }

    @Test
    void mostrarConfiguracaoAMDRadeon() {
        try{
            IComputador computador = ComputadorFactory.mostrarConfiguracao("AMDRadeon");
        } catch (Exception e){
            assertEquals("Configuração inválida.", e.getMessage());
        }
    }

    @Test
    void mostrarConfiguracaoInvalida() {
        try{
            IComputador computador = ComputadorFactory.mostrarConfiguracao("IntelRadeon");
            fail();
        } catch (Exception e){
            assertEquals("Configuração inválida.", e.getMessage());
        }
    }

}