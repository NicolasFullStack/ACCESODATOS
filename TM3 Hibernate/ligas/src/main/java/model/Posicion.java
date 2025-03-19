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
@Table(name = "posiciones")
public class Posicion implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String posicion;

    @OneToMany(mappedBy = "posicion") //No es la entidad dominante entonces no pongo cascade sino que lo mapeo con el objeto ()
    private List<jugador> jugadores;// Ya no obtengo un objeto sino una lista (porque son muchos jugadores)
}
