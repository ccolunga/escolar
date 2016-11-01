package com.mycompany.escolar.vo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Grupos")

public class Grupos {
  private Integer id;
  private Integer idMateria;
  private Integer idMaestro;
  private String calentadrio;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "idGrupos")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
  public Integer getIdMateria() {
    return idMateria;
  }
  public void setIdMateria(Integer idMateria) {
    this.idMateria = idMateria;
  }

  @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
  public Integer getIdMaestro() {
    return idMaestro;
  }
  public void setIdMaestro(Integer idMaestro) {
    this.idMaestro = idMaestro;
  }
  @Column(name = "calendario")
  public String getCalentadrio() {
    return calentadrio;
  }
  public void setCalentadrio(String calentadrio) {
    this.calentadrio = calentadrio;
  }
  
}
