package com.axiomalaska.cf4j;

import static org.junit.Assert.*;

import org.junit.Test;

public class CFStandardNameUtilTest {
	private static final String SEA_WATER_MASS = "sea_water_mass";
	private static final String BAD_PARAMETER = "not_a_real_parameter";
	
	@Test
	public void testGetCFStandardName(){
		CFStandardName seaWaterMass = CFStandardNameUtil.getCFStandardName( SEA_WATER_MASS );
		assertNotNull( seaWaterMass );
		assertEquals("kg", seaWaterMass.getCanonicalUnits() );
		assertNull( CFStandardNameUtil.getCFStandardName( BAD_PARAMETER ) );
	}
}