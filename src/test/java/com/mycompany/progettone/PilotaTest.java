/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.progettone;

import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Studente
 */
public class PilotaTest {
     Pilota pilota = new Pilota("Lello", "pasa", "rar", 1800, LocalDate.of(1, 1, 7));
    
    public PilotaTest() {
    }

    /**
     * Test of getIdScuderia method, of class Pilota.
     */
    @Test
    public void testGetIdScuderia() {
        assertEquals(1, pilota.getIdScuderia(), "ID Scuderia errato");
    }

    /**
     * Test of getNome method, of class Pilota.
     */
    @Test
    public void testGetNome() {
        assertEquals("Lello", pilota.getNome(), "Nome prima della modifica errato");
        pilota.setNome("Massimo");
        assertEquals("Massimo", pilota.getNome(), "Nome dopo la modifica errato");
    }

    /**
     * Test of setNome method, of class Pilota.
     */
    @Test
    public void testSetNome() {
        
    }

    /**
     * Test of getCognome method, of class Pilota.
     */
    @Test
    public void testGetCognome() {
        assertEquals("pasa", pilota.getCognome(), "Cognome prima ");
        pilota.setCognome("sorteni");
        assertEquals("sorteni", pilota.getCognome(), "Cognome dopo ");

    }

    /**
     * Test of setCognome method, of class Pilota.
     */
    @Test
    public void testSetCognome() {
        

    }

    /**
     * Test of getScuderia method, of class Pilota.
     */
    @Test
    public void testGetScuderia() {
         assertEquals("rar", pilota.getScuderia(), "Scuderia prima ");
        pilota.setScuderia("Ferrari");
        assertEquals("Ferrari", pilota.getScuderia(), "Scuderia dopo ");
    }

    /**
     * Test of setScuderia method, of class Pilota.
     */
    @Test
    public void testSetScuderia() {
        
    }

    /**
     * Test of getVittorie method, of class Pilota.
     */
    @Test
    public void testGetVittorie() {
        assertEquals(1800, pilota.getVittorie(), "Vittorie prima ");
        pilota.setVittorie(110);
        assertEquals(110, pilota.getVittorie(), "Vittorie dopo ");
    }

    /**
     * Test of setVittorie method, of class Pilota.
     */
    @Test
    public void testSetVittorie() {
        pilota.setVittorie(110);
        
    }

    /**
     * Test of getData method, of class Pilota.
     */
    @Test
    public void testGetData() {
        assertEquals(LocalDate.of(1, 1, 7), pilota.getData(), "Data di nascita prima ");
        pilota.setData(LocalDate.of(2005, 9, 30));
        assertEquals(LocalDate.of(2005, 9, 30), pilota.getData(), "Data di nascita dopo ");
        
    }

    /**
     * Test of setData method, of class Pilota.
     */
    @Test
    public void testSetData() {
        
                
               
    }

    /**
     * Test of toString method, of class Pilota.
     */
    @Test
    public void testToString() {
         assertEquals("Pilota{idScuderia=1, nome='massimo', cognome='sorteni', scuderia='rar', vittorie=110, data=2005-09-30}", pilota.toString(), "Rappresentazione del pilota errata");
    }
    
}
