/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.progettone;
import Eccezioni.EccezionePosizioneNonValida;
import Eccezioni.EccezionePosizioneOccupata;
import com.mycompany.progettone.Pilota;

public class Campionato {
    private Pilota[] piloti;
    private final static int NUM_MAX_PILOTI = 10;

    public Campionato() {
        piloti = new Pilota[NUM_MAX_PILOTI];
    }

    public Campionato(Campionato camp) {
        piloti = new Pilota[NUM_MAX_PILOTI];
        Pilota pil;
        for (int i = 0; i < camp.NUM_MAX_PILOTI(); i++) {
            pil = camp.getPilota(i);
            piloti[i] = pil;
        }
    }

    public Campionato(Pilota[] elencoPilota) throws EccezionePosizioneNonValida, EccezionePosizioneOccupata {
        piloti = new Pilota[NUM_MAX_PILOTI];
        int numeroPilotiDaAggiungere = elencoPilota.length;
        if (numeroPilotiDaAggiungere > NUM_MAX_PILOTI)
            numeroPilotiDaAggiungere = NUM_MAX_PILOTI;
        for (int i = 0; i < numeroPilotiDaAggiungere; i++) {
            setPiloti(i, elencoPilota[i]);
        }
    }

    public int setPiloti(int posizione, Pilota pilota) throws EccezionePosizioneNonValida, EccezionePosizioneOccupata {
        try {
            if (pilota == null)
                throw new NullPointerException("Il pilota non può essere nullo");
            if (posizione < 0 || posizione >= NUM_MAX_PILOTI)
                throw new EccezionePosizioneNonValida();
            if (piloti[posizione] != null)
                throw new EccezionePosizioneOccupata();
            piloti[posizione] = new Pilota(pilota);
            return posizione;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new EccezionePosizioneNonValida();
        }
    }

    private Pilota getPilota(int i) {
        return piloti[i];
    }

    private int NUM_MAX_PILOTI() {
        return NUM_MAX_PILOTI;
    }
}

    
    

    
