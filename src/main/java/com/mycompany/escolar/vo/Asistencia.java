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
@Table(name = "Asistencias")

public class Asistencia {
  private int id;
  private int idAlumnoGruposListas;
  private String fecha;

  @Id
  @GeneratedValue( strategy = GenerationType.AUTO )
  @Column(name = "idAsistencias")
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  
  @OneToOne(fetch = FetchType.LAZY)
  public int getIdAlumnoGruposListas() {
    return idAlumnoGruposListas;
  }
  public void setIdAlumnoGruposListas(int idAlumnoGruposListas) {
    this.idAlumnoGruposListas = idAlumnoGruposListas;
  }
  @Column(name="fecha")
  public String getFecha() {
    return fecha;
  }
  public void setFecha(String fecha) {
    this.fecha = fecha;
  }
  
}
