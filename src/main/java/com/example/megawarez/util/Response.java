package com.example.megawarez.util;

public class Response {
    public Boolean error;
    public String message;
    public String status;
    public Object data;

    /**
     * Constructor de la clase
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public Response(){
        error = false;
        message = "";
        status = "OK";
        data = null;
    }

    /**
     * Restaura a ceros la respuesta de la API
     *
     * @author Dímar Andrey Suárez Hidalgo <dimar260212@gmail.com>
     * @since 1.0.0
     */
    public void restart(){
        error = false;
        message = "";
        status = "";
        data = null;
    }
}
