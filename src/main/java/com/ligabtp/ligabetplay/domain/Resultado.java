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
@Table(name = "resultados")
public class Resultado {

    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;


    @Column(length = 100, name = "goles_resultado")
    private String golesResultado;

    @Column(length = 100, name =  "tarjetasrojas_resultado")
    private String tarjetasRojasResultado ;

    @Column(length = 100, name = "tarjetasamarillas_resultado")
    private String tarjetasAmarillasResultado;

    @Column(length = 100, name = "posesionbalon_resultado")
    private Double posesionBalonResultado;

    @Column(length = 100, name = "tiroesquina_resultado")
    private String tiroEsquinaResultado;

    @Column(length = 100, name = "rematearco_resultado")
    private String remateArcoResultado;

    @Column(length = 100, name = "precisionremates_resultado")
    private Double precisionRematesResultado;

    @ManyToOne
    @JoinColumn (name = "ganador_resultado", referencedColumnName = "id_equipo", nullable = false)
    private Equipo equipo;

    @ManyToOne
    @JoinColumn (name = "perdedor_resultado", referencedColumnName = "id_equipo", nullable = false)
    private Equipo equipo2;

}
