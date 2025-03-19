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
public class Profesor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_profesor;
    @Column
    private String nombre;
    @Column
    private String apellido;
    @Column
    private String email;

    @ManyToMany(cascade=CascadeType.ALL)
    @JoinTable(name= "Profesor_Curso", joinColumns = @JoinColumn(name="id_profesor")
            ,inverseJoinColumns =@JoinColumn(name="id_curso"))
    private List<Curso> cursos;



    public Profesor(Long id_profesor) {
        this.id_profesor = id_profesor;
    }


}
