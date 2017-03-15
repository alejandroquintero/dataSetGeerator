/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccp.enterprise.department.entrega;

 
 
import java.io.Serializable;

/**
 *
 * @author alejandroquintero
 */
public class Entrega implements Serializable {
    private Integer pedido_id;
    private String ciudad;
    private String direccion;
    private String tipo_de_embalaje;
    private String sitio_de_embarque;
    private String posicion_carga; 
    private String tratamiento_de_carga;
    private String caracteristicas_transporte;
    private String conductor;
    private String estado_entrega;
    private String observaciones_cliente;

    
    
    public Entrega(int id){
        this.pedido_id=id;
    }
    /**
     * @return the pedido_id
     */
    public Integer getPedido_id() {
        return pedido_id;
    }

    /**
     * @param pedido_id the pedido_id to set
     */
    public void setPedido_id(Integer pedido_id) {
        this.pedido_id = pedido_id;
    }

    /**
     * @return the ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * @param ciudad the ciudad to set
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the tipo_de_embalaje
     */
    public String getTipo_de_embalaje() {
        return tipo_de_embalaje;
    }

    /**
     * @param tipo_de_embalaje the tipo_de_embalaje to set
     */
    public void setTipo_de_embalaje(String tipo_de_embalaje) {
        this.tipo_de_embalaje = tipo_de_embalaje;
    }

    /**
     * @return the sitio_de_embarque
     */
    public String getSitio_de_embarque() {
        return sitio_de_embarque;
    }

    /**
     * @param sitio_de_embarque the sitio_de_embarque to set
     */
    public void setSitio_de_embarque(String sitio_de_embarque) {
        this.sitio_de_embarque = sitio_de_embarque;
    }

    /**
     * @return the posicion_carga
     */
    public String getPosicion_carga() {
        return posicion_carga;
    }

    /**
     * @param posicion_carga the posicion_carga to set
     */
    public void setPosicion_carga(String posicion_carga) {
        this.posicion_carga = posicion_carga;
    }

    /**
     * @return the tratamiento_de_carga
     */
    public String getTratamiento_de_carga() {
        return tratamiento_de_carga;
    }

    /**
     * @param tratamiento_de_carga the tratamiento_de_carga to set
     */
    public void setTratamiento_de_carga(String tratamiento_de_carga) {
        this.tratamiento_de_carga = tratamiento_de_carga;
    }

    /**
     * @return the caracteristicas_transporte
     */
    public String getCaracteristicas_transporte() {
        return caracteristicas_transporte;
    }

    /**
     * @param caracteristicas_transporte the caracteristicas_transporte to set
     */
    public void setCaracteristicas_transporte(String caracteristicas_transporte) {
        this.caracteristicas_transporte = caracteristicas_transporte;
    }

    /**
     * @return the conductor
     */
    public String getConductor() {
        return conductor;
    }

    /**
     * @param conductor the conductor to set
     */
    public void setConductor(String conductor) {
        this.conductor = conductor;
    }

    /**
     * @return the estado_entrega
     */
    public String getEstado_entrega() {
        return estado_entrega;
    }

    /**
     * @param estado_entrega the estado_entrega to set
     */
    public void setEstado_entrega(String estado_entrega) {
        this.estado_entrega = estado_entrega;
    }

    /**
     * @return the observaciones_cliente
     */
    public String getObservaciones_cliente() {
        return observaciones_cliente;
    }

    /**
     * @param observaciones_cliente the observaciones_cliente to set
     */
    public void setObservaciones_cliente(String observaciones_cliente) {
        this.observaciones_cliente = observaciones_cliente;
    }

    @Override
    public String toString(){
    return getPedido_id()+","+getCiudad()+","+getDireccion()+","+getEstado_entrega()+","+getConductor()+","+getCaracteristicas_transporte()+","+getPosicion_carga()+","+getSitio_de_embarque()+","+getTipo_de_embalaje()+","+getTratamiento_de_carga()+","+getObservaciones_cliente();
    }
    
}
 
 