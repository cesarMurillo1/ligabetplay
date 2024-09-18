package com.ligabtp.ligabetplay.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "eventos")
public class Evento {

    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;


    @Column(length = 100)
    private LocalTime tiempo;

    @ManyToOne
    @JoinColumn (name = "id_jugador1", referencedColumnName = "id_jugador", nullable = false)
    private Jugador jugador;

    @ManyToOne
    @JoinColumn (name = "id_jugador2", referencedColumnName = "id_jugador", nullable = false)
    private Jugador jugador2;

    @ManyToOne
    @JoinColumn (name = "id_tipo_evento", referencedColumnName = "id", nullable = false)
    private TipoEvento tipoEvento;

    @ManyToOne
    @JoinColumn (name = "id_partido", referencedColumnName = "id_partido", nullable = false)
    private Partido partido;
}
