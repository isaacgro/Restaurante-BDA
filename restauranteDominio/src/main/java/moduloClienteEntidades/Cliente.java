/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moduloClienteEntidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 *
 * @author isaac
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name="cliente_tipo", discriminatorType =
        DiscriminatorType.INTEGER)
public abstract class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;
    
    @Column(name = "apellido_paterno", nullable = false, length = 100)
    private String apellidoPaterno;
    
    @Column(name = "apellido_materno", nullable = false, length = 100)
    private String apellidoMaterno;
    
    @Column(name = "telefono", nullable = false, length = 10)
    private String telefono;
    
    @Column(name = "correo", nullable = true, length = 100)
    private String correo;
    
    @Column(name = "fecha_registro", nullable = false, length = 100)
    private Date fechaRegistro;
    
    @Column(name = "cliente_tipo")
    private int clienteTipo;
    
}