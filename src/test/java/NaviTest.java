import entities.Aircraft;
import entities.AircraftCarrier;
import entities.Navy;
import entities.Board;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class NaviTest {

    @Test
    void ObtenerAliasIdenticos () {
        Navy navys = new Navy("LA GRAN FLOTA", "1");
        Navy navys2 = new Navy("LA GRAN FLOTA", "2");
        Board boards = new Board();

        assertTrue(boards.addNavy(navys2));
        assertTrue(boards.addNavy(navys));
        assertEquals(navys.alias(), 2);
    }

    @Test
    void crearDosFlotasConElMismoCodigo() {
        Navy navys = new Navy("LA GRAN FLOTA", "1");
        Board board = new Board();

        assertTrue(board.addNavy(navys));
        assertFalse(board.addNavy(navys));
    }

    @Test
    void obtenerInformacionDelEnemigo() {
        Navy navys = new Navy("LA GRAN FLOTA B", "1");
        Navy navys2 = new Navy("LA GRAN FLOTA A", "2");
        Board board = new Board();

        assertTrue(board.addNavy(navys));
        assertTrue(board.addNavy(navys2));
        assertEquals(navys.getEnemy(), "LA GRAN FLOTA A");
    }

    @Test
    public void obtenerCapacidaddelAircraftCarrier () {
        AircraftCarrier carrier1 = new AircraftCarrier(1, 4,null);
        AircraftCarrier carrier2 = new AircraftCarrier(2, 2,null);
        Navy navys = new Navy("LA GRAN FLOTA", "1");

        assertTrue(navys.addAircraftCarrier(carrier1));
        assertTrue(navys.addAircraftCarrier(carrier2));
        assertEquals(navys.disponibilidadEnPortaAviones(), 6);
    }

    @Test
    void obtenerPlacasdeAvionesEnemigosenAire() {
        Aircraft aircraft = new Aircraft("A", true, true, true, null);
        Aircraft aircraft2 = new Aircraft("B", true, true, true, null);
        Aircraft aircraft3 = new Aircraft("C", false, true, false, null);
        Navy navys = new Navy("LA GRAN FLOTA B", "1");
        Navy navys2 = new Navy("LA GRAN FLOTA A", "2");
        Board board = new Board();

        ArrayList<String> flotas = new ArrayList<>();
        flotas.add("B");

        assertTrue(navys.addAircraft(aircraft));
        assertTrue(navys2.addAircraft(aircraft2));
        assertTrue(navys.addAircraft(aircraft3));
        assertTrue(board.addNavy(navys));
        assertTrue(board.addNavy(navys2));
        assertArrayEquals(navys.enAire().toArray(new String[0]), flotas.toArray(new String[0]));
    }

    @Test
    void obtenerSiEsUnBuenAtaque() {

    }
}
