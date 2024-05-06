/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.progettone;

import com.mycompany.progettone.newpackage.ConsoleInput;
import com.mycompany.progettone.newpackage.Menu;
import com.mycompany.progettone.Pilota;
import com.mycompany.progettone.Campionato;
import Eccezioni.*;
import java.io.IOException;
import java.time.LocalDate;


/**
 *
 * @author Studente
 */
public class App {

    public static void main(String[] args)
    {
    System.out.println("  __                           _          __ ");
    System.out.println(" / _|                          | |       /_ |");
     System.out.println(" | |_ ___  _ __ _ __ ___  _   _| | __ _   | | ");
     System.out.println(" |  _/ _ \\| '__| '_ ` _ \\| | | | |/ _` |  | | ");
     System.out.println(" | || (_) | |  | | | | | | |_| | | (_| |  | |");
     System.out.println(" |_| \\___/|_|  |_| |_| |_|\\__,_|_|\\__,_|  |_| ");
     
    String[] vociMenu;
    int numeroVoci=8;
    String nome;
    String cognome;
    String scuderia;
    int vittorie;
    Campionato f1=new Campionato();
    Pilota[] piloti = new Pilota[NUM_MAX_PILOTI];
    vociMenu=new String[numeroVoci];
    Menu menu;
    int voceScelta;
    ConsoleInput tastiera=new ConsoleInput();
    String[] elencoTitoliAutore;
    String nomeFile="f1.csv";
        
        vociMenu[0]="\t--> Esci";
        vociMenu[1]="\t--> Visualizza tutti i piloti presenti";
        vociMenu[2]="\t--> Aggiungi pilota";
        vociMenu[3]="\t--> Visualizza pilota singolo (id) ";
        vociMenu[4]="\t--> Elimina pilota (id)";
        vociMenu[5]="\t--> Mostra piloti in ordine di vittorie";
        vociMenu[6]="\t--> Esporta i volumi su file CSV";
        vociMenu[7]="\t--> Importa i volumi da file CSV";
        
         menu=new Menu(vociMenu);
 
      do
      {
            System.out.println("Menu:");
            voceScelta=menu.sceltaMenu();

        while (true) {
            menu.visualizzaMenu();
            

            switch (voceScelta) {
                 case 0: 
                    System.out.println("Arrivederci!");    
                    break;

                case 1:
                    // Visualizza tutti i piloti presenti
                    try {
                        System.out.println("Piloti presenti nel campionato:");
                        for (Pilota pilota :) {
                            System.out.println(pilota);
                        }
                        } catch (EccezionePosizioneNonValida e) {
                        System.out.println("Errore: " );
                    }
                    break;
                case 2:
                    // Aggiungi pilota
                    try {
                        System.out.println("Nome --> ");
                        nome=tastiera.readString();
                        System.out.println("cognome--> ");
                        cognome=tastiera.readString();
                        System.out.println("scuderia");
                        scuderia=tastiera.readString();
                        LocalDate data = LocalDate.now(); 
                        Pilota nuovoPilota = new Pilota(nome, cognome, scuderia, data);
                        f1.aggiungiPilota(nuovoPilota);
                        System.out.println("Pilota aggiunto con successo.");
                     } catch (EccezionePosizioneNonValida | EccezionePosizioneOccupata |IOException e) {
                        System.out.println("Errore");
                    }
                    break;
                case 3:
                    // Visualizza pilota singolo (id)
                    try {
                        int id = tastiera.leggiIntero("Inserisci l'id del pilota da visualizzare: ");
                        Pilota pilota = f1.getPilota(id);
                        if (pilota != null) {
                            System.out.println("Pilota trovato:");
                            System.out.println(pilota);
                        } else {
                            System.out.println("Nessun pilota trovato con l'id specificato.");
                        }
                    } catch (EccezionePosizioneNonValida e) {
                        System.out.println("Errore: ");
                    }
                    break;
                case 4:
                    // Elimina pilota (id)
                    try {
                        int id =tastiera.leggiIntero("Inserisci l'id del pilota da eliminare: ");
                        boolean successo = f1.eliminaPilotaById(id);
                        if (successo) {
                            System.out.println("Pilota eliminato con successo.");
                        } else {
                            System.out.println("Nessun pilota trovato con l'id specificato.");
                        }
                    } catch (EccezionePosizioneNonValida e) {
                        System.out.println("Errore: " + e.getMessage());
                    }
                    break;
                case 5:
                    // Mostra piloti in ordine di vittorie
                    try {
                        Pilota[] pilotiOrdinati = f1.getPilotiOrdinatiPerVittorie();
                        System.out.println("Piloti ordinati per vittorie:");
                        for (Pilota pilota : pilotiOrdinati)
                        {
                            System.out.println(pilota);
                        }
                        
                        } 
                        catch (EccezionePosizioneNonValida e)
                        {
                             System.out.println("Errore: " );
                        }
                    break;
                case 6:
                     

                    break;
                case 7:
                    // Importa i volumi da file CSV
                    // Da implementare
                    break;
                default:
                    System.out.println("Scelta non valida, riprova.");
            }
        }
      }while(voceScelta!=0); 
    
         
    }
}