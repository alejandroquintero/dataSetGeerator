/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccp.enterprise.department.producto;

import ccp.enterprise.department.cliente.Cliente;
import java.io.Serializable;

 


/**
 *
 * @author alejandroquintero
 */
public class Producto implements Serializable{
    private Integer id;
    private String referencia;
    private Integer cantidad;
    private String descripcion;
  

    /**
     * @param id
     * @param referencia
     * @param precio
     * @param descripcion
     * @return the id
     */
    public Producto(int id,String referencia,int cantidad, String descripcion){
    this.id=id;
    this.descripcion=descripcion;
    this.referencia=referencia;
    this.cantidad=cantidad;
    }
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the referencia
     */
    public String getReferencia() {
        return referencia;
    }

    /**
     * @param referencia the referencia to set
     */
    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    /**
     * @return the colores
     */
  
    /**
     * @return the precio
     */
    public Integer getCantidad() {
        return cantidad;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(Integer cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String toString(){
    return getId()+","+getReferencia()+","+getCantidad()+","+getDescripcion();
    }

    /**
     * @return the cliente
     */
  
}
