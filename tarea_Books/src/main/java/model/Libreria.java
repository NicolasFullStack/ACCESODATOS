package model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor

@Getter
@Setter

@Entity
@Table
public class Libreria implements Serializable {


    @Id
    @GeneratedValue
    private int id;
    @Column
    private String nombre;
    @Column
    private String propietario;
    @Column
    private String direccion;

    // Bidireccionalidad entre las columnas libreria y editorial para sacar las colecciones.
    @ManyToMany(mappedBy = "libreria",fetch = FetchType.EAGER)
    private List<Editorial> editorialList;
    public Libreria(String nombre, String propietario, String direccion) {
        this.nombre = nombre;
        this.propietario = propietario;
        this.direccion = direccion;
    }
}
