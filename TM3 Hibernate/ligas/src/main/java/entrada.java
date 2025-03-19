import controller.LigaController;
import dao.JugadorDao;
import model.Entrenador;
import model.Liga;

public class entrada {
    public static void main(String[] args) {
        LigaController ligaController = new LigaController(); // Con esto tengo acceso a todos los elementos

        ligaController.agregarEntrenador(new Entrenador("nicolas",9,0));

        ligaController.contratarEntrenador(1, idEquipo: 1);
        ligaController.darAltaLiga(new Liga(nombre: "santander"));
        ligaController.darAltaLiga(new Liga(nombre: "calcio"));
        ligaController.darAltaLiga(new Liga(nombre: "ruina"));
        ligaController.inscribirseLiga(idEquipo: 1, idLiga: 2);
        ligaController.crearJugador(new Jugador("juan", 1000, "española"), idPosicion: 4);
        ligaController.contratarJugador(idJugador: 1, idEquipo: 1);
        ligaController.analizarPlantilla(id:1);
        ligaController.getEquiposCompeticion(id:1);
        ligaController.getEquiposCompeticion(id:2);

    }
}
