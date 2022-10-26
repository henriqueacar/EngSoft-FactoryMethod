public class ComputadorFactory {

    public static IComputador mostrarConfiguracao(String config){
        Class classe = null;
        Object objeto = null;

        try {
            classe = Class.forName(config);
            objeto = classe.newInstance();
        } catch (Exception e){
            throw new IllegalArgumentException("Configuração inválida.");
        }
        if(!(objeto instanceof IComputador)){
            throw new IllegalArgumentException("Computador inválido.");
        }

        return (IComputador) objeto;
    }


}
