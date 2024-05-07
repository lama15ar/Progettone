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

public class Campionato {
    private Pilota[] piloti;
    private final static int NUM_MAX_PILOTI = 10;

    public Campionato() {
        piloti = new Pilota[NUM_MAX_PILOTI];
    }

    public void aggiungiPilota(Pilota pilota,int vittorie) throws EccezionePosizioneOccupata {
        for (int i = 0; i < piloti.length; i++) {
            if (piloti[i] == null) {
                piloti[i] = pilota;
                pilota.setVittorie(vittorie);
                
                return;
            }
        }
        
    }

    public Pilota getPilota(int id) throws EccezionePosizioneNonValida {
        for (Pilota pilota : piloti) {
            if (pilota != null && pilota.getIdScuderia() == id) {
                return pilota;
            }
        }
        return null;
        
    }
    public Pilota[] getPiloti() {
        return piloti;
    }
    
    public void cancellaPilota(int idScuderia) throws EccezionePosizioneNonValida {
    for (int i = 0; i < piloti.length; i++) {
        if (piloti[i] != null && piloti[i].getIdScuderia() == idScuderia) {
            piloti[i]=null;
            return;
        }
    }
    
  }
    
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

    
    public void visualizzaPiloti() {
        for (Pilota pilota : piloti) {
            if (pilota != null) {
                System.out.println(pilota);
            }
        }
    }
}

