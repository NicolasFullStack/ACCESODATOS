package model;


import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Entity
@Table(name = "ligas")
public class Liga implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @Column
    private String nombre;
    @Column
    private Date fecha_inicio;
    @Column(name = "fecha_fin")
    private Date fecha_final;

    // Bidireccionalidad
    @OneToMany(mappedBy = "liga")
    private List<Equipo> equipos;


    public Liga(String nombre) {
        this.nombre = nombre;
    }

    public Liga(String nombre, Date fecha_final, Date fecha_inicio) {
        this.nombre = nombre;
        this.fecha_final = fecha_final;
        this.fecha_inicio = fecha_inicio;
    }
}
