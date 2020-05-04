package com.nt.aspect;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.aop.ThrowsAdvice;

public class CommonExceptionLogger implements ThrowsAdvice {

	public void afterThrowing(Method method, Object args[], Object target, IllegalArgumentException ilg) {
		System.out.println("Exception is raise in " + target.getClass() + " in Method " + method.getName() + " with Rrgument "
				+ Arrays.toString(args));
		
	}

}
