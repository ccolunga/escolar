package com.mycompany.escolar.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "Calificaciones")

public class Calificaciones {
  private Integer id;
  private Integer calificacion;
  private Integer parcial;
  private Integer idGruposListas;

  @Id
  @GeneratedValue( strategy = GenerationType.AUTO )
  @Column(name = "idCalificaciones")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  @Column(name = "calificacion")
  public Integer getCalificacion() {
    return calificacion;
  }
  public void setCalificacion(Integer calificacion) {
    this.calificacion = calificacion;
  }

  @Column(name = "parcial")
  public Integer getParcial() {
    return parcial;
  }
  public void setParcial(Integer parcial) {
    this.parcial = parcial;
  }

  @Column(name = "idGruposListas")
  public Integer getIdGruposListas() {
    return idGruposListas;
  }
  public void setIdGruposListas(Integer idGruposListas) {
    this.idGruposListas = idGruposListas;
  }
}
