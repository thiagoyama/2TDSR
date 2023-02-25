package br.com.fiap.anotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Define até onde a anotação estará presente (Código fonte, bytecode, execução)
@Retention(RetentionPolicy.RUNTIME)
//Restringe onde a anotação pode ser utilizada (Fields - atributos, Method - métodos)
@Target({ElementType.FIELD, ElementType.METHOD})
public @interface Coluna {

	String nome();
	int tamanho() default 0;
	boolean obrigatorio() default false;
	
}