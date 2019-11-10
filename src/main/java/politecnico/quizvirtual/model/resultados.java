/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package politecnico.quizvirtual.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Mario
 */
@Entity
@Table(name = "resultados")
public class resultados implements Serializable {
    
    private static final long serialVersionUID = -8364572852334169042L;
    @Id
    private int idresultado;
    private String puntaje_total;
    private Date fecha_fin;

    public int getIdresultado() {
        return idresultado;
    }

    public void setIdresultado(int idresultado) {
        this.idresultado = idresultado;
    }

    public String getPuntaje_total() {
        return puntaje_total;
    }

    public void setPuntaje_total(String puntaje_total) {
        this.puntaje_total = puntaje_total;
    }

    public Date getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }
    
}
