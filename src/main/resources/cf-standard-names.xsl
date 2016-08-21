<?xml version="1.0"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:variable name="lowercase" select="'abcdefghijklmnopqrstuvwxyz'" />
<xsl:variable name="uppercase" select="'ABCDEFGHIJKLMNOPQRSTUVWXYZ'" />
<xsl:output method="text"/>
<xsl:param name="majorVersion" />
<xsl:template match="/">package com.axiomalaska.cf4j;

import java.util.Collection;
import java.util.ArrayList;

/**
 * CF Standard Names, version <xsl:value-of select="$majorVersion"/>. 
 * See &lt;a href="http://cfconventions.org/standard-names.html"&gt;http://cfconventions.org/standard-names.html&lt;/a&gt;.
 */
public class CFStandardNames {
    private static Collection&lt;CFStandardName&gt; allNames = new ArrayList&lt;CFStandardName&gt;();
    <xsl:for-each select="standard_name_table/entry">
    <xsl:choose>
      <xsl:when test="description != ''">
    /** <xsl:value-of select="translate( description, '&quot;', '')" /> */</xsl:when>
    </xsl:choose>
    public static final CFStandardName <xsl:value-of select="translate( translate( @id, ' ', '' ), $lowercase, $uppercase )"/> = createCFStandardName(
         "<xsl:value-of select="@id"/>"
        ,<xsl:choose>
           <xsl:when test="canonical_units != ''">"<xsl:value-of select="canonical_units" />"</xsl:when>
           <xsl:otherwise>null </xsl:otherwise>
         </xsl:choose>
        ,<xsl:choose>
           <xsl:when test="description != ''">"<xsl:value-of select="translate( description, '&quot;&#10;', '')" />"</xsl:when>
           <xsl:otherwise>null</xsl:otherwise>
         </xsl:choose>
        ,<xsl:choose>
           <xsl:when test="grib != ''">"<xsl:value-of select="grib" />"</xsl:when>
           <xsl:otherwise>null</xsl:otherwise>
         </xsl:choose>
        ,<xsl:choose>
           <xsl:when test="amip != ''">"<xsl:value-of select="amip" />"</xsl:when>
           <xsl:otherwise>null</xsl:otherwise>
         </xsl:choose>
    );
    </xsl:for-each>

    private static CFStandardName createCFStandardName( String name, String canonicalUnits,
        String description, String grib, String amip ){
        CFStandardName cfName = new CFStandardName( name, canonicalUnits, description, grib, amip );
        allNames.add( cfName ); 
        return cfName;
    }

    public static Collection&lt;CFStandardName&gt; getAllNames(){
        return allNames;
    }
}</xsl:template>
</xsl:stylesheet>