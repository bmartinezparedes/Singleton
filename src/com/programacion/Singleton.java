package com.programacion;

public class Singleton {
    //atributos para comprobar que siempre es el mismo objeto
    private String nombre;
    private Integer edad;

    //esta va a ser nuestra unica instancia
    private static Singleton instance=null;

    /**
     * Constructor bloqueado con private
     */

    private Singleton() {}

    public static Singleton getInstance(){
        //comprueba si ya esta creada
        if (instance==null) {
            //como no está creada, la creo
            //desde aqui si que puedo acceder al contructor
            //por que estoy en la misma clase
            instance = new Singleton();
        }
        // devuelvo la instancia
        return instance;
    }
        public void setEdad(Integer edad){
            this.edad=edad;
        }

        public void setNombre(String nombre){
            this.nombre=nombre;
        }


}
