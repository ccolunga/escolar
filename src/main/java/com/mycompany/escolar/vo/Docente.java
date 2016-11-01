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
@Table(name = "Docente")

public class Docente {
  private Integer id;
  private Integer idUsuario;
  private Integer nomina;
  private String escolaridad;

  @Id  
  @GeneratedValue( strategy = GenerationType.AUTO )
  @Column(name = "idMaestro")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  @OneToOne(fetch = FetchType.LAZY)
  public Integer getIdUsuario() {
    return idUsuario;
  }
  public void setIdUsuario(Integer idUsuario) {
    this.idUsuario = idUsuario;
  }

  @Column(name = "noNomina")
  public Integer getNomina() {
    return nomina;
  }
  public void setNomina(Integer nomina) {
    this.nomina = nomina;
  }

  @Column(name = "escolaridad")
  public String getEscolaridad() {
    return escolaridad;
  }
  public void setEscolaridad(String escolaridad) {
    this.escolaridad = escolaridad;
  }
}
