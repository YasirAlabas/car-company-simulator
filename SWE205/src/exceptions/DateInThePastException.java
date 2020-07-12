package exceptions;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author YASER
 */
public class DateInThePastException extends Exception {

    public DateInThePastException() {
        super("Date In The Past Exception");
    }
    
    public DateInThePastException(String message){
        super(message);
    }
}
