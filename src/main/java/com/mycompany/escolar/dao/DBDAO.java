package com.mycompany.escolar.dao;

import com.mycompany.escolar.util.HibernateUtil;
import com.mycompany.escolar.vo.Administrativo;
import com.mycompany.escolar.vo.Alumno;
import com.mycompany.escolar.vo.Asistencia;
import com.mycompany.escolar.vo.Calificaciones;
import com.mycompany.escolar.vo.Carreras;
import com.mycompany.escolar.vo.Cuentas;
import com.mycompany.escolar.vo.Docente;
import com.mycompany.escolar.vo.Grupos;
import com.mycompany.escolar.vo.AlumnoGruposListas;
import com.mycompany.escolar.vo.Kardex;
import com.mycompany.escolar.vo.Materias;
import com.mycompany.escolar.vo.PlanEstudios;
import com.mycompany.escolar.vo.Roles;
import com.mycompany.escolar.vo.Usuario;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class DBDAO {
  
  //Usuarios
  static public long addUsuario(Usuario usr){
    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session sc = sf.getCurrentSession();
    sc.getTransaction().begin();
    sc.save(usr);
    sc.getTransaction().commit();
    return usr.getId();
  }
  
   static public long updateUsuario(Usuario usr){
    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session sc = sf.getCurrentSession();
    sc.getTransaction().begin();
    sc.update(usr);
    sc.getTransaction().commit();
    return usr.getId();
  }
   
   static public long deleteUsuario(Usuario usr) {
    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session sc = sf.getCurrentSession();
    sc.getTransaction().begin();
    sc.delete(usr);
    sc.getTransaction().commit();
    return usr.getId();
  }
   
   static public Usuario getUsuario( int id) {
    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session sc = sf.getCurrentSession();
    sc.getTransaction().begin();
    Query sq = sc.createSQLQuery("SELECT * FROM Usuario WHERE idUsuario = "+ id).addEntity(Usuario.class);
    Usuario usr = (Usuario) sq.uniqueResult();
    sc.getTransaction().commit();
    return usr;
  }
   
   static public List <Usuario> getUsuarios( String sql ) {
    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session sc = sf.getCurrentSession();
    sc.getTransaction().begin();
    Query sq = sc.createSQLQuery(sql).addEntity(Usuario.class);
    List<Usuario> usr = sq.list();
    sc.getTransaction().commit();
    return usr;
  }
   
   //Maestros
   static public long addDocente(Docente doc){
    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session sc = sf.getCurrentSession();
    sc.getTransaction().begin();
    sc.save(doc);
    sc.getTransaction().commit();
    return doc.getId();
  }
  
   static public long updateDocente(Docente doc){
    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session sc = sf.getCurrentSession();
    sc.getTransaction().begin();
    sc.update(doc);
    sc.getTransaction().commit();
    return doc.getId();
  }
   
   static public long deleteDocente(Docente doc) {
    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session sc = sf.getCurrentSession();
    sc.getTransaction().begin();
    sc.delete(doc);
    sc.getTransaction().commit();
    return doc.getId();
  }
   
   static public Docente getDocente( int id) {
    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session sc = sf.getCurrentSession();
    sc.getTransaction().begin();
    Query sq = sc.createSQLQuery("SELECT * FROM Docente WHERE idDocente = "+ id).addEntity(Docente.class);
    Docente doc = (Docente) sq.uniqueResult();
    sc.getTransaction().commit();
    return doc;
  }
   
   static public List <Docente> getDocentes( String sql ) {
    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session sc = sf.getCurrentSession();
    sc.getTransaction().begin();
    Query sq = sc.createSQLQuery(sql).addEntity(Docente.class);
    List<Docente> doc = sq.list();
    sc.getTransaction().commit();
    return doc;
  }
   
   //Alumno
   static public long addAlumno(Alumno alm){
    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session sc = sf.getCurrentSession();
    sc.getTransaction().begin();
    sc.save(alm);
    sc.getTransaction().commit();
    return alm.getId();
  }
  
   static public long updateAlumno(Alumno alm){
    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session sc = sf.getCurrentSession();
    sc.getTransaction().begin();
    sc.update(alm);
    sc.getTransaction().commit();
    return alm.getId();
  }
   
   static public long deleteAlumno(Alumno alm) {
    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session sc = sf.getCurrentSession();
    sc.getTransaction().begin();
    sc.delete(alm);
    sc.getTransaction().commit();
    return alm.getId();
  }
   
   static public Alumno getAlumno( int id) {
    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session sc = sf.getCurrentSession();
    sc.getTransaction().begin();
    Query sq = sc.createSQLQuery("SELECT * FROM Alumno WHERE idAlumno = "+ id).addEntity(Alumno.class);
    Alumno alm = (Alumno) sq.uniqueResult();
    sc.getTransaction().commit();
    return alm;
  }
   
   static public List <Alumno> getAlumno( String sql ) {
    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session sc = sf.getCurrentSession();
    sc.getTransaction().begin();
    Query sq = sc.createSQLQuery(sql).addEntity(Alumno.class);
    List<Alumno> alm = sq.list();
    sc.getTransaction().commit();
    return alm;
  }
   
   //Administrativo
   static public long addAdministrativo(Administrativo adm){
    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session sc = sf.getCurrentSession();
    sc.getTransaction().begin();
    sc.save(adm);
    sc.getTransaction().commit();
    return adm.getId();
  }
  
   static public long updateAdministrativo(Administrativo adm){
    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session sc = sf.getCurrentSession();
    sc.getTransaction().begin();
    sc.update(adm);
    sc.getTransaction().commit();
    return adm.getId();
  }
   
   static public long deleteAdministrativo(Administrativo adm) {
    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session sc = sf.getCurrentSession();
    sc.getTransaction().begin();
    sc.delete(adm);
    sc.getTransaction().commit();
    return adm.getId();
  }
   
   static public Administrativo getAdministrativo( int id) {
    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session sc = sf.getCurrentSession();
    sc.getTransaction().begin();
    Query sq = sc.createSQLQuery("SELECT * FROM Administrativo WHERE idAdministrativo = "+ id).addEntity(Administrativo.class);
    Administrativo adm = (Administrativo) sq.uniqueResult();
    sc.getTransaction().commit();
    return adm;
  }
   
   static public List <Administrativo> getAdministrativos( String sql ) {
    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session sc = sf.getCurrentSession();
    sc.getTransaction().begin();
    Query sq = sc.createSQLQuery(sql).addEntity(Administrativo.class);
    List<Administrativo> adm = sq.list();
    sc.getTransaction().commit();
    return adm;
  }
   
   //Calificaciones
   static public long addCalificaciones(Calificaciones cal){
    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session sc = sf.getCurrentSession();
    sc.getTransaction().begin();
    sc.save(cal);
    sc.getTransaction().commit();
    return cal.getId();
  }
  
   static public long updateCalificaciones(Calificaciones cal){
    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session sc = sf.getCurrentSession();
    sc.getTransaction().begin();
    sc.update(cal);
    sc.getTransaction().commit();
    return cal.getId();
  }
   
   static public long deleteCalificaciones(Calificaciones cal) {
    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session sc = sf.getCurrentSession();
    sc.getTransaction().begin();
    sc.delete(cal);
    sc.getTransaction().commit();
    return cal.getId();
  }
   
   static public Calificaciones getCalificaciones( int id) {
    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session sc = sf.getCurrentSession();
    sc.getTransaction().begin();
    Query sq = sc.createSQLQuery("SELECT * FROM Calificaciones WHERE idCalificaciones = "+ id).addEntity(Calificaciones.class);
    Calificaciones cal = (Calificaciones) sq.uniqueResult();
    sc.getTransaction().commit();
    return cal;
  }
   
   static public List <Calificaciones> getCalificaciones( String sql ) {
    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session sc = sf.getCurrentSession();
    sc.getTransaction().begin();
    Query sq = sc.createSQLQuery(sql).addEntity(Calificaciones.class);
    List<Calificaciones> cal = sq.list();
    sc.getTransaction().commit();
    return cal;
  }
   
   //Asistencia
   static public long addAsistencia(Asistencia ast){
    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session sc = sf.getCurrentSession();
    sc.getTransaction().begin();
    sc.save(ast);
    sc.getTransaction().commit();
    return ast.getId();
  }
  
   static public long updateAsistencia(Asistencia ast){
    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session sc = sf.getCurrentSession();
    sc.getTransaction().begin();
    sc.update(ast);
    sc.getTransaction().commit();
    return ast.getId();
  }
   
   static public long deleteAsistencia(Asistencia ast) {
    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session sc = sf.getCurrentSession();
    sc.getTransaction().begin();
    sc.delete(ast);
    sc.getTransaction().commit();
    return ast.getId();
  }
   
   static public Asistencia getAsistencia( int id) {
    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session sc = sf.getCurrentSession();
    sc.getTransaction().begin();
    Query sq = sc.createSQLQuery("SELECT * FROM Asistencias WHERE idAsistencias = "+ id).addEntity(Asistencia.class);
    Asistencia ast = (Asistencia) sq.uniqueResult();
    sc.getTransaction().commit();
    return ast;
  }
   
   static public List <Asistencia> getAsistencia( String sql ) {
    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session sc = sf.getCurrentSession();
    sc.getTransaction().begin();
    Query sq = sc.createSQLQuery(sql).addEntity(Asistencia.class);
    List<Asistencia> ast = sq.list();
    sc.getTransaction().commit();
    return ast;
  }
   
   //Carreras
   static public long addCarrera(Carreras cra){
    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session sc = sf.getCurrentSession();
    sc.getTransaction().begin();
    sc.save(cra);
    sc.getTransaction().commit();
    return cra.getId();
  }
  
   static public long updateCarrera(Carreras cra){
    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session sc = sf.getCurrentSession();
    sc.getTransaction().begin();
    sc.update(cra);
    sc.getTransaction().commit();
    return cra.getId();
  }
   
   static public long deleteCarrera(Carreras cra) {
    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session sc = sf.getCurrentSession();
    sc.getTransaction().begin();
    sc.delete(cra);
    sc.getTransaction().commit();
    return cra.getId();
  }
   
   static public Carreras getCarrera( int id) {
    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session sc = sf.getCurrentSession();
    sc.getTransaction().begin();
    Query sq = sc.createSQLQuery("SELECT * FROM Carreras WHERE idCarrera = "+ id).addEntity(Carreras.class);
    Carreras cra = (Carreras) sq.uniqueResult();
    sc.getTransaction().commit();
    return cra;
  }
   
   static public List <Carreras> getCarrera( String sql ) {
    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session sc = sf.getCurrentSession();
    sc.getTransaction().begin();
    Query sq = sc.createSQLQuery(sql).addEntity(Carreras.class);
    List<Carreras> cra = sq.list();
    sc.getTransaction().commit();
    return cra;
  }
   
   //Cuentas
   static public long addCuentas(Cuentas cts){
    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session sc = sf.getCurrentSession();
    sc.getTransaction().begin();
    sc.save(cts);
    sc.getTransaction().commit();
    return cts.getId();
  }
  
   static public long updateCuentas(Cuentas cts){
    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session sc = sf.getCurrentSession();
    sc.getTransaction().begin();
    sc.update(cts);
    sc.getTransaction().commit();
    return cts.getId();
  }
   
   static public long deleteCuentas(Cuentas cts) {
    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session sc = sf.getCurrentSession();
    sc.getTransaction().begin();
    sc.delete(cts);
    sc.getTransaction().commit();
    return cts.getId();
  }
   
   static public Cuentas getCuenta( int id) {
    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session sc = sf.getCurrentSession();
    sc.getTransaction().begin();
    Query sq = sc.createSQLQuery("SELECT * FROM Cuentas WHERE idCuentas = "+ id).addEntity(Cuentas.class);
    Cuentas cts = (Cuentas) sq.uniqueResult();
    sc.getTransaction().commit();
    return cts;
  }
   
   static public List <Cuentas> getCuentas( String sql ) {
    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session sc = sf.getCurrentSession();
    sc.getTransaction().begin();
    Query sq = sc.createSQLQuery(sql).addEntity(Cuentas.class);
    List<Cuentas> cts = sq.list();
    sc.getTransaction().commit();
    return cts;
  }
   
   //Grupos
   static public long addGrupos(Grupos gps){
    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session sc = sf.getCurrentSession();
    sc.getTransaction().begin();
    sc.save(gps);
    sc.getTransaction().commit();
    return gps.getId();
  }
  
   static public long updateGrupos(Grupos gps){
    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session sc = sf.getCurrentSession();
    sc.getTransaction().begin();
    sc.update(gps);
    sc.getTransaction().commit();
    return gps.getId();
  }
   
   static public long deleteGrupos(Grupos gps) {
    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session sc = sf.getCurrentSession();
    sc.getTransaction().begin();
    sc.delete(gps);
    sc.getTransaction().commit();
    return gps.getId();
  }
   
   static public Grupos getGrupos( int id) {
    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session sc = sf.getCurrentSession();
    sc.getTransaction().begin();
    Query sq = sc.createSQLQuery("SELECT * FROM Grupos WHERE idGrupos = "+ id).addEntity(Grupos.class);
    Grupos gps = (Grupos) sq.uniqueResult();
    sc.getTransaction().commit();
    return gps;
  }
   
   static public List <Grupos> getGrupos( String sql ) {
    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session sc = sf.getCurrentSession();
    sc.getTransaction().begin();
    Query sq = sc.createSQLQuery(sql).addEntity(Grupos.class);
    List<Grupos> gps = sq.list();
    sc.getTransaction().commit();
    return gps;
  }
   
   //Grupos listas
    static public long addGruposListas(AlumnoGruposListas gl){
    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session sc = sf.getCurrentSession();
    sc.getTransaction().begin();
    sc.save(gl);
    sc.getTransaction().commit();
    return gl.getId();
  }
  
   static public long updateGruposListas(AlumnoGruposListas gl){
    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session sc = sf.getCurrentSession();
    sc.getTransaction().begin();
    sc.update(gl);
    sc.getTransaction().commit();
    return gl.getId();
  }
   
   static public long deleteGruposListas(AlumnoGruposListas gl) {
    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session sc = sf.getCurrentSession();
    sc.getTransaction().begin();
    sc.delete(gl);
    sc.getTransaction().commit();
    return gl.getId();
  }
   
   static public AlumnoGruposListas getGruposListas( int id) {
    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session sc = sf.getCurrentSession();
    sc.getTransaction().begin();
    Query sq = sc.createSQLQuery("SELECT * FROM GruposListas WHERE idGruposListas = "+ id).addEntity(AlumnoGruposListas.class);
    AlumnoGruposListas gl = (AlumnoGruposListas) sq.uniqueResult();
    sc.getTransaction().commit();
    return gl;
  }
   
   static public List <AlumnoGruposListas> getGruposListas( String sql ) {
    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session sc = sf.getCurrentSession();
    sc.getTransaction().begin();
    Query sq = sc.createSQLQuery(sql).addEntity(AlumnoGruposListas.class);
    List<AlumnoGruposListas> gl = sq.list();
    sc.getTransaction().commit();
    return gl;
  }
   
   //Kardex
   static public long addKardex(Kardex kx) {
    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session sc = sf.getCurrentSession();
    sc.getTransaction().begin();
    sc.save(kx);
    sc.getTransaction().commit();
    return kx.getId();
  }

  static public long updateKardex(Kardex kx) {
    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session sc = sf.getCurrentSession();
    sc.getTransaction().begin();
    sc.update(kx);
    sc.getTransaction().commit();
    return kx.getId();
  }

  static public long deleteKardex(Kardex kx) {
    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session sc = sf.getCurrentSession();
    sc.getTransaction().begin();
    sc.delete(kx);
    sc.getTransaction().commit();
    return kx.getId();
  }

  static public Kardex getKardex(int id) {
    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session sc = sf.getCurrentSession();
    sc.getTransaction().begin();
    Query sq = sc.createSQLQuery("SELECT * FROM Kardex WHERE idKardex = " + id).addEntity(Kardex.class);
    Kardex kx = (Kardex) sq.uniqueResult();
    sc.getTransaction().commit();
    return kx;
  }

  static public List<Kardex> getKardex(String sql) {
    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session sc = sf.getCurrentSession();
    sc.getTransaction().begin();
    Query sq = sc.createSQLQuery(sql).addEntity(Kardex.class);
    List<Kardex> kx = sq.list();
    sc.getTransaction().commit();
    return kx;
  }
  
  //Materias
   static public long addMAterias(Materias mat){
    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session sc = sf.getCurrentSession();
    sc.getTransaction().begin();
    sc.save(mat);
    sc.getTransaction().commit();
    return mat.getId();
  }
  
   static public long updateMaterias(Materias mat){
    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session sc = sf.getCurrentSession();
    sc.getTransaction().begin();
    sc.update(mat);
    sc.getTransaction().commit();
    return mat.getId();
  }
   
   static public long deleteMaterias(Materias mat) {
    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session sc = sf.getCurrentSession();
    sc.getTransaction().begin();
    sc.delete(mat);
    sc.getTransaction().commit();
    return mat.getId();
  }
   
   static public Materias getMaterias( int id) {
    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session sc = sf.getCurrentSession();
    sc.getTransaction().begin();
    Query sq = sc.createSQLQuery("SELECT * FROM Materias WHERE idMaterias = "+ id).addEntity(Materias.class);
    Materias mat = (Materias) sq.uniqueResult();
    sc.getTransaction().commit();
    return mat;
  }
   
   static public List <Materias> getMaterias( String sql ) {
    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session sc = sf.getCurrentSession();
    sc.getTransaction().begin();
    Query sq = sc.createSQLQuery(sql).addEntity(Materias.class);
    List<Materias> mat = sq.list();
    sc.getTransaction().commit();
    return mat;
  }
   
   //Plan de Estudios
    static public long addPlanEstudios(PlanEstudios pe){
    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session sc = sf.getCurrentSession();
    sc.getTransaction().begin();
    sc.save(pe);
    sc.getTransaction().commit();
    return pe.getId();
  }
  
   static public long updatePlanEstudios(PlanEstudios pe){
    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session sc = sf.getCurrentSession();
    sc.getTransaction().begin();
    sc.update(pe);
    sc.getTransaction().commit();
    return pe.getId();
  }
   
   static public long deletePlanEstudios(PlanEstudios pe) {
    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session sc = sf.getCurrentSession();
    sc.getTransaction().begin();
    sc.delete(pe);
    sc.getTransaction().commit();
    return pe.getId();
  }
   
   static public PlanEstudios getPlanEstudios( int id) {
    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session sc = sf.getCurrentSession();
    sc.getTransaction().begin();
    Query sq = sc.createSQLQuery("SELECT * FROM PlanEstudios WHERE idPlanEstudios = "+ id).addEntity(PlanEstudios.class);
    PlanEstudios pe = (PlanEstudios) sq.uniqueResult();
    sc.getTransaction().commit();
    return pe;
  }
   
   static public List <PlanEstudios> getPlanEstudios( String sql ) {
    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session sc = sf.getCurrentSession();
    sc.getTransaction().begin();
    Query sq = sc.createSQLQuery(sql).addEntity(PlanEstudios.class);
    List<PlanEstudios> pe = sq.list();
    sc.getTransaction().commit();
    return pe;
  }
   
   //Roles
    static public long addRoles(Roles rol){
    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session sc = sf.getCurrentSession();
    sc.getTransaction().begin();
    sc.save(rol);
    sc.getTransaction().commit();
    return rol.getId();
  }
  
   static public long updateRoles(Roles rol){
    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session sc = sf.getCurrentSession();
    sc.getTransaction().begin();
    sc.update(rol);
    sc.getTransaction().commit();
    return rol.getId();
  }
   
   static public long deleteRoles(Roles rol) {
    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session sc = sf.getCurrentSession();
    sc.getTransaction().begin();
    sc.delete(rol);
    sc.getTransaction().commit();
    return rol.getId();
  }
   
   static public Roles getRoles( int id) {
    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session sc = sf.getCurrentSession();
    sc.getTransaction().begin();
    sc.createCriteria(Roles.class).list(); //Trae todos los roles de la base de datos
    Query sq = sc.createSQLQuery("SELECT * FROM Roles WHERE idRoles = "+ id).addEntity(Grupos.class);
    Roles rol = (Roles) sq.uniqueResult();
    sc.getTransaction().commit();
    return rol;
  }
   
   static public List <Roles> getRoles( String sql ) {
    SessionFactory sf = HibernateUtil.getSessionFactory();
    Session sc = sf.getCurrentSession();
    sc.getTransaction().begin();
    Query sq = sc.createSQLQuery(sql).addEntity(Roles.class);
    List<Roles> rol = sq.list();
    sc.getTransaction().commit();
    return rol;
  }
}