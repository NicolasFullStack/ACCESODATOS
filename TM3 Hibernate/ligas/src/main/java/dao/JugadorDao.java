package dao;

import com.mysql.cj.Session;
import database.HibernateUtil;
import model.Equipo;
import model.Posicion;
import model.jugador;

public class JugadorDao {
    private Session session;

    public void crearJugador(Jugador jugador, Posicion posicion);{

        session = new HibernateUtil().getSessionFactory().getCurrentSession();
        session.beginTransaction();
        jugador.setPosicion(posicion);
        session.merge(jugador); // explicacion clase 8 2T min 24
        session.getTransaction().commit();
        session.close();
    }

    public void  actualizarJugador(Jugador jugador) {
        session = new HibernateUtil().getSessionFactory().getCurrentSession();
        sesion.beginTransaction();
        sesion.merge(jugador);
        session.getTransaction().commit();
        session.close();
    }


    public Jugador obtenerJugador(int id){
        session = new HibernateUtil().getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Jugador jugador = session.get(Jugador.class.id);
        session.getTransaction().commit();
        session.close();
        return jugador;
    }

    public void contratarJugador(int idjugador, int idEquipo){

        Equipo equipo = equipoDao.getEquipo(idEquipo);
        Jugador jugador = jugadorDao.obtenerJugador(idjugador);
        jugador.setEquipo(equipo);
        jugadorDao.actualizarJugador(jugador);

    }

}
