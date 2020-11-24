package ar.edu.davinci.dvds20202cg7.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="clientes")

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cliente implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    @Column(name = "cli_id")
    private Long id;
    private static final long serialVersionUID = -3031284613282783768L;


    
    @Column(name = "cli_nombre")
    private String nombre;

    @Column(name = "cli_apellido")
    private String apellido;

}