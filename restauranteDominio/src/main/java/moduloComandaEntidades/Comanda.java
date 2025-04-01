/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moduloComandaEntidades;

import Enums.Estado;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author isaac
 */
@Entity
public class Comanda implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column( name = "fecha_hora", nullable = false)
    private Date fechaHora;
    
    @Column( name = "folio", nullable = false)
    private String folio;
    
    @Column( name = "estado", nullable = false)
    private Estado estado;
    
    @Column( name = "total_acumulado", nullable = false)
    private double totalAcumulado;
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

   
    
}
