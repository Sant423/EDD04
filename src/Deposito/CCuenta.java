/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Deposito;

/**
 *Clase donde se crea una cuenta en la que se puede comprobar el estado de la misma, retirar e ingresar saldo.
 * 
 * @version Apache NetBeans IDE 15
 * @since Apache NetBeans IDE 15
 * @author Santiago Palmieri
 */
public class CCuenta {

    /**
     * Getter del atributo nombre
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * setter del atributo nombre
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * getter del atributo cuenta
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * setter del atributo cuenta
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * getter del atributo saldo
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * setter del atributo saldo
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * getter del atributo TipoInter�s
     * @return the tipoInter�s
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * setter del atributo TipoInter�s
     * @param tipoInter�s the tipoInter�s to set
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    /** 
     * Atributos del propietario de la cuenta
     */
    private String nombre; 
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    /**
     * Constructor de la clase sin par�metros
     */
    public CCuenta()
    {
    }

    /**
     * Constructor de la clase
     * 
     * @param nom es para el atributo nombre que es el nombre del propietario
     * @param cue es para el atributo cuenta que es el n�mero de cuenta
     * @param sal es para el atributo saldo que es el dinero que hay en la cuenta
     * @param tipo ser�a para el atributo TipoInter�s sin embargo no est� vinculado con el atributo
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /** 
     * M�todo que devuelve el saldo que hay en la cuenta
     * @return el dinero dentro de la cuenta
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * M�todo para meter dinero en la cuenta
     * @param cantidad es en cuanto se quiere aumentar el dinero que hay en la cuenta. No puede ser menor a 0
     * @throws Exception es una excepci�n si la cantiadad que se quiere ingresar es negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * M�todo para quitar dinero de la cuenta
     * @param cantidad es en cuanto se quiere reducir la cantidad de dinero que hay en la cuenta. No puede ser ni menor ni igual a 0 ni puede ser 
     * m�s dinero del que hay en la cuenta en el momento de la retirada
     * @throws Exception son excepciones para si la cantidad es menor o igual a 0 y para si la cantidad que se quiere retirar es mayor a la 
     * cantidad que hay en la cuenta
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}

