package com.axiomalaska.cf4j;

import java.lang.reflect.Field;

public class CFStandardNameUtil {
	public static CFStandardName getCFStandardName( String name ){
		try{
			Field field = CFStandardNames.class.getField( name.toUpperCase() );
			if( field == null ){
				return null;
			}
			return (CFStandardName) field.get(null);
		} catch( Exception e ){
			//that's ok
		}
		return null;
	}
}
