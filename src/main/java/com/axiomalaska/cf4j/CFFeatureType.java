package com.axiomalaska.cf4j;

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

    public int compareTo(CFFeatureType o) {
        return this.name.compareTo( o.getName() );
    }
}