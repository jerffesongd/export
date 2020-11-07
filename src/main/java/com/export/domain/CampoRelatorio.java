package com.export.domain;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface CampoRelatorio {

	public EnumTipoCampo tipo() default EnumTipoCampo.SIMPLE;
	
	
}
