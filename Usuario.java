package com.example.SysAsistencia.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "upeu_usuario")
public class Usuario{

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @Column(nullable = false)
        private String correo;
        @Column(nullable = false)
        private String password;
        @Column(name = "perfil_prin", nullable = false)
        private String perfilPrin;
        @Column(nullable = false)
        private String estado;
        @Column(nullable = false)
        private String offlinex;
        @JoinColumn(name = "persona_id", referencedColumnName = "id")
        @ManyToOne(optional = false)
        private Persona personaId;

    }
