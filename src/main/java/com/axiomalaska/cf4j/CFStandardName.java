package com.axiomalaska.cf4j;

public class CFStandardName {
    private String name;
    private String canonicalUnits;
    private String description;
    private String grib;
    private String amip;
    
    public CFStandardName(String name, String canonicalUnits,
            String description, String grib, String amip) {
        super();
        this.name = name;
        this.canonicalUnits = canonicalUnits;
        this.description = description;
        this.grib = grib;
        this.amip = amip;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCanonicalUnits() {
        return canonicalUnits;
    }
    public void setCanonicalUnits(String canonicalUnits) {
        this.canonicalUnits = canonicalUnits;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getGrib() {
        return grib;
    }
    public void setGrib(String grib) {
        this.grib = grib;
    }
    public String getAmip() {
        return amip;
    }
    public void setAmip(String amip) {
        this.amip = amip;
    }
}