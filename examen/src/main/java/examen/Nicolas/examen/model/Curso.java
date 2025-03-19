package examen.Nicolas.examen.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_curso;
    @Column
    private String nombre;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_aula")
    private Aula aula;

    @ManyToMany(mappedBy = "cursos")
    private List<Profesor> profesores;


}
