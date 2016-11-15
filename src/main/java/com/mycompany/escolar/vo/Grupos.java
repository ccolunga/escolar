package com.mycompany.escolar.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Grupos")

public class Grupos {
  private Integer id;
  private Integer idMateria;
  private Integer idMaestro;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "idGrupos")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  @Column(name = "idMateria")
  public Integer getIdMateria() {
    return idMateria;
  }
  public void setIdMateria(Integer idMateria) {
    this.idMateria = idMateria;
  }

  @Column(name = "idMaestro")
  public Integer getIdMaestro() {
    return idMaestro;
  }
  public void setIdMaestro(Integer idMaestro) {
    this.idMaestro = idMaestro;
  }
}
