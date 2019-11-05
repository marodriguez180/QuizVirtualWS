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
import org.springframework.stereotype.Component;

/**
 *
 * @author Mario
 */
@Entity
@Table(name = "quizes")
public class quiz implements Serializable {
    
    @Id
    private int id_quiz;
    private int cant_preguntas;
    private Date fecha_ini;

    public int getId_quiz() {
        return id_quiz;
    }

    public void setId_quiz(int id_quiz) {
        this.id_quiz = id_quiz;
    }

    public int getCant_preguntas() {
        return cant_preguntas;
    }

    public void setCant_preguntas(int cant_preguntas) {
        this.cant_preguntas = cant_preguntas;
    }

    public Date getFecha_ini() {
        return fecha_ini;
    }

    public void setFecha_ini(Date fecha_ini) {
        this.fecha_ini = fecha_ini;
    }
    
}
