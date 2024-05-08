/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.progettone;

import com.mycompany.progettone.newpackage.ConsoleInput;
import com.mycompany.progettone.newpackage.Menu;
import com.mycompany.progettone.Pilota;
import com.mycompany.progettone.Campionato;
import Eccezioni.*;
import com.mycompany.progettone.newpackage.TextFile;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App implements Serializable{
     


    public static void main(String[] args) {
        System.out.println("  __                           _          __ ");
        System.out.println(" / _|                          | |       /_ |");
        System.out.println(" | |_ ___  _ __ _ __ ___  _   _| | __ _   | | ");
        System.out.println(" |  _/ _ \\| '__| '_ ` _ \\| | | | |/ _` |  | | ");
        System.out.println(" | || (_) | |  | | | | | | |_| | | (_| |  | |");
        System.out.println(" |_| \\___/|_|  |_| |_| |_|\\__,_|_|\\__,_|  |_| ");

         // Variabili per l'inserimento dei dati del pilota
        String nome;
        String cognome;
        String scuderia;
        int vittorie;
        
        
        /*
         Variabili per l'inserimento dei dati del pilota
        */
        String[] vociMenu;
        int numeroVoci =10;
        Campionato f1 = new Campionato();
        vociMenu = new String[numeroVoci];
        Menu menu;
        int voceScelta;
        ConsoleInput tastiera = new ConsoleInput();
        String nomeFile = "f1.csv";
        String nomeFileBinario="Campionato.bin";
               try 
                    {
                       ObjectInputStream reader=new ObjectInputStream(new FileInputStream(nomeFileBinario));
                       f1=(Campionato)reader.readObject();
                       reader.close();
                       System.out.println("Caricamento effettuato corretamente");
                    } 
                    catch (FileNotFoundException ex) 
                    {
                        System.out.println("file non trovato ");
                    } 
                    catch (IOException ex) 
                    {
                        System.out.println("impossbile accedere al file");
                    } 
                    catch (ClassNotFoundException ex) 
                    {
                        System.out.println("impossbile legger il dato memorizzato ");
                    }

        vociMenu[0] = "\t--> Esci";
        vociMenu[1] = "\t--> Visualizza tutti i piloti presenti";
        vociMenu[2] = "\t--> Aggiungi pilota";
        vociMenu[3] = "\t--> Visualizza pilota singolo (id) ";
        vociMenu[4] = "\t--> Elimina pilota (id)";
        vociMenu[5] = "\t--> Mostra piloti in ordine di vittorie";
        vociMenu[6] = "\t--> Esporta i volumi su file CSV";
        vociMenu[7] = "\t--> Importa i volumi da file CSV";
        vociMenu[8] = "\t--> salva dati Campionatio";
        vociMenu[9] = "\t--> carica dati Campionato";

        menu = new Menu(vociMenu);

        do {
            System.out.println("Menu:");
            voceScelta = menu.sceltaMenu();

            switch (voceScelta) {
                case 0:
                    System.out.println("Arrivederci!");
                    break;

                case 1:
               
                    System.out.println("Piloti presenti nel campionato:");
                    f1.visualizzaPiloti();
                    break;

                case 2:
                    
                    try {
                        do{
                            System.out.println("Nome --> ");
                            nome= tastiera.readString();
                        }while(nome.contains("0") || nome.contains("1") || nome.contains("2") || nome.contains("3") || nome.contains("4") || nome.contains("5") || nome.contains("6") || nome.contains("7") || nome.contains("8") || nome.contains("9") );
                        do{
                            System.out.println("Cognome --> ");
                             cognome = tastiera.readString();
                         }while(cognome.contains("0") || cognome.contains("1") || cognome.contains("2") || cognome.contains("3") || cognome.contains("4") || cognome.contains("5") || cognome.contains("6") || cognome.contains("7") || cognome.contains("8") || cognome.contains("9") );
                        do{
                            System.out.println("Scuderia --> ");
                             scuderia = tastiera.readString();
                        }while(scuderia.contains("0") || scuderia.contains("1") || scuderia.contains("2") || scuderia.contains("3") || scuderia.contains("4") || scuderia.contains("5") || scuderia.contains("6") || scuderia.contains("7") || scuderia.contains("8") || scuderia.contains("9") );
                         try{
                                 System.out.println("vittorie --> ");
                                 vittorie = tastiera.readInt();
                                 LocalDate data = LocalDate.now();
                                 Pilota nuovoPilota = new Pilota(nome, cognome,scuderia,vittorie,data);
                                 f1.aggiungiPilota(nuovoPilota,vittorie);
                                 System.out.println("Pilota aggiunto con successo.");
                            }
                            catch(NumberFormatException e)
                            {          
                                 System.out.println("non hai messo un numero");
                            }
                        
                       
                    } catch (EccezionePosizioneOccupata | IOException e) {
                        System.out.println("Errore: ");
                    }
                    break;

                case 3:
                   
                    try {
                        System.out.println("Inserisci l'id del pilota da visualizzare");
                        int id = tastiera.readInt();
                        Pilota pilota = f1.getPilota(id);
                        if (pilota != null) {
                            System.out.println("Pilota trovato:");
                            System.out.println(pilota);
                        } else {
                            System.out.println("Nessun pilota trovato con l'id specificato.");
                        }
                    } catch (EccezionePosizioneNonValida  e) {
                        System.out.println("Errore posizione ");
                    } catch (IOException ex) {
                        System.out.println("erorre io");
                } catch (NumberFormatException ex) {
                    
                }
                    break;


               case 4:
                    try {
                        System.out.println("dammi id di un pilota da cancellare ");
                        int id = tastiera.readInt();
                        f1.cancellaPilota(id);
                        System.out.println("pilota cancellato");
                    } catch (IOException ex) {
                        System.out.println("errore IO");
                    } catch (NumberFormatException ex) {
                        System.out.println("errore numero");
                    } catch (EccezionePosizioneNonValida ex) {
                        System.out.println("posizione nn valida");
                }
                
                  break;



                case 5:
                    Pilota[] pilotiOrdinati = f1.ordinaPiloti();
                    System.out.println("Piloti ordinati per vittorie (ordine crescente):");
                    for (Pilota pilota : pilotiOrdinati)
                    {
                        if (pilota != null)
                        {
                         System.out.println(pilota);
                        }
                    }
                    
                    break;

                case 6:
                    try
                    {
                        TextFile fileCSV = new TextFile(nomeFile, 'W'); 
                        Pilota[] piloti = f1.getPiloti();
                        for (int i = 0;i <piloti.length;i++)
                        {
                             Pilota pilota =piloti[i];
                             if (pilota != null)
                             {
                                  String datiPilota = pilota.getIdScuderia() + ";" + pilota.getNome() + ";" + pilota.getCognome() + ";" + pilota.getScuderia() + ";" + pilota.getVittorie() + ";" + pilota.getData();
                                 try { 
                                     fileCSV.toFile(datiPilota);
                                 } catch (com.mycompany.progettone.newpackage.FileException ex) {
                                     System.out.println("errore");;
                                 }
                                 
                             }
                        }
                         fileCSV.closeFile();
                         System.out.println("Esportazione avvenuta correttamente.");
                        
                    }
                    catch(IOException ex) 
                    {
                        System.out.println("Impossibile accedere al file");
                    }
                    
                    
                    break;

                case 7:
                     try {
                             TextFile fileCSV = new TextFile(nomeFile, 'R'); 
                             String riga = null;
                             do
                             {
                                 String[] datiPilota = riga.split(";");
                                int idScuderia = Integer.parseInt(datiPilota[0]);
                                nome = datiPilota[1];
                                cognome = datiPilota[2];
                                scuderia = datiPilota[3];
                                 vittorie = Integer.parseInt(datiPilota[4]);
                                 LocalDate data = LocalDate.parse(datiPilota[5]);
                                 Pilota nuovoPilota = new Pilota(nome, cognome, scuderia, vittorie, data);
                                 try {
                                     f1.aggiungiPilota(nuovoPilota, vittorie);
                                 } catch (EccezionePosizioneOccupata ex) {
                                     System.out.println("pos occupata");
                                 }
                             }while(riga != null);
                              fileCSV.closeFile(); 
                              System.out.println("Importazione avvenuta correttamente.");
                          } 
                            catch (IOException ex)
                          {
                              System.out.println("Impossibile accedere al file");
                          } catch (NumberFormatException | ArrayIndexOutOfBoundsException | DateTimeParseException ex) {
                              System.out.println("Errore nel formato dei dati nel file CSV");
                          }

                 break;
                 
                case 8: 
                    try {
                        ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream(nomeFileBinario));
                        writer.writeObject(f1); 
                        writer.flush();
                        writer.close();
                        System.out.println("Salvataggio avvenuto correttamente");
                    } catch (FileNotFoundException ex) {
                        System.out.println("File non trovato");
                    } catch (IOException ex) {
                        System.out.println("Impossibile accedere al file");
                    }
                 break;
                 
                 
                case 9:
                    try 
                    {
                       ObjectInputStream reader=new ObjectInputStream(new FileInputStream(nomeFileBinario));
                       f1=(Campionato)reader.readObject();
                       reader.close();
                       System.out.println("Caricamento effettuato corretamente");
                    } 
                    catch (FileNotFoundException ex) 
                    {
                        System.out.println("file non trovato ");
                    } 
                    catch (IOException ex) 
                    {
                        System.out.println("impossbile accedere al file");
                    } 
                    catch (ClassNotFoundException ex) 
                    {
                        System.out.println("impossbile legger il dato memorizzato ");
                    }
                 break;


                default:
                    System.out.println("Scelta non valida, riprova.");
            }
        } while (voceScelta != 0);
    }
}

