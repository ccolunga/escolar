package com.mycompany.escolar.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Kardex")

public class Kardex {
  private Integer id;
  private Integer idAlumno;
  private Integer idGrupoListas;
  private Integer calificacion;
  private Integer idMateria;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "idKardex")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  @Column(name = "idAlumno")
  public Integer getIdAlumno() {
    return idAlumno;
  }
  public void setIdAlumno(Integer idAlumno) {
    this.idAlumno = idAlumno;
  }

  @Column(name = "idGrupoLista")
  public Integer getIdGrupoListas() {
    return idGrupoListas;
  }
  public void setIdGrupoListas(Integer idGrupoListas) {
    this.idGrupoListas = idGrupoListas;
  }

  @Column(name = "calificacion")
  public Integer getCalificacion() {
    return calificacion;
  }
  public void setCalificacion(Integer calificacion) {
    this.calificacion = calificacion;
  }
  
  @Column(name = "idMateria")
  public Integer getIdMateria() {
    return idMateria;
  }
  public void setIdMateria(Integer idMateria) {
    this.idMateria = idMateria;
  }
}
