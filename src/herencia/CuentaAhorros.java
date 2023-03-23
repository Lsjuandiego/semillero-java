package herencia;
public class CuentaAhorros extends Cuenta{
    private boolean estadoActiva;

    /***
     *  @param saldo
     * @param porcentajeTasaAnual
     */
    public CuentaAhorros(float saldo, float porcentajeTasaAnual) {
        super(saldo, porcentajeTasaAnual);
        if(saldo < 10000){
            estadoActiva = false;
        }else{
            estadoActiva = true;
            //consignarDinero();
            //retirarDinero();
        }

    }

    @Override
    public void consignarDinero(float cantidad) {
        if(estadoActiva){
            super.consignarDinero(cantidad);
        }
    }

    @Override
    public void retirarDinero(float cantidad) {
        if(estadoActiva){
            super.retirarDinero(cantidad);
        }
    }

    @Override
    public void extractoMensual() {
        if(numeroRetiros>4){
            comisionMensual += (numeroRetiros-4)*1000;
        }
        super.extractoMensual();
        if(saldo<10000){
            estadoActiva = false;
        }
    }

    @Override
    public void imprimir() {
        super.imprimir();
    }
}
