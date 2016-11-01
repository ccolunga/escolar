package com.mycompany.escolar.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table( name = "Calificaciones")

public class Calificaciones {
  private Integer id;
  private Integer calificacion;
  private Integer parcial;
  private Integer idAlumnoGruposListas;

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

  @OneToOne(fetch = FetchType.LAZY)
  public Integer getIdAlumnoGruposListas() {
    return idAlumnoGruposListas;
  }
  public void setIdAlumnoGruposListas(Integer idAlumnoGruposListas) {
    this.idAlumnoGruposListas = idAlumnoGruposListas;
  }
}
