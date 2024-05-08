/*
 * Questa classe rappresenta un pilota di Formula 1.
 */
package com.mycompany.progettone;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * La classe Pilota rappresenta un pilota di Formula 1.
 */
public class Pilota implements Serializable{
    private static long nextCodice = 1;
    private long idScuderia; // Identificatore univoco della scuderia del pilota
    private String nome; // Nome del pilota
    private String cognome; // Cognome del pilota
    private String scuderia; // Scuderia a cui il pilota appartiene
    private int vittorie; // Numero di vittorie del pilota
    private LocalDate data; // Data di nascita o data di inizio carriera del pilota

    /**
     * Costruttore della classe Pilota.
     * @param nome Il nome del pilota.
     * @param cognome Il cognome del pilota.
     * @param scuderia La scuderia a cui il pilota appartiene.
     * @param vittorie Il numero di vittorie del pilota.
     * @param data La data di nascita o di inizio carriera del pilota.
     */
    public Pilota(String nome, String cognome, String scuderia,int vittorie, LocalDate data) {
        this.idScuderia = nextCodice++;
        this.nome = nome;
        this.cognome = cognome;
        this.scuderia = scuderia;
        this.data = data;
    }

    /**
     * Restituisce l'identificatore della scuderia del pilota.
     * @return L'identificatore della scuderia del pilota.
     */
    public long getIdScuderia() {
        return idScuderia;
    }

    /**
     * Restituisce il nome del pilota.
     * @return Il nome del pilota.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Imposta il nome del pilota.
     * @param nome Il nome del pilota da impostare.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Restituisce il cognome del pilota.
     * @return Il cognome del pilota.
     */
    public String getCognome() {
        return cognome;
    }

    /**
     * Imposta il cognome del pilota.
     * @param cognome Il cognome del pilota da impostare.
     */
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    /**
     * Restituisce la scuderia del pilota.
     * @return La scuderia del pilota.
     */
    public String getScuderia() {
        return scuderia;
    }

    /**
     * Imposta la scuderia del pilota.
     * @param scuderia La scuderia del pilota da impostare.
     */
    public void setScuderia(String scuderia) {
        this.scuderia = scuderia;
    }

    /**
     * Restituisce il numero di vittorie del pilota.
     * @return Il numero di vittorie del pilota.
     */
    public int getVittorie() {
        return vittorie;
    }

    /**
     * Imposta il numero di vittorie del pilota.
     * @param vittorie Il numero di vittorie del pilota da impostare.
     */
    public void setVittorie(int vittorie) {
        this.vittorie = vittorie;
    }

    /**
     * Restituisce la data di nascita o di inizio carriera del pilota.
     * @return La data di nascita o di inizio carriera del pilota.
     */
    public LocalDate getData() {
        return data;
    }

    /**
     * Imposta la data di nascita o di inizio carriera del pilota.
     * @param data La data di nascita o di inizio carriera del pilota da impostare.
     */
    public void setData(LocalDate data) {
        this.data = data;
    }

    /**
     * Restituisce una stringa che rappresenta il pilota.
     * @return Una stringa che rappresenta il pilota.
     */
    @Override
    public String toString() {
        return "Pilota{" +"idScuderia=" + idScuderia + ", nome='" + nome + '\'' + ", cognome='" + cognome + '\'' + ", scuderia='" + scuderia + '\'' + ", vittorie=" + vittorie + ", data=" + data + '}';
    }
}


    