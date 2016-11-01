package com.mycompany.escolar.vo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import static javax.persistence.FetchType.LAZY;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Cuentas")

public class Cuentas {
  private Integer id;
  private Usuario usuario;
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

  @OneToOne(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
  @JoinColumn(name = "Usuario")
  public Usuario getUsuario() {
    return usuario;
  }
  public void setUsuario(Integer idUsuario) {
    this.usuario = usuario;
  }

  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "Roles")
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
