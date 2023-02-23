package cuentas;

/**
 * Esta clase simula una cuenta bancaria de un cliente
 * 
 * @author Diana Torres
 * @version 1.0
 * @since 1.0
*/
public class CCuenta {
    
    /**
     * Nombre de la cuenta
     */
    private String nombre;
    /**
     * Número de la cuenta
     */
    private String cuenta;
    /**
     * Saldo de la cuenta
     */
    private double saldo;
    /**
     * Tipo de interés de la cuenta
     */
    private double tipoInteres;
    
    /**
     * Constructor sin parámetros
     */
    public CCuenta()
    {
    }
    
    /**
     * Constructor con todos los parámetros
     * @param nom String con el nombre de la cuenta
     * @param cue String con el número de la cuenta
     * @param sal double con el saldo corriente de la cuenta
     * @param tipo double con el tipo de interés de la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre=nom;
        cuenta=cue;
        saldo=sal;
    }
    
    /**
     * Método que devuelve el estado de la cuenta
     * @return double con el saldo
     */
    public double estado()
    {
        return getSaldo();
    }
    
    /**
     * Método que permite ingresar dinero en la cuenta
     * @param cantidad double con la cantidad a ingresar
     * @throws Exception Excepción con cantidades negativas
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    
    /**
     * Método que permite retirar dinero de la cuenta
     * @param cantidad a retirar
     * @throws Exception Excepción con cantidades negativas o si no hay suficiente saldo
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Método getter que devuelve el nombre
     * @return String con el nombre de la cuenta
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método setter que actualiza el nombre
     * @param nombre String con el nuevo nombre de la cuenta
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método getter que devuelve el número de la cuenta
     * @return String con el número de la cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Método setter que actualiza el número de la cuenta
     * @param cuenta String con el nuevo número de la cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Método getter que devuelve el saldo de la cuenta
     * @return double con el saldo de la cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Método setter que actualiza el saldo de la cuenta
     * @param saldo double con el nuevo saldo de la cuenta
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Método getter que devuelve el tipo de interés de la cuenta
     * @return double con el tipo de interés de la cuenta
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * Método setter que actualiza el tipo de interés de la cuenta
     * @param tipoInteres double con el nuevo tipo de interés de la cuenta
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
}
