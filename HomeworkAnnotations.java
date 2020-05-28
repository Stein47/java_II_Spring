package com.cis143.m05.m05_student_code.student.homework.annotations1;

public class HomeworkAnnotations implements IHomeworkAnnotation{

	@Deprecated
	@Override
    public String sayHello() {
		System.out.println("Hello");
        return "Hello again";
    }

	@Deprecated
	@Override
    public String sayGoodBye() {
		System.out.println("Goodbye");
        return "Goodbye again";
    }
}
