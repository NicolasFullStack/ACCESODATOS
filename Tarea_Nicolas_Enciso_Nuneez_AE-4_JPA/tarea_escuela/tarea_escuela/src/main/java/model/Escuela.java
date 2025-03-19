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
public class Escuela implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String nombre;
    @Column
    private String ciudad;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="id_director")
    private Director director;

    //Bidireccionalidad  una escuela tiene muchos profesores
    @OneToMany(mappedBy = "escuela", cascade = CascadeType.ALL)
    private List<Profesor> profesores;

    public Escuela(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
    }
}
