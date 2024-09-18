package com.ligabtp.ligabetplay.domain;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "estadisticas")
public class Estadistica {


    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @Column(length = 100, name = "goles_estadistica")
    private String golesEstadistica;

    @Column(length = 100, name = "amarillas_estadistica")
    private String amarillasEstadistica;

    @Column(length = 100, name = "rojas_estadistica")
    private String rojasEstadistica;


    @ManyToOne
    @JoinColumn (name = "mvp_estadistica", referencedColumnName = "id_jugador", nullable = false)
    private Jugador jugador;
}


