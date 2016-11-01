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
@Table(name = "Materias")

public class Materias {
  private Integer id;
  private String nombre;
  private Integer idPlanEstudio;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "idMaterias")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  @Column(name = "nombre")
  public String getNombre() {
    return nombre;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
  public Integer getIdPlanEstudio() {
    return idPlanEstudio;
  }
  public void setIdPlanEstudio(Integer idPlanEstudio) {
    this.idPlanEstudio = idPlanEstudio;
  }
}
