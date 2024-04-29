/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.progettone;

import java.time.LocalDate;

/**
 *
 * @author Studente
 */
public class Pilota
{
    private long idScuderia;
    private String nome;
    private String cognome;
    private String scuderia;
    private int vittorie;
    private static long nextCodice=1;
    private LocalDate data;

    public Pilota(String nome, String cognome, String scuderia, LocalDate data) {
        idScuderia=nextCodice;
        this.nome = nome;
        this.cognome = cognome;
        this.scuderia = scuderia;
        this.data = data;
        this.vittorie=vittorie;
        nextCodice++;
    }
    
    public Pilota(Pilota pilota)
    {
        this.nome=pilota.getNome();
        this.cognome=pilota.getCognome();
        this.scuderia=pilota.getScuderia();
    }

    public int getVittorie() {
        return vittorie;
    }

    public void setVittorie(int vittorie) {
        this.vittorie = vittorie;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getScuderia() {
        return scuderia;
    }

    public void setScuderia(String scuderia) {
        this.scuderia = scuderia;
    }

    public int getIdscuderia() {
        return (int) idScuderia;
    }

    @Override
    public String toString() {
        return "Pilota{" + "idScuderia=" + idScuderia + ", nome=" + nome + ", cognome=" + cognome + ", scuderia=" + scuderia + ", vittorie=" + vittorie + ", data=" + data + '}';
    }

   
    
    

   

    
}
