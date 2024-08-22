package com.example.SysAsistencia.modelo;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "upeu_evento")
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 60)
    private String nombreEvento;

    private LocalDate fecha;
    private LocalTime horai;
    private LocalTime minToler;
    private String latitud;
    private String longitud;
    private String estado;
    private String evaluar;
    private String perfilEvento;
    private String userCreate;
    private String mater;
    private String asisSubact;
    private String intsal;
    private String offLinex;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "periodo_id", referencedColumnName = "id",nullable = false,
            foreignKey = @ForeignKey(name = "FK_EVENTO_PERIODO"))
    private Periodo periodoId;
}
