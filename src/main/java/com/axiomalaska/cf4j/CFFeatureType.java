package com.axiomalaska.cf4j;

/**
 * Simple class to hold info for CF Feature types.
 * See <a href="http://cf-pcmdi.llnl.gov/documents/cf-conventions/1.6/cf-conventions.html">http://cf-pcmdi.llnl.gov/documents/cf-conventions/1.6/cf-conventions.html</a>.  
 */
public class CFFeatureType implements Comparable<CFFeatureType> {
    private String name;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CFFeatureType(String name) {
        super();
        this.name = name;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        CFFeatureType other = (CFFeatureType) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    public int compareTo(CFFeatureType o) {
        return this.name.compareTo( o.getName() );
    }
}