/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;

/**
 *
 * @author Franco Ramírez Christian
 * Se define la clase "Saldo insuficiente que tiene clase
 * 'Esception'
 */
public class SaldoInsuficienteException extends Exception{
    /**
     * Se llama al constructor vacio. Este llama al constructor
     * de la clase 'Exception' para mandar un mensaje
     */
    public SaldoInsuficienteException(){
        super("Saldo insuficiente");
    }
    /**
     * 
     * @param message 
     * Se define otro constructor con argumento String 
     * que permite crear una instancia de la excepcion
     * con otro mensaje. 
     */
    public SaldoInsuficienteException(String message) {
        super(message);
    }
   
    
}
