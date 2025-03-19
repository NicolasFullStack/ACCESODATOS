package examen.Nicolas.examen.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.lang.reflect.Type;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_alumno;
    @Column
    private String nombre;
    @Column
    private String apellido;
    @Column
    private Date fecha_nacimiento;
    @Column
    private String email;

  @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="id_curso")
    private Curso curso;

    public Alumno(String nombre) {
        this.nombre = nombre;
    }







}
