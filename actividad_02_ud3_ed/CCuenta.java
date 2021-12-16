/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_02_ud3_ed;

/**
 * 
 * @author Ana
 */
public class CCuenta {


     
  protected String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

  
    public CCuenta ()
    {
    }
   /**
    * 
    * @param nom Nombre del titular de la cuenta
    * @param cue Cuenta del titular
    * @param sal Saldo de la cuenta
    * @param tipo Tipo de cuenta
    */
    public CCuenta (String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInterés=tipo;
    }
  /**
   * 
   * @param nom Nombre del titular de la tarjeta
   */
    public void asignarNombre(String nom)
    {
        nombre=nom;
    }
   /**
    * 
    * @return Nombre del titular de la cuenta
    */
    public String obtenerNombre()
    {
        return nombre;
    }
    /**
     * 
     * @return Saldo del saldo que tiene la cuenta
     */
    
     public double estado ()
    {
        return saldo;
    }
     /**
      * 
      * @param cantidad Cantidad de saldo que se ingresa
      * @throws Exception Nose puede meter dinero en forma negativa
      */
    
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0){
            throw new Exception("No se puede ingresar una cantidad negativa");}
        setSaldo(saldo + cantidad);
    }
    /**
     * 
     * @param cantidad de saldo a ingresar
     * @throws Exception no se puede retirar saldo negativo
     */
   
    public void retirar (double cantidad) throws Exception
    {
        if (cantidad < 0){
            throw new Exception ("No se puede retirar una cantidad negativa");}
        if (estado()< cantidad){
            throw new Exception ("No se hay suficiente saldo");}
        setSaldo(saldo - cantidad);
    }
    /**
     * 
     * @return Devuelve el numero de la cuenta
     */
    public String obtenerCuenta ()
    {
        return cuenta;
    }
    /**
     * 
     * @param cuenta Obtiene el numero de cuenta
     */
  
  public void setCuenta(String cuenta) {
    this.cuenta = cuenta;
  }
 /**
  * 
  * @param saldo Obtiene el saldo de la cuenta
  */
  
  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }
/**
 * 
 * @return Obtiene el doble del saldo de la cuenta
 */
 
  public double getTipoInterés() {
    return tipoInterés;
  }
/**
 * 
 * @param tipoInterés de la cuenta
 */
  
  public void setTipoInterés(double tipoInterés) {
    this.tipoInterés = tipoInterés;
  }
}