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
@Table(name = "upeu_subactsis")
public class Subactsis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private LocalDate fecha;
    @Column(nullable = false)
    private LocalTime horasi;
    @Column(nullable = false)
    private LocalTime minToler;
    @Column(nullable = false, length = 8)
    private String estado;
    @Column(nullable = false, length = 2)
    private String offlinex;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "evento_id", referencedColumnName = "id", nullable
            = false, foreignKey = @ForeignKey(name = "FK_SUBACTASIS_EVENTO"))
    private Evento eventoId;
}
