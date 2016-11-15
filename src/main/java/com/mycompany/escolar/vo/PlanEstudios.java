package com.mycompany.escolar.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PlanEstudios")

public class PlanEstudios {
  private Integer id;
  private Integer idCarrera;
  private String nombre;
  private String fecha;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "idPlanEstudios")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  @Column(name = "idCarrera")
  public Integer getIdCarrera() {
    return idCarrera;
  }
  public void setIdCarrera(Integer idCarrera) {
    this.idCarrera = idCarrera;
  }

  @Column(name = "nombre")
  public String getNombre() {
    return nombre;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  @Column(name = "fecha")
  public String getFecha() {
    return fecha;
  }
  public void setFecha(String fecha) {
    this.fecha = fecha;
  }
}
