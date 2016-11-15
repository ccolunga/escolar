package com.mycompany.escolar.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Alumnos")

public class Alumno {
  
  private Integer id;
  private String matricula;
  private Integer idPlanEstudios;
  private Integer idUsuario;
  private Integer grado;

  @Id
  @GeneratedValue( strategy = GenerationType.AUTO )
  @Column(name = "idAlumnos") //El nombre tiene que ser igual a como aparece en la base de datos
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  @Column( name = "matricula")
  public String getMatricula() {
    return matricula;
  }
  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  @Column( name = "idPlanEstudio")
  public Integer getIdPlanEstudios() {
    return idPlanEstudios;
  }
  public void setIdPlanEstudios(Integer idPlanEstudios) {
    this.idPlanEstudios = idPlanEstudios;
  }

  @Column(name = "idUsuario")
  public Integer getIdUsuario() {
    return idUsuario;
  }
  public void setIdUsuario(Integer idUsuario) {
    this.idUsuario = idUsuario;
  }

  @Column(name = "grado")
  public Integer getGrado() {
    return grado;
  }
  public void setGrado(Integer grado) {
    this.grado = grado;
  }
  
}
