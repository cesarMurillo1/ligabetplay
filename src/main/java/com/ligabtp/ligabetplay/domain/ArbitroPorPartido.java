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
@Table(name = "arbitros_por_partido")
public class ArbitroPorPartido {

    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;

    @ManyToOne
    @JoinColumn (name = "id_arbitro", referencedColumnName = "id_arbitro", nullable = false)
    private Arbitro arbitro;

    @ManyToOne
    @JoinColumn (name = "id_partido", referencedColumnName = "id_partido", nullable = false)
    private Partido partido;

    @ManyToOne
    @JoinColumn (name = "id_tipos_arbitros", referencedColumnName = "id_tipoarbitro", nullable = false)
    private TipoArbitro tipoArbitro;


}
