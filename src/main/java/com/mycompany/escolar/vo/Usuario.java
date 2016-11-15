package com.mycompany.escolar.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "Usuarios")

public class Usuario {
  private Integer id;
  private String nombre;
  private String paterno;
  private String materno;
  private String genero;
  private Integer idrol;

  @Id
  @GeneratedValue( strategy = GenerationType.AUTO )
  @Column(name = "idUsuario") //El nombre tiene que ser igual a como aparece en la base de datos
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

  @Column(name = "paterno")
  public String getPaterno() {
    return paterno;
  }
  public void setPaterno(String paterno) {
    this.paterno = paterno;
  }

  @Column(name = "materno")
  public String getMaterno() {
    return materno;
  }
  public void setMaterno(String materno) {
    this.materno = materno;
  }

  @Column(name = "genero")
  public String getGenero() {
    return genero;
  }
  public void setGenero(String genero) {
    this.genero = genero;
  }
  
  @Column(name = "idRol")
  public Integer getIdrol() {
    return idrol;
  }
  public void setIdrol(Integer idrol) {
    this.idrol = idrol;
  }
}
