package com.beckhauser.proposta_app.model;

import jakarta.persistence.*;


@MappedSuperclass
public class EntityId {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id", nullable = false)
        private Long id;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

    }
