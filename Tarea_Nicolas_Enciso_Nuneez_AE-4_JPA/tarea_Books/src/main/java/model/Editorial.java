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

public class Editorial implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String nombre;
    @Column
    private String direccion;

    // Bidireccionalidad con Libro: 1( One) editorial tiene muchos (Many ) Libros
    @OneToMany(mappedBy = "editorial", fetch = FetchType.EAGER)//tipo de carga para que la obtenga de forma rapida y pueda extraer  los datos
    private List<Libro> libros;

    //ManytoMany con tabla conexlibro, donde asocio editorial y libreria para las colecciones de libros.
    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinTable(name = "conexlibro", joinColumns = @JoinColumn(name = "id_editorial"),
                                inverseJoinColumns = @JoinColumn(name="id_libreria"))
    private  List<Libreria> librerias;

    public Editorial(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }
}
