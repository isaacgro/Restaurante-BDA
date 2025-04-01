/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moduloClienteEntidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author isaac
 */
@Entity 
@DiscriminatorValue("1")
public class ClienteFrecuente extends Cliente implements Serializable {

    @Column(name = "puntos", nullable = false)
    private Integer puntos;
    
    @Column(name = "gasto_acumulado", nullable = false) 
    private double gastoAcumulado;
    
    @Column ( name = "visitas", nullable = false) 
    private double visitas;
    
}
