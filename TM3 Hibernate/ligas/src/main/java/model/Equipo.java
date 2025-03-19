package model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "equipos")
public class Equipo implements Serializable{


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String nombre;
    @Column
    private String ciudad;

    //Atributo onetoone

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name ="id_enttrenador" )
    private Entrenador entrenador;

    // Bidireccionalidad
    @OneToMany(mappedBy ="equipo", fetch = FetchType.EAGER)//pponemos eager porque es una lista y necesita que se carge reapido
    private List<jugador> jugadores;

    // Unidireccional
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_liga")
    private Liga liga; // liga es el atributo que se usa para la bidireccionalidad con equipo

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name= "inscripciones", joinColumns = @JoinColumn(name= "id_equioo"),
            inverseJoinColumns = @JoinColumn(name="id_competicion"))
    private List<Competicion> competiciones;

    public Equipo(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    public Equipo(String ciudad) {
        this.ciudad = ciudad;
    }
}
