package br.com.fiap.anotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Define at� onde a anota��o estar� presente (C�digo fonte, bytecode, execu��o)
@Retention(RetentionPolicy.RUNTIME)
//Restringe onde a anota��o pode ser utilizada (Fields - atributos, Method - m�todos)
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface Coluna {

	String nome();
	int tamanho() default 0;
	boolean obrigatorio() default false;
	
}