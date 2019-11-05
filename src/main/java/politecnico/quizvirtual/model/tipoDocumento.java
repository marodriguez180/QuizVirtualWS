/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package politecnico.quizvirtual.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.stereotype.Component;

/**
 *
 * @author Mario
 */
@Entity
@Table(name = "tipoDocumento")

public class tipoDocumento implements Serializable {
    
    @Id
    private int idtipodocumento;
    private String description;

    public tipoDocumento(){}
    
    public int getIdtipodocumento() {
        return idtipodocumento;
    }

    public void setIdtipodocumento(int idtipodocumento) {
        this.idtipodocumento = idtipodocumento;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
}
