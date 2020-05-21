package com.cis143.m05.m05_student_code.student.lab.trycatch;

import javax.management.BadStringOperationException;

public class ThrowsException {

    public void throwAnExceptionForMe() throws BadStringOperationException, InterruptedException, MyException {
    	try {
    		this.thowMultipleExceptionsForMe(); //Checked Exception
    		
    } catch (BadStringOperationException | InterruptedException e) {
    	
    	throw new MyException ("MyException", e);
    }
    }

    private void thowMultipleExceptionsForMe() throws BadStringOperationException, InterruptedException {
        if ( 1 == 1 ) {
            throw new InterruptedException("Another exception that you will need to take care of.");
        }
        throw new BadStringOperationException("Simple exception that you will need to take care of");
    }
}
