/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.progettone;

import com.mycompany.progettone.newpackage.ConsoleInput;
import com.mycompany.progettone.newpackage.Menu;
import com.mycompany.progettone.Pilota;


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
    int vittorie;
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
        vociMenu[6]="\t--> Mostra piloti in ordine di vittorie";
        vociMenu[7]="\t--> Esporta i volumi su file CSV";
        vociMenu[8]="\t--> Importa i volumi da file CSV";
        
         menu=new Menu(vociMenu);
         
          do
        {
            System.out.println("Menu:");
            voceScelta=menu.sceltaMenu();
            switch (voceScelta) 
            {
                case 0: 
                    System.out.println("Arrivederci!");    
                    break;
                case 1:
                    System.out.println(f1.toString());
                    break;
                case 2:
                    try
                    {
                        System.out.println("Nome --> ");
                        nome=tastiera.readString();
                        System.out.println("cognome--> ");
                        cognome=tastiera.readString();
                        do
                        {
                            try
                            {
                                System.out.println("vittorie--> ");
                                vittorie=tastiera.readInt();
                                break; 
                            }
                            catch (NumberFormatException e)
                            {
                                System.out.println("Errore! Devi inserire un numero!");
                            }  
                        }while(true); 
                        
                        do
                        {
                            try
                            {
                                    System.out.println("Posizione (0..14) --> ");
                                    posizione=tastiera.readInt();
                                break; //se input ok, esci dal ciclo
                            }
                            catch (NumberFormatException e)
                            {
                                System.out.println("Errore! Devi inserire un numero!");
                            }  
                        }while(true); 
                        
                        try 
                        {
                            s1.setLibro(new Libro(titolo,autore,numeroPagine), ripiano, posizione);
                            System.out.println("Volume aggiunto correttamente");
                        } 
                        catch (EccezioneRipianoNonValido ex) 
                        {
                             System.out.println("Ripiano inesistente");
                        } 
                        catch (EccezionePosizioneNonValida ex) 
                        {
                              System.out.println("Posizione inesistente");
                        } 
                        catch (EccezionePosizioneOccupata ex)
                        {
                            System.out.println("Posizione già occupata");
                        }
                    }
                    catch(IOException e)
                    {
                        System.out.println("Impossibile leggere da tastiera!");
                    }
                    
                    break;

                case 3: //visualizza volume
                    try 
                    {
                        do
                        {
                            try
                            {
                                System.out.println("Ripiano (0..4) --> ");
                                ripiano=tastiera.readInt();
                                break; //se input ok, esci dal ciclo
                            }
                            catch (NumberFormatException e)
                            {
                                System.out.println("Errore! Devi inserire un numero!");
                            }  
                        }while(true); 
                        
                        do
                        {
                            try
                            {
                                    System.out.println("Posizione (0..14) --> ");
                                    posizione=tastiera.readInt();
                                break; //se input ok, esci dal ciclo
                            }
                            catch (NumberFormatException e)
                            {
                                System.out.println("Errore! Devi inserire un numero!");
                            }  
                        }while(true);  
                        lib=s1.getLibro(ripiano, posizione);
                        System.out.println("Libro cercato: "+lib.toString());
                    } 
                    catch (EccezioneRipianoNonValido ex) 
                    {
                         System.out.println("Ripiano inesistente");
                    } 
                    catch (EccezionePosizioneNonValida ex) 
                    {
                          System.out.println("Posizione inesistente");
                    } 
                    catch (EccezionePosizioneVuota ex) 
                    {
                        System.out.println("Libro non trovato, riprovare");
                    }
                    catch (IOException e)
                    {
                        System.out.println("Impossibile leggere da tastiera, valore inesistente");
                    }
                    break;

                case 4: //elimina volume

                    try 
                    {
                        do
                        {
                            try
                            {
                                System.out.println("Ripiano (0..4) --> ");
                                ripiano=tastiera.readInt();
                                break; //se input ok, esci dal ciclo
                            }
                            catch (NumberFormatException e)
                            {
                                System.out.println("Errore! Devi inserire un numero, non altre lettere!");
                            }  
                        }while(true); 
                        
                        do
                        {
                            try
                            {
                                    System.out.println("Posizione (0..14) --> ");
                                    posizione=tastiera.readInt();
                                break; //se input ok, esci dal ciclo
                            }
                            catch (NumberFormatException e)
                            {
                                System.out.println("Errore! Devi inserire un numero, non lettera!");
                            }  
                        }while(true);  
                        s1.rimuoviLibro(ripiano, posizione);
                        System.out.println("Volume rimosso correttamente");
                    } 
                     catch (EccezioneRipianoNonValido ex) 
                    {
                         System.out.println("Ripiano inesistente");
                    } 
                    catch (EccezionePosizioneNonValida ex) 
                    {
                          System.out.println("Posizione inesistente");
                    } 
                    catch (EccezionePosizioneVuota ex) 
                    {
                          System.out.println("Posizione già vuota. Nessun libro è stato rimosso.");
                    }
                    catch (IOException e)
                    {
                        System.out.println("Impossibile acquisire da tastiera");
                    }                 
                    break;

                case 5://mostra libri autore
                    
                    try
                    {
                        System.out.println("Autore --> ");
                        autore=tastiera.readString();
                        elencoTitoliAutore=s1.elencoTitoliAutore(autore);
                        if(elencoTitoliAutore==null)
                            System.out.println("Nessun libro presente");
                        else
                        {
                            for(int i=0;i<elencoTitoliAutore.length;i++)
                            {
                                System.out.println(elencoTitoliAutore[i]);
                            }
                        }   
                    }
                    catch (IOException e)
                    {
                        System.out.println("Impossibile leggere da tastiera1");
                    }
                    
                    break;
                case 6://mostra elenco libri ordinati
                    libriPresenti=s1.elencoLibriPresenti();
                    libriPresenti=Ordinatore.selectionSortCrescenteLibri(libriPresenti);
                    for(int i=0;i<libriPresenti.length;i++)
                    {
                        System.out.println(libriPresenti[i].toString());
                    }
                    break;
                case 7: //esporta su file CSV
                    try 
                    {
                        s1.esportaCSV(nomeFile);
                        System.out.println("Esportazione avvenuta con successo!");
                    } 
                    catch (IOException ex) 
                    {
                        System.out.println("Errore di scrittura, impossibile accedere al file");
                    } 
                    catch (FileException ex) 
                    {
                        System.out.println("Errore file aperto in lettura!");
                    }
                    break;

                    
            }  
        }while(voceScelta!=0);  
                        
                                                                          
        
    }
}
