package model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor

@Setter
@Getter

@Entity
@Table

public class Profesor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String nombre;
    @Column
    private String horario;//mañana o tarde

   //Muchos profesores estan en una escuela
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "escuela_id")
    private Escuela escuela;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable (name= "clase", joinColumns = @JoinColumn(name="id_profesor"),inverseJoinColumns = @JoinColumn(name="id_alumno"))
    private Alumno alumno;

    public Profesor(String nombre, String horario) {
        this.nombre = nombre;
        this.horario = horario;
    }
}
