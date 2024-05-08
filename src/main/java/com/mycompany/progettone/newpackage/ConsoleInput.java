/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.progettone.newpackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Studente
 */
public class ConsoleInput 
{
    private InputStreamReader reader;
    private BufferedReader tastiera;
    
     /**
     * Costruttore della classe ConsoleInput.
     * Inizializza il lettore InputStreamReader e il BufferedReader per leggere l'input da console.
     */
    public ConsoleInput()
    {
        reader=new InputStreamReader(System.in);
        tastiera=new BufferedReader(reader);
        
    }
    
    /**
     * Legge una stringa
     * @return
     * @throws IOException errore di input
     * @throws NumberFormatException input inserito non coerente 
     * 
     */
    public String readString() throws IOException, NumberFormatException
    {
        return tastiera.readLine();
    }
     /**
     * Legge un intero inserito dall'utente.
     * @return L'intero letto da console.
     * @throws IOException Eccezione sollevata in caso di errore di input.
     * @throws NumberFormatException Eccezione sollevata se l'input inserito non è un intero valido.
     */
    public int readInt() throws IOException, NumberFormatException
    {
        String s=tastiera.readLine();
        int x=Integer.parseInt(s);
        return x;
    }
    /**
     * Legge un short inserito dall'utente.
     * @return Lo short letto da console.
     * @throws IOException Eccezione sollevata in caso di errore di input.
     * @throws NumberFormatException Eccezione sollevata se l'input inserito non è uno short valido.
     */
    public short readShort() throws IOException, NumberFormatException
    {
        return Short.parseShort(tastiera.readLine());
    }
    /**
     * Legge un char inserito dall'utente.
     * @return Il char letto da console.
     * @throws IOException Eccezione sollevata in caso di errore di input.
     * @throws NumberFormatException Eccezione sollevata se l'input inserito non è un char valido.
     */
    public char readChar() throws IOException, NumberFormatException
    {
        return tastiera.readLine().charAt(0);
    }
    /**
     * Legge un Long inserito dall'utente.
     * @return Il Long letto da console.
     * @throws IOException Eccezione sollevata in caso di errore di input.
     * @throws NumberFormatException Eccezione sollevata se l'input inserito non è un Long valido.
     */
    public Long readLong() throws IOException, NumberFormatException
    {
        return Long.parseLong(tastiera.readLine());
    }
     /**
     * Legge un float inserito dall'utente.
     * @return Il float letto da console.
     * @throws IOException Eccezione sollevata in caso di errore di input.
     * @throws NumberFormatException Eccezione sollevata se l'input inserito non è un float valido.
     */
    public float readFloat() throws IOException, NumberFormatException
    {
        return Float.parseFloat(tastiera.readLine());
    }
     /**
     * Legge un double inserito dall'utente.
     * @return Il double letto da console.
     * @throws IOException Eccezione sollevata in caso di errore di input.
     * @throws NumberFormatException Eccezione sollevata se l'input inserito non è un double valido.
     */
    public double readDouble() throws IOException, NumberFormatException
    {
        return Double.parseDouble(tastiera.readLine());
    }
     /**
     * Legge un Boolean inserito dall'utente.
     * @return Il Boolean letto da console.
     * @throws IOException Eccezione sollevata in caso di errore di input.
     * @throws NumberFormatException Eccezione sollevata se l'input inserito non è un Boolean valido.
     */
    public Boolean readBoolean() throws IOException, NumberFormatException
    {
        return Boolean.parseBoolean(tastiera.readLine());
    }
    /**
     * Legge un byte inserito dall'utente.
     * @return Il byte letto da console.
     * @throws IOException Eccezione sollevata in caso di errore di input.
     * @throws NumberFormatException Eccezione sollevata se l'input inserito non è un byte valido.
     */
    public byte readByte() throws IOException, NumberFormatException
    {
        return Byte.parseByte(tastiera.readLine());
    }

    
    
    
}
