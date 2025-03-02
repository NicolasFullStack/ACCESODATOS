package model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor

@Getter
@Setter

@Entity
@Table
public class Libro implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String titulo;
    @Column
    private int precio;

    // Relacion con Autor: Muchos libros( Many )son escritos por 1 (One )Autor
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_autor")
    private int autor;

    // Relacion con editorial: Muchos libros( Many )tienen  1 (One )editorial
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_editorial")
    private int editorial;



    public Libro(String titulo, int precio) {
        this.titulo = titulo;
        this.precio = precio;
    }

    public Libro(String titulo, int precio, int autor, int editorial) {
        this.titulo = titulo;
        this.precio = precio;
        this.autor = autor;
        •this.editorial = editorial;
    }
}
