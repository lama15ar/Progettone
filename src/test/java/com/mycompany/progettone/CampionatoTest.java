/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.progettone;

import Eccezioni.EccezionePosizioneOccupata;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Studente
 */
public class CampionatoTest {
    
    public CampionatoTest() {
    }

    /**
     * Test of aggiungiPilota method, of class Campionato.
     */
    @Test
    public void testAggiungiPilota() throws Exception {
        Campionato campionato = new Campionato();
        Pilota pilota = new Pilota("Lewis", "Hamilton", "Mercedes", 100, LocalDate.of(1985, 1, 7));

        campionato.aggiungiPilota(pilota, 100);

        assertEquals(pilota, campionato.getPiloti()[0]);
    }

    /**
     * Test of getPilota method, of class Campionato.
     */
    @Test
    public void testGetPilota() throws Exception {
        Campionato campionato = new Campionato();
        Pilota pilota1 = new Pilota("Fernando", "lonso", "Alpinaggio", 30, LocalDate.of(1981, 7, 29));
        Pilota pilota2 = new Pilota("Carlos", "Sainz", "Ferrari", 5, LocalDate.of(1994, 9, 1));

        campionato.aggiungiPilota(pilota1, 30);
        campionato.aggiungiPilota(pilota2, 5);

        Pilota[] piloti = campionato.getPiloti();

        assertEquals(pilota1, piloti[0]);
        assertEquals(pilota2, piloti[1]);
    }

    /**
     * Test of getPiloti method, of class Campionato.
     */
    @Test
    public void testGetPiloti() {
    }

    /**
     * Test of cancellaPilota method, of class Campionato.
     */
    @Test
    public void testCancellaPilota() throws Exception {
        Campionato campionato = new Campionato();
        Pilota pilota1 = new Pilota("lama", "sos", "ferro", 1, LocalDate.of(2005, 12, 3));
        Pilota pilota2 = new Pilota("Maximo", "Verstappen", "Red Bull Racing", 20, LocalDate.of(1997, 9, 30));

        campionato.aggiungiPilota(pilota1, 50);
        campionato.aggiungiPilota(pilota2, 20);

        campionato.cancellaPilota((int) pilota1.getIdScuderia());

        assertEquals(null, campionato.getPiloti()[0]);
    }

    /**
     * Test of ordinaPiloti method, of class Campionato.
     */
    @Test
    public void testOrdinaPiloti() throws EccezionePosizioneOccupata {
        Campionato campionato = new Campionato();
        Pilota pilota1 = new Pilota("loppa", "Al", "pippo", 30, LocalDate.of(2009, 7, 29));
        Pilota pilota2 = new Pilota("Carlo", "Sainzo", "rossa", 5, LocalDate.of(1900, 9, 1));

        campionato.aggiungiPilota(pilota1, 30);
        campionato.aggiungiPilota(pilota2, 5);

        Pilota[] pilotiOrdinati = campionato.ordinaPiloti();

        assertEquals(pilota2, pilotiOrdinati[0]);
        assertEquals(pilota1, pilotiOrdinati[1]);
    }

    /**
     * Test of visualizzaPiloti method, of class Campionato.
     */
    @Test
    public void testVisualizzaPiloti() {
    }
    
}