/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;

/**
 *
 * @author Franco Ramírez Christian
 * Se define la clase 'Cuenta Bancaria
 */
public class CuentaBancaria {
    /**
     * Se declara 'saldo' en privado
     */
    private double saldo;
   
    /**
     * Se realiza el constructor sin argumento 'CuentaBancaria'
     * inicializa el saldo en cero cuando se crea una instancia
     * de la clase
     */
    public CuentaBancaria() {
        saldo = 0;
    }
    /**
     * Se define el constructor  con un argumento double
     * permitiendo crear una instancia de la clase saldo
     * @param saldo 
     */
    public CuentaBancaria(double saldo) {
        this.saldo = saldo;
    }
    /**
     * Se utiliza get y set
     * @return 
     */
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    /**
     * Se define depositar. imprime un mensaje idnicando
     * el deposito del monto
     * @param monto 
     */
    public void depositar(double monto){
        System.out.println("Depositar "+ monto);
    }
    /**
     * @param monto
     * @throws SaldoInsuficienteException 
     * Se define retirar que permite retirar un monto
     * de la cuenta, si el retiro no se realiza correctamente
     * lanzará una excepcion. Si el retiro sale bien
     * se disminuye saldo de la cuenta
     */
    public void retirar(double monto)throws SaldoInsuficienteException{
        System.out.println("Retirando "+ monto);
        if (saldo < monto)
            throw new SaldoInsuficienteException();
        else
            saldo -= monto;   
    }
 
}
