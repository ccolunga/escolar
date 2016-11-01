package com.mycompany.escolar.vo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Kardex")

public class Kardex {
  private Integer id;
  private Integer idAlumno;
  private Integer idAlumnoGrupoListas;
  private Integer calificacion;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "idKardex")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  @OneToOne(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
  public Integer getIdAlumno() {
    return idAlumno;
  }
  public void setIdAlumno(Integer idAlumno) {
    this.idAlumno = idAlumno;
  }

  @OneToOne(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
  public Integer getIdAlumnoGrupoListas() {
    return idAlumnoGrupoListas;
  }
  public void setIdAlumnoGrupoListas(Integer idAlumnoGrupoListas) {
    this.idAlumnoGrupoListas = idAlumnoGrupoListas;
  }

  @Column(name = "calificacion")
  public Integer getCalificacion() {
    return calificacion;
  }
  public void setCalificacion(Integer calificacion) {
    this.calificacion = calificacion;
  }
}
