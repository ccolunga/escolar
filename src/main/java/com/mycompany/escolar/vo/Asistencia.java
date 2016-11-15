package com.mycompany.escolar.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Asistencias")

public class Asistencia {
  private int id;
  private int idGruposListas;

  @Id
  @GeneratedValue( strategy = GenerationType.AUTO )
  @Column(name = "idAsistencias")
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  @Column(name = "idGruposListas")
  public int getIdGruposListas() {
    return idGruposListas;
  }
  public void setIdGruposListas(int idGruposListas) {
    this.idGruposListas = idGruposListas;
  }
}
