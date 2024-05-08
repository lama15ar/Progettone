/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.progettone.newpackage;

 /**
     * Costruttore della classe FileException.
     * @param motivo Il motivo dell'eccezione.
     */
public class FileException extends Exception
{
    private String motivoEccezione;
    
     /**
     * Costruttore della classe FileException.
     * @param motivo Il motivo dell'eccezione.
     */
    public FileException(String motivo)
    {
	motivoEccezione=motivo;
    }
     /**
     * Restituisce una stringa rappresentante il motivo dell'eccezione.
     * @return Il motivo dell'eccezione.
     */
    public String toString()
    {
	return motivoEccezione;
    }
}