package model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor

@Getter
@Setter

@Entity
@Table
public class Autor implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private  int id;
    @Column
    private String nombre;
    @Column
    private String apellido;
    @Column
    private Date fecha_Nacimiento;

    // Bidireccionalidad con libro: 1(one) Autor escribe (Many) muchos libros

    @OneToMany(mappedBy = "autor", fetch = FetchType.EAGER) //tipo de carga para que la obtenga de forma rapida y pueda extraer  los datos
    private List<Libro> libros;



    public Autor(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Autor(String nombre, String apellido, Date fecha_Nacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_Nacimiento = fecha_Nacimiento;
    }
}
