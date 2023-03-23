package herencia;

public class Cuenta {
    protected float saldo;
    protected int numeroConsignaciones = 0;
    protected int numeroRetiros = 0;
    protected float porcentajeTasaAnual;
    protected float comisionMensual = 0;


    /***
     *
     * @param saldo
     * @param porcentajeTasaAnual
     */
    public Cuenta (float saldo, float porcentajeTasaAnual){
        this.saldo = saldo;
        this.porcentajeTasaAnual = porcentajeTasaAnual;
    }

    /***
     * Recibe una cantidad de dinero a consignar y
     * actualiza el número de consignaciones
     * @param cantidad
     */
    public void consignarDinero(float cantidad){
        saldo = saldo + cantidad;
        numeroConsignaciones = numeroConsignaciones + 1;
    }

    //Retirar una cantidad de dinero en la cuenta actualizando su saldo.
    public void retirarDinero(float cantidad){
        float nuevoSaldo = saldo-cantidad;
        if(nuevoSaldo >= 0){
            saldo -= cantidad;
            numeroRetiros = numeroRetiros+1;
        }else{
            System.out.println("La cantidad a retirar excede el saldo actual");
        }
    }

    //Calcular el interés mensual de la cuenta y actualiza el saldo correspondiente.
    public void calcularInteresYactualizarSaldo(){
        //convertir tasa anual a mensual
        float tasaMensual = porcentajeTasaAnual/12;
        float interesMensual = saldo*tasaMensual;
        //actualización del saldo
        saldo += interesMensual;
    }
    //Extracto mensual: actualiza el saldo restándole la comisión mensual
    //y calculando el interés mensual correspondiente (invoca el método
    //anterior).
    public void extractoMensual(){
        saldo -= comisionMensual;
        calcularInteresYactualizarSaldo();
    }

    //muestra los valores de los atributos
    public void imprimir(){
        System.out.println("Saldo: "+ saldo);
        System.out.println("Número de consignaciones : "+ numeroConsignaciones);
        System.out.println("Número de retiros: "+ numeroRetiros);
        System.out.println("Porcentaje tasa anual: "+ porcentajeTasaAnual);
        System.out.println("Comisión mensual: "+ comisionMensual);

    }
}
