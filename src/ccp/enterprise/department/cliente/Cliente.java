/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccp.enterprise.department.cliente;

import ccp.enterprise.department.generator.IgeneratorLogic;
import ccp.enterprise.department.producto.Producto;
import java.io.Serializable;
import java.util.List;

 

/**
 *
 * @author alejandroquintero
 */
public class Cliente implements Serializable  {
    private String nombre;
    private String tipo;
    private String forma_pago;
    private Integer tiempoActivo;
    private String zona;
    private List<Producto> productos;

    /**
     * @return the nombre
     */
    public Cliente(String name){
        this.nombre=name;
    }
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the forma_pago
     */
    public String getForma_pago() {
        return forma_pago;
    }

    /**
     * @param forma_pago the forma_pago to set
     */
    public void setForma_pago(String forma_pago) {
        this.forma_pago = forma_pago;
    }

    /**
     * @return the tiempoActivo
     */
    public Integer getTiempoActivo() {
        return tiempoActivo;
    }

    /**
     * @param tiempoActivo the tiempoActivo to set
     */
    public void setTiempoActivo(Integer tiempoActivo) {
        this.tiempoActivo = tiempoActivo;
    }

    
    public String toString(){
    return getNombre()+","+getForma_pago()+","+getTiempoActivo()+","+getTipo();
    }

    /**
     * @return the zona
     */
    public String getZona() {
        return zona;
    }

    /**
     * @param zona the zona to set
     */
    public void setZona(String zona) {
        this.zona = zona;
    }

    /**
     * @return the productos
     */
    public List<Producto> getProductos() {
        return productos;
    }

    /**
     * @param productos the productos to set
     */
    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
    
    
}
