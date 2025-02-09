package Cuentas;

/**
 * Clase que representa una cuenta bancaria.
 */
public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor vacío de CCuenta.
     */
    public CCuenta() {
    }

    /**
     * Constructor con parámetros.
     * @param nom Nombre del titular de la cuenta.
     * @param cue Número de cuenta.
     * @param sal Saldo inicial.
     * @param tipo Tipo de interés.
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        this.nombre = nom;
        this.cuenta = cue;
        this.saldo = sal;
        this.tipoInterés = tipo;
    }

    /**
     * Devuelve el saldo actual de la cuenta.
     * @return Saldo de la cuenta.
     */
    public double estado() {
        return saldo;
    }

    /**
     * Ingresa dinero en la cuenta.
     * @param cantidad Cantidad a ingresar.
     * @throws Exception Si la cantidad es negativa.
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo += cantidad;
    }

    /**
     * Retira dinero de la cuenta.
     * @param cantidad Cantidad a retirar.
     * @throws Exception Si la cantidad es negativa o no hay suficiente saldo.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception("No se puede retirar una cantidad negativa");
        if (estado() < cantidad)
            throw new Exception("No hay suficiente saldo");
        saldo -= cantidad;
    }
}
