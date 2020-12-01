package com.programacion;

public class Singleton {
    //atributos para comprobar que siempre es el mismo objeto
    private String nombre;
    private Integer edad;

    /**
     * Constructor bloqueado con private
     */

    private Singleton() {}

        public void setEdad(Integer edad){
            this.edad=edad;
        }

        public void setNombre(String nombre){
            this.nombre=nombre;
        }


}
