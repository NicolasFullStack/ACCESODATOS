package model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "entrenadores")

public class Entrenador implements Serializable {

            @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
            private int id;
            @Column
            private String nombre;
            @Column
            private String calificacion;
            @Column
            private int titulos;

            // Bidireccionalidad
            @OneToOne(mappedBy ="entrenador")
            private Equipo equipo;

    public Entrenador(String nombre, String calificacion, int titulos) {
        this.nombre = nombre;
        this.calificacion = calificacion;
        this.titulos = titulos;
    }

    public Entrenador(String nombre) {
        this.nombre = nombre;
    }
}
