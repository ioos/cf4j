cf4j - CF Standard Names for Java
=================================

This is a simple Java library providing constants for the [NetCDF Climate and
Forecast Metadata Convention standard names](http://cf-pcmdi.llnl.gov/documents/cf-standard-names/).

The artifact's major version number is consistent with the version number of the CF names it contains.

The main class (CFStandardNames) is generated from the standard names xml document
using xslt. To update, replace src/main/xml/cf-standard-name-table.xml with a 
fresh version and run mvn clean install.

[Standard Maven project documentation is available](http://axiomalaska.github.com/cf4j/), including [JavaDocs](http://axiomalaska.github.com/cf4j/apidocs/)
(see especially the [CF Standard Names JavaDoc](http://axiomalaska.github.com/cf4j/apidocs/com/axiomalaska/cf4j/CFStandardNames.html)). 

To use in a Maven project
-------------------------

Declare a dependency on cf4j:

    <dependencies> 
      <dependency>
        <groupId>com.axiomalaska</groupId>
        <artifactId>cf4j</artifactId>
        <version>20.0</version>
      </dependency>
    </dependencies>       

Then use in your code:

    public static void main( String[] args ){
        for( CFStandardName name : CFStandardNames.getAllNames() ){
            System.out.println( name.getName() );
        }
        
        CFStandardName sst = CFStandardNames.SEA_SURFACE_TEMPERATURE;
        System.out.println( sst.getName() + "'s canonical unit is " + sst.getCanonicalUnits() );        
    } 