package controller;

import dao.*;
import database.HibernateUtil;
import model.Entrenador;
import model.Equipo;
import model.Liga;
import model.Posicion;

// Gestiona todo lo que haya en la liga
public class LigaController {

    private EntrenadorDao entrenadorDao;
    private EquipoDao equipoDao;

    private LigasDao ligasDao;

    private JugadorDao jugadorDao;

    private CompeticionDao competicionDao;

    // Inicializacion de las clases
    public LigaController() {
        entrenadorDao = new EntrenadorDao();
        equipoDao = new EquipoDao();
        ligasDao = new LigasDao();
        jugadorDao = new JugadorDao();
        competicionDao = new CompeticionDao();
    }

    public void agregarEntrenador(Entrenador entrenador) {


        //aplica la logica del negocio
        //hacemos preguntas para validar un entrenador.
        // si esta todo como necesito, persiste
        // Sino o  da fallo, no se incluye, no vale en el equipo
        // Se hace el filtro hacia la base de datos.


        if( entrenador.getCalificacion()<10){
            System.out.println("No es valido para este equipo");
        }else{
            entrenadorDao.agregarEntrenador(entrenador);
        }



    }
public void contratarEntrenador(int idEntrenador, int idEquipo) {

        Entrenador entrenador = entrenadorDao.obtenerEntrenador(idEntrenador);

    System.out.println(entrenador.getNombre());
            // Si quiero contratarlo
        if(entrenador.getTitulos()>4){
            Equipo equipo = equipoDao.getEquipo(idEquipo);// Lo añado
            equipo.setEntrenador(entrenador);
            equipoDao.actualizarEquipo(equipo);
        }else{
            // Hago otra cosa
        }
}

public void darAltaLiga( Liga liga) {
        ligasDao.crearLiga(liga);
    }


    public void inscribirseLiga(int idEquipo, int idLiga) {
        Equipo equipo = equipoDao.getEquipo(idEquipo);
        Liga liga = ligasDao.getLiga(idLiga);
        equipo.setLiga(liga);

        equipoDao.actualizarEquipo(equipo);

    }
    public void crearJugador(Jugador jugador, int idPosicion) {
        Session session = new HibernateUtil().getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Posicion posicion = session.get(Posicion.class.idPosicion);
        session.getTransaction().commit();
        session.close();
        jugadorDao.crearJugador(jugador, posicion);
    }

    public void analizarPlantilla(int id){
       List<Jugador> jugadores=  equipoDao.obtenerPlantilla(id);
       for (Jugador jugador: jugadores){
           System.out.println(jugador.getNombre());
       }

    }

    public void getEquiposCompeticion(int id){
        List<Equipo> list = competicionDao.getEquiposCompeticion(id);
        for (Equipo equipo: list){
            System.out.println(equipo.getNombre());
        }
    }


}
