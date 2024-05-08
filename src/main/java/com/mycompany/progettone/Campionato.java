/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.progettone;

import Eccezioni.EccezionePosizioneNonValida;
import Eccezioni.EccezionePosizioneOccupata;
import com.mycompany.progettone.Pilota;
import java.io.*;
import Eccezioni.*;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * La classe Campionato gestisce i piloti e le operazioni relative al campionato di Formula 1.
 */
public class Campionato implements Serializable{
    private Pilota[] piloti;
    private final static int NUM_MAX_PILOTI = 10;
  /**
     * Costruttore della classe Campionato.
     * Inizializza l'array dei piloti con la dimensione massima prestabilita.
     */
    public Campionato() {
        piloti = new Pilota[NUM_MAX_PILOTI];
    }
 /**
     * Aggiunge un pilota al campionato.
     * @param pilota Il pilota da aggiungere.
     * @param vittorie Il numero di vittorie del pilota.
     * @throws EccezionePosizioneOccupata Se non ci sono posizioni disponibili per il pilota.
     */
    public void aggiungiPilota(Pilota pilota,int vittorie) throws EccezionePosizioneOccupata {
        for (int i = 0; i < piloti.length; i++) {
            if (piloti[i] == null) {
                piloti[i] = pilota;
                pilota.setVittorie(vittorie);
                
                return;
            }
        }
        
    }
  /**
     * Ottiene il pilota con l'ID specificato.
     * @param id L'ID del pilota da cercare.
     * @return Il pilota corrispondente all'ID, null se non trovato.
     * @throws EccezionePosizioneNonValida Se l'ID specificato non è valido.
     */
    public Pilota getPilota(int id) throws EccezionePosizioneNonValida {
        for (Pilota pilota : piloti) {
            if (pilota != null && pilota.getIdScuderia() == id) {
                return pilota;
            }
        }
        return null;
        
    }
    /**
     * Ottiene l'array dei piloti.
     * @return L'array dei piloti.
     */
    public Pilota[] getPiloti() {
        return piloti;
    }
     /**
     * Cancella un pilota dal campionato.
     * @param idScuderia L'ID del pilota da cancellare.
     * @throws EccezionePosizioneNonValida Se l'ID specificato non è valido.
     */
    public void cancellaPilota(int idScuderia) throws EccezionePosizioneNonValida {
    for (int i = 0; i < piloti.length; i++) {
        if (piloti[i] != null && piloti[i].getIdScuderia() == idScuderia) {
            piloti[i]=null;
            return;
        }
    }
    
  }
    /**
     * Ordina i piloti per numero di vittorie.
     * @return Un array di piloti ordinati per numero di vittorie.
     */
    public  Pilota[] ordinaPiloti()
    {
         Pilota[] pilotiOrdinati = new Pilota[piloti.length];
    
    
      for (int i = 0; i < piloti.length; i++) {
        pilotiOrdinati[i] = piloti[i];
    }
    for (int i = 0; i < pilotiOrdinati.length - 1; i++) {
        for (int j = i + 1; j < pilotiOrdinati.length; j++) {
            if (pilotiOrdinati[j] != null && pilotiOrdinati[i] != null && pilotiOrdinati[j].getVittorie() < pilotiOrdinati[i].getVittorie()) {
                Pilota pilO = pilotiOrdinati[j];
                pilotiOrdinati[j] = pilotiOrdinati[i];
                pilotiOrdinati[i] = pilO;
              }
          }
      }
        return pilotiOrdinati;
        
    }

     /**
     * Visualizza tutti i piloti presenti nel campionato.
     */
    public void visualizzaPiloti() {
        for (Pilota pilota : piloti) {
            if (pilota != null) {
                System.out.println(pilota);
            }
        }
    }
    
    
    /**
 * Modifica i dettagli di un pilota nel campionato.
 * @param idScuderia L'ID del pilota da modificare.
 * @param nome Il nuovo nome del pilota.
 * @param cognome Il nuovo cognome del pilota.
 * @param scuderia La nuova scuderia del pilota.
 * @param vittorie Il nuovo numero di vittorie del pilota.
 * @throws EccezionePosizioneNonValida Se l'ID specificato non è valido.
 */
    public void modificaPilota(int idScuderia, String nome, String cognome, String scuderia, int vittorie) throws EccezionePosizioneNonValida {
    Pilota pilotaModificato = null;
    for (int i = 0; i < piloti.length; i++) {
        if (piloti[i] != null && piloti[i].getIdScuderia() == idScuderia) {
            pilotaModificato = piloti[i];
            break;
        }
    }
     if (pilotaModificato != null) {
        pilotaModificato.setNome(nome);
        pilotaModificato.setCognome(cognome);
        pilotaModificato.setScuderia(scuderia);
        pilotaModificato.setVittorie(vittorie);
    } else {
         System.out.println("pos non valida");
    
     }
   }
}
  

 