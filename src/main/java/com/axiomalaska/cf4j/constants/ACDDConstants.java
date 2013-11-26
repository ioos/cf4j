package com.axiomalaska.cf4j.constants;

public class ACDDConstants {
    public static final String POINT = "point";
    public static final String BINNED = "binned";    
    public static final String NONE = "none";
    
    //global attribute names and values
    public static final String METADATA_CONVENTIONS = "Metadata_Conventions";
    public static final String UNIDATA_DATASET_DISCOVERY_1_0 = "Unidata Dataset Discovery v1.0";
    
    public static final String CDM_DATA_TYPE = "cdm_data_type";
    public static final String CDM_DATA_TYPE_POINT = "Point";
    public static final String CDM_DATA_TYPE_STATION = "Station";
    public static final String CDM_DATA_TYPE_PROFILE = "Profile";
    
    /**
     * REQUIRED    - If using CF standard name attribute for variables.
     */
    public static final String STANDARD_NAME_VOCABULARY = "standard_name_vocabulary";
    
    /**
     * RECOMMENDED - Provide a useful title for the data in the file.
     */
    public static final String TITLE = "title";

    /**
     * RECOMMENDED - Provide a useful summary or abstract for the data in the file.
     */
    public static final String SUMMARY = "summary";

    /**
     * RECOMMENDED - Should be a human readable unique identifier for data set.
     */
    public static final String ID = "id";

    /**
     * RECOMMENDED - Backward URL of institution (for example, gov.noaa.nodc).
     */
    public static final String NAMING_AUTHORITY = "naming_authority";
    
    /**
     * RECOMMENDED - Use ISO8601 for date and time.
     */
    public static final String TIME_COVERAGE_START = "time_coverage_start";
    
    /**
     * RECOMMENDED - Use ISO8601 for date and time.
     */
    public static final String TIME_COVERAGE_END = "time_coverage_end";

    /**
     * RECOMMENDED - For example, "point" or "minute averages".
     */
    public static final String TIME_COVERAGE_RESOLUTION = "time_coverage_resolution";

    /**
     *  RECOMMENDED - Replace with correct value.
     */
    public static final String GEOSPATIAL_LAT_MIN = "geospatial_lat_min";

    /**
     *  RECOMMENDED - Replace with correct value.
     */
    public static final String GEOSPATIAL_LAT_MAX = "geospatial_lat_max";

    /**
     * RECOMMENDED - Use UDUNITS compatible units.
     */
    public static final String GEOSPATIAL_LAT_UNITS = "geospatial_lat_units";

    /**
     * RECOMMENDED - For example, "point" or "10 degree grid".
     */
    public static final String GEOSPATIAL_LAT_RESOLUTION = "geospatial_lat_resolution";

    /**
     *  RECOMMENDED - Replace with correct value.
     */
    public static final String GEOSPATIAL_LON_MIN = "geospatial_lon_min";

    /**
     *  RECOMMENDED - Replace with correct value.
     */
    public static final String GEOSPATIAL_LON_MAX = "geospatial_lon_max";

    /**
     * RECOMMENDED - Use UDUNITS compatible units.
     */
    public static final String GEOSPATIAL_LON_UNITS = "geospatial_lon_units";

    /**
     * RECOMMENDED - For example, "point" or "10 degree grid".
     */
    public static final String GEOSPATIAL_LON_RESOLUTION = "geospatial_lon_resolution";

    /**
     * RECOMMENDED - Replace with correct value.
     */
    public static final String GEOSPATIAL_VERTICAL_MIN = "geospatial_vertical_min";

    /**
     * RECOMMENDED - Replace with correct value.
     */
    public static final String GEOSPATIAL_VERTICAL_MAX = "geospatial_vertical_max";

    /**
     * RECOMMENDED - Use UDUNITS compatible units.
     */
    public static final String GEOSPATIAL_VERTICAL_UNITS = "geospatial_vertical_units";

    /**
     * RECOMMENDED - For exapmple, "point" or "1 meter binned".
     */
    public static final String GEOSPATIAL_VERTICAL_RESOLUTION = "geospatial_vertical_resolution";

    /**
     * RECOMMENDED - Use "up" or "down".
     */
    public static final String GEOSPATIAL_VERTICAL_POSITIVE = "geospatial_vertical_positive";

    /**
     * RECOMMENDED - Institution of the person or group that collected the data.
     * An institution attribute can be used for each variable if variables come from more than one institution.
     */
    public static final String INSTITUTION = "institution";

    /**
     * RECOMMENDED - Name of the person who collected the data.
     */
    public static final String CREATOR_NAME = "creator_name";

    /**
     * RECOMMENDED - URL for person who collected the data.
     */
    public static final String CREATOR_URL = "creator_url";

    /**
     * RECOMMENDED - Email address for person who collected the data.
     */
    public static final String CREATOR_EMAIL = "creator_email";

    /**
     * RECOMMENDED - Project the data was collected under.
     */
    public static final String PROJECT = "project";

    /**
     * RECOMMENDED - Provide a description of the processing or quality control level of the data.
     */
    public static final String PROCESSING_LEVEL = "processing_level";

    /**
     * RECOMMENDED - Identifies the controlled keyword vocabulary used to specify the values within
     * the attribute "keywords". e.g. NASA/GCMD Earth Science Keywords. Version 6.0
     */
    public static final String KEYWORDS_VOCABULARY = "keywords_vocabulary";
    
    /**
     * RECOMMENDED - A comma separated list of keywords coming from the keywords_vocabulary.
     */
    public static final String KEYWORDS = "keywords";

    /**
     * RECOMMENDED - Text to use to properly acknowledge use of the data.
     */
    public static final String ACKNOWLEDGEMENT = "acknowledgement";

    /**
     * RECOMMENDED - A comma separated list of contributors to this data set.
     */
    public static final String CONTRIBUTOR_NAME = "contributor_name";

    /**
     * RECOMMENDED - A comma separated list of their roles.
     */
    public static final String CONTRIBUTOR_ROLE = "contributor_role";

    /**
     * RECOMMENDED - Creation date of the netCDF.  Use ISO8601 for date and time.
     */
    public static final String DATE_CREATED = "date_created";

    /**
     * RECOMMENDED - Modification date of the netCDF.  Use ISO8601 for date and time.
     */
    public static final String DATE_MODIFIED = "date_modified";

    /**
     * RECOMMENDED - Publisher of the data
     */
    public static final String PUBLISHER_NAME = "publisher_name";

    /**
     * RECOMMENDED - Email address of the publisher of the data.
     */
    public static final String PUBLISHER_EMAIL = "publisher_email";

    /**
     * RECOMMENDED - A URL for the publisher of the data.
     */
    public static final String PUBLISHER_URL = "publisher_url";

    /**
     * RECOMMENDED - Record changes made to the netCDF.
     */
    public static final String HISTORY = "history";

    /**
     * RECOMMENDED - Describe the restrictions to data access and distribution.
     */
    public static final String LICENSE = "license";
    public static final String LICENSE_FREELY_DISTRIBUTED = "Freely Distributed";

    /**
     * RECOMMENDED - This attribute provides a link to a complete metadata record for
     * this data set or the collection that contains this data set.
     */
    public static final String METADATA_LINK = "metadata_link";
}
