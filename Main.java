package com.cis143.m05.m05_student_code.student.lab.trycatch;

import javax.management.BadStringOperationException;

public class Main {

    public static void main (String[] a) throws BadStringOperationException, InterruptedException {
        Main main = new Main();
        main.testNeedsToBeModified();;
    }

    public void testNeedsToBeModified() throws BadStringOperationException, InterruptedException {
        try{
        	new ThrowsException().throwAnExceptionForMe();
        	
        } catch (MyException e) {
        	
        	System.out.println("Exception Caught.");
        	throw new RuntimeException(); 
        	
        }
    }
}
