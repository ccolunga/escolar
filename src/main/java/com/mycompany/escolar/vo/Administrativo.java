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
@Table( name = "Administrativo")

public class Administrativo {
   private Integer id;
   private Integer nomina;
   private String departamento;
   private Integer idUsuario;

  @Id
  @GeneratedValue( strategy = GenerationType.AUTO )
  @Column(name = "idAdministrativo")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  @Column(name = "noNomina")
  public Integer getNomina() {
    return nomina;
  }
  public void setNomina(Integer nomina) {
    this.nomina = nomina;
  }

  @Column(name = "departamento")
  public String getDepartamento() {
    return departamento;
  }
  public void setDepartamento(String departamento) {
    this.departamento = departamento;
  }

  @OneToOne(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
  public Integer getIdUsuario() {
    return idUsuario;
  }
  public void setIdUsuario(Integer idUsuario) {
    this.idUsuario = idUsuario;
  }
}
