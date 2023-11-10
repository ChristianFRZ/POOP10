/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop10;

/**
 *
 * @author Franco Ramírez Christian
 * Definición de clase
 */

public class POOP10 {

    /**
     * Iniciar método 'main' 
     */
    public static void main(String[] args) {
        /**
         * Esta linea imprime "Hola mundo"
         */
        System.out.println("Hola mundo");
        /**
         * Se declara y se inicializa un arreglo de cadena llamada
         * 'mensaje' con tres elementos
         */
        String[] mensajes =  {"Primer", "Segundo","Tercero"};
        /**
         * Se inicializa un bloque 'try' para capturar excepciones
         */
        try{
            /**
             * Comienza bucle for que se ejecuta 4 veces
             */
            for (int i = 0; i<= 3;i++){
            System.out.println("Mensaje: "+mensajes[i]);
            }
        /**
         * Bloqueo catch para capturar la excepción
         */
        }catch(ArrayIndexOutOfBoundsException e){
            /**
             * Imprime 'Error' en caso de capturar error
             */
            System.out.println("Error");
            System.out.println(e.getMessage());
        }
        /**
         * Esta linea imprime "Hola mundo 2"
         */
        System.out.println("Hola mundo 2");
        /**
         * Se inicializa un bloque 'try' para capturar excepciones
         */
        try{
          double x;
        
        x = 0/0;
        System.out.println(x); 
        /**
         * Bloqueo catch para capturar la excepción
         */
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        /**
         * Se inicializa un bloque 'try' para capturar excepciones
         */
        try{
          double x;
        
        x = 0/0;
        System.out.println(x);
        /**
         * Bloqueo catch para capturar la excepción
         */
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        /**
         * Bloqueo catch para capturar la excepción
         */
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        
        /**
         * Se inicializa un bloque 'try' para capturar excepciones
         */
        try{
        double x;
        
        x = 0/0;
        System.out.println(x);  
        /**
         * Bloqueo catch para capturar la excepción
         */
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
            

        }
        System.out.println("Hola mundo La trilogia");
        /**
         * Bloqueo catch para capturar la excepción
         */
        try{
            double division = metodoDivision(3f,4.0);
        /**
         * Bloqueo catch para capturar la excepción
         */
        }catch(UnsupportedOperationException e){
            System.out.println(e.getMessage());
        }
        

    }   

    private static double metodoDivision(float f, double d) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Operacion no sopotada."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

        
    
}
