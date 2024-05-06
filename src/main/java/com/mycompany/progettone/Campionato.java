/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.progettone;
import Eccezioni.EccezionePosizioneNonValida;
import Eccezioni.EccezionePosizioneOccupata;
import com.mycompany.progettone.Pilota;
import java.time.LocalDate;

public class Campionato {
    private Pilota[] piloti;
    private final static int NUM_MAX_PILOTI = 10;

    public Campionato() {
        piloti = new Pilota[NUM_MAX_PILOTI];
    }

    public Campionato(Campionato camp) {
        piloti = new Pilota[NUM_MAX_PILOTI];
        for (int i = 0; i < camp.NUM_MAX_PILOTI(); i++) {
            piloti[i]=new Pilota(piloti[i]);
        }
    }

    
      public void aggiungiPilota(String nome, String cognome, String scuderia, LocalDate dataNascita)
      {
        int posizione = -1;
        for (int i = 0; i <piloti.length; i++) {
            if (piloti[i]==null) {
                posizione=i;
                break;
            }
        }
        
     public Campionato(Pilota[] elencoPilota) throws EccezionePosizioneNonValida, EccezionePosizioneOccupata
    {
        piloti = new Pilota[NUM_MAX_PILOTI];
        int numeroPilotiDaAggiungere = elencoPilota.length;
        if (numeroPilotiDaAggiungere > NUM_MAX_PILOTI)
            numeroPilotiDaAggiungere = NUM_MAX_PILOTI;
        for (int i = 0; i < numeroPilotiDaAggiungere; i++) {
            setPiloti(elencoPilota[i]);
        }
    }

    public int setPiloti(Pilota pilota) throws EccezionePosizioneNonValida, EccezionePosizioneOccupata {
        if(NUM_MAX_PILOTI==piloti.length){
            //eccezione
        }
        int nPiloti=0;
        piloti[nPiloti]=new Pilota(pilota);
        return Piloti;
    }

    private Pilota getPilota(int codice) {
        for(int i=0; i<piloti.length; i++){
            if(piloti[i].getIdscuderia()==codice){
                return new Pilota(piloti[i]);
            }
        }
        return null;
    }

    private int NUM_MAX_PILOTI() {
        return NUM_MAX_PILOTI;
    }
    
    
}

    
    

    
