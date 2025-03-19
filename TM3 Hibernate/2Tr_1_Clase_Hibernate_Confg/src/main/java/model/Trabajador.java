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
@Table (name = "empleados")
public class Trabajador implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    //Todos los modelos tienen que ser privados
    @Column(name="name")
    private String nombre;

    @Column
    private String apellido;
    @Column
    private String direccion;
    @Column
    private String telefono;


    //Lo tengo que crear yo con generate, lombok  no lo crea
    public Trabajador(String nombre, String apellido, String direccion, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
    }
}
