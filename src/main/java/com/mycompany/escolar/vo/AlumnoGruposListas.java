package com.mycompany.escolar.vo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "GruposListas")

public class AlumnoGruposListas {
  private Integer id;
  private Integer idGrupo;
  private Integer idAlumno;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "idGruposListas")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  @Column(name = "idGrupos")
  public Integer getIdGrupo() {
    return idGrupo;
  }
  public void setIdGrupo(Integer idGrupo) {
    this.idGrupo = idGrupo;
  }

  @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
  public Integer getIdAlumno() {
    return idAlumno;
  }
  public void setIdAlumno(Integer idAlumno) {
    this.idAlumno = idAlumno;
  }
}
