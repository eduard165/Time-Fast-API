/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.pojo.respuestas;

import java.util.List;
import modelo.pojo.Envio;

/**
 *
 * @author eduar
 */
public class RespuestaEnvios {
     private boolean error;
    private String contenido;
    private List<Envio> envios;

    public RespuestaEnvios() {
    }

    public RespuestaEnvios(boolean error, String contenido, List<Envio> envios) {
        this.error = error;
        this.contenido = contenido;
        this.envios = envios;
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public List<Envio> getEnvios() {
        return envios;
    }

    public void setEnvios(List<Envio> envios) {
        this.envios = envios;
    }
    
    
}
