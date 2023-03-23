package herencia;
public class CuentaCorriente extends Cuenta{


    float sobregiro;
    /***
     *  @param saldo
     * @param porcentajeTasaAnual
     */
    public CuentaCorriente(float saldo, float porcentajeTasaAnual) {
        super(saldo, porcentajeTasaAnual);
        sobregiro = 0;
    }

    @Override
    public void retirarDinero(float cantidad) {
        float diferencia = saldo - cantidad;
        if(diferencia<0){
            sobregiro = sobregiro-diferencia;
            saldo = 0;

        }else{
            super.retirarDinero(cantidad);
        }
    }

    @Override
    public void consignarDinero(float cantidad) {
        float residuo = sobregiro-cantidad;
        if(sobregiro>0){
            if(residuo>0){
                sobregiro = 0;
                saldo= residuo;
            }else{
                sobregiro=-residuo;
                saldo=0;
            }
        }else{
            super.consignarDinero(cantidad);
        }
    }

    @Override
    public void extractoMensual() {
        super.extractoMensual();
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("valor del sobregiro "+sobregiro);
    }
}
