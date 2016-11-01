package com.mycompany.escolar.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Roles")

public class Roles {
  private Integer id;
  private String nombre;
  private String operacion;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "idRol")
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

  @Column(name = "operacion")
  public String getOperacion() {
    return operacion;
  }
  public void setOperacion(String operacion) {
    this.operacion = operacion;
  }
}
