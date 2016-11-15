package com.mycompany.escolar.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Cuentas")

public class Cuentas {
  private Integer id;
  private Integer idUsuario;
  private Integer idRol;
  private String nick;
  private String password;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "idCuentas")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  @Column(name = "idUsuario")
  public Integer getIdUsuario() {
    return idUsuario;
  }
  public void setIdUsuario(Integer idUsuario) {
    this.idUsuario = idUsuario;
  }

  @Column(name = "idRol")
  public Integer getIdRol() {
    return idRol;
  }
  public void setIdRol(Integer idRol) {
    this.idRol = idRol;
  }

  @Column(name = "nick")
  public String getNick() {
    return nick;
  }
  public void setNick(String nick) {
    this.nick = nick;
  }

  @Column(name = "password")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }
}
