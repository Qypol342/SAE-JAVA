/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sae.exception;

/**
 *
 * @author Loan
 */
public class TypeNotSupportedException extends RuntimeException{
    private String message = "Type not supported";
    public TypeNotSupportedException(){
        super();
    }
    @Override
    public String toString(){
        return message;
    }
    
}