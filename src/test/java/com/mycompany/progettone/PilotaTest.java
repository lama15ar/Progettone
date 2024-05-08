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
        System.out.println("ID Scuderia: " + pilota.getIdScuderia());
    }

    /**
     * Test of getNome method, of class Pilota.
     */
    @Test
    public void testGetNome() {
        System.out.println("Nome prima : " + pilota.getNome());
        pilota.setNome("Massimo");
        System.out.println("Nome dopo la modifica: " + pilota.getNome());
    }

    /**
     * Test of setNome method, of class Pilota.
     */
    @Test
    public void testSetNome() {
        System.out.println("Nome prima : " + pilota.getNome());
        pilota.setNome("Massimo");
        System.out.println("Nome dopo la modifica: " + pilota.getNome());
    }

    /**
     * Test of getCognome method, of class Pilota.
     */
    @Test
    public void testGetCognome() {
        System.out.println("Cognome prima: " + pilota.getCognome());
        pilota.setCognome("sorteni");
        System.out.println("Cognome dopo la modifica: " + pilota.getCognome());

    }

    /**
     * Test of setCognome method, of class Pilota.
     */
    @Test
    public void testSetCognome() {
        System.out.println("Cognome prima: " + pilota.getCognome());
        pilota.setCognome("sorteni");
        System.out.println("Cognome dopo la modifica: " + pilota.getCognome());

    }

    /**
     * Test of getScuderia method, of class Pilota.
     */
    @Test
    public void testGetScuderia() {
        System.out.println("Scuderia prima : " + pilota.getScuderia());
        pilota.setScuderia("ferrari");
        System.out.println("Scuderia dopo la modifica: " + pilota.getScuderia());
    }

    /**
     * Test of setScuderia method, of class Pilota.
     */
    @Test
    public void testSetScuderia() {
        System.out.println("Scuderia prima: " + pilota.getScuderia());
        pilota.setScuderia("ferrari");
        System.out.println("Scuderia dopo la modifica: " + pilota.getScuderia());
    }

    /**
     * Test of getVittorie method, of class Pilota.
     */
    @Test
    public void testGetVittorie() {
        System.out.println("Vittorie prima : " + pilota.getVittorie());
        pilota.setVittorie(110);
        System.out.println("Vittorie dopo la modifica: " + pilota.getVittorie());
    }

    /**
     * Test of setVittorie method, of class Pilota.
     */
    @Test
    public void testSetVittorie() {
        System.out.println("Vittorie prima : " + pilota.getVittorie());
        pilota.setVittorie(110);
        System.out.println("Vittorie dopo la modifica: " + pilota.getVittorie());
    }

    /**
     * Test of getData method, of class Pilota.
     */
    @Test
    public void testGetData() {
        System.out.println("Data di nascita prima : " + pilota.getData());
        pilota.setData(LocalDate.of(2005, 9, 30));
        System.out.println("Data di nascita dopo la modifica: " + pilota.getData());
    }

    /**
     * Test of setData method, of class Pilota.
     */
    @Test
    public void testSetData() {
        System.out.println("Data di nascita prima della modifica: " + pilota.getData());
        pilota.setData(LocalDate.of(1997, 9, 30));
        System.out.println("Data di nascita dopo la modifica: " + pilota.getData());
    }

    /**
     * Test of toString method, of class Pilota.
     */
    @Test
    public void testToString() {
          System.out.println("Rappresentazione del pilota: " + pilota.toString());
    }
    
}
