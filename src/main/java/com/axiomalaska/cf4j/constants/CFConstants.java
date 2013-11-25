package com.axiomalaska.cf4j.constants;

public class CFConstants {
    //common attribute names
    /**
     * Global:
     * RECOMMENDED - The input data sources regardless of the method of production method used.
     * 
     * Variables:
     * RECOMMENDED - The method of production of the original data
     */
    public static final String SOURCE = "source";
    
    /**
     * RECOMMENDED - Published or web-based references that describe the data or methods used to produce it.
     */
    public static final String REFERENCES = "references";    

    /**
     * RECOMMENDED - Add useful, additional information here.
     */
    public static final String COMMENT = "comment";
    
    //global attribute names and values
    public static final String CONVENTIONS = "Conventions";
    public static final String CF_1_6 = "CF-1.6";

    public static final String FEATURE_TYPE = "featureType";    

    
    //variable attributes
    public static final String LAT = "lat";
    public static final String LON = "lon";    
    public static final String Z = "z";
    
    /**
     * RECOMMENDED
     */
    public static final String CF_ROLE = "CF_ROLE";
    //point_id is not a CF standard, just a consistent filler value
    public static final String CF_ROLE_POINT_ID = "point_id";
    public static final String CF_ROLE_TIMESERIES_ID = "timeseries_id";
    public static final String CF_ROLE_PROFILE_ID = "profile_id";
    public static final String CF_ROLE_TRAJECTORY_ID = "trajectory_id";
    
    /**
     * RECOMMENDED -Provide a descriptive, long name for this variable.
     */
    public static final String LONG_NAME = "long_name";
    
    /**
     * REQUIRED - CF standard name for variable
     */
    public static final String STANDARD_NAME = "standard_name";

    /**
     * REQUIRED - Use approved CF convention with approved UDUNITS.
     */    
    public static final String UNITS = "units";
    public static final String UNITS_TIME = "seconds since 1970-01-01 00:00:00Z";
    public static final String UNITS_DEGREES_NORTH = "degrees_north";
    public static final String UNITS_DEGREES_EAST = "degrees_east";    
    public static final String UNITS_METERS = "m";

    /**
     * REQUIRED - for coordinate variables.
     */
    public static final String AXIS = "axis";
    //values
    public static final String AXIS_T = "T";
    public static final String AXIS_X = "X";
    public static final String AXIS_Y = "Y";
    public static final String AXIS_Z = "Z";

    /**
     * REQUIRED - If variable is z axis
     */
    public static final String POSITIVE = "positive";
    //values
    public static final String POSITIVE_UP = "up";
    public static final String POSITIVE_DOWN = "down";

    /**
     * RECOMMENDED - Replace with correct value.
     */
    public static final String VALID_MIN = "valid_min";

    /**
     * RECOMMENDED - Replace with correct value.
     */    
    public static final String VALID_MAX = "valid_max";    
    
    /**
     * REQUIRED - if there could be missing values in the data.
     */
    public static final String FILL_VALUE = "_FillValue";

    /**
     * REQUIRED - IF the calendar is not default calendar, which is "gregorian".
     */
    public static final String CALENDAR = "calendar";

    /**
     * RECOMMENDED - Identify the variable name(s) of the flag(s) and other ancillary variables relevant to this variable.
     * Use a space-separated list.
     */
    public static final String ANCILLARY_VARIABLES = "ancillary_variables";
    
    /**
     * REQUIRED if the data uses a scale_factor other than 1.The data type should be the data type of the variable.
     */
    public static final String SCALE_FACTOR = "scale_factor";
    
    /**
     * REQUIRED if the data uses an add_offset other than 0. The data type should be the data type of the variable.
     */
    public static final String ADD_OFFSET = "add_offset";

    /**
     * REQUIRED - Include the auxiliary coordinate variables and optionally coordinate variables in the list.
     * The order itself does not matter. Also, note that whenever any auxiliary coordinate variable contains
     * a missing value, all other coordinate, auxiliary coordinate and data values corresponding to that element
     * should also contain missing values.
     * 
     * Ex: "time lat lon z"
     */
    public static final String COORDINATES = "coordinates";

    /**
     * RECOMMENDED - It is highly recommended that the data provider put the data in a well known geographic coordinate
     * system and provide the details of the coordinate system.
     */
    public static final String GRID_MAPPING = "grid_mapping";

    /**
     * RECOMMENDED - Use the coordinate variables to define the cell values (ex., "time:point lon:point lat:point z:point").
     */
    public static final String CELL_METHODS = "cell_methods";
    
    //flag variable attributes
    /**
     * REQUIRED    - Provide a comma-separated list of flag values that map to the flag_masks/flag_values.
     */
    public static final String FLAG_MEANINGS = "flag_meanings";
    
    //boolean flag variable attributes
    /**
     * REQUIRED    - Provide a comma-separated list describeing the binary condition of the flags.
     */
    public static final String FLAG_MASKS = "flag_masks";
        
    //enumerated flag variable attributes
    /**
     * REQUIRED    - Provide a comma-separated list of flag values that map to the flag_meanings.
     */
    public static final String FLAG_VALUES = "flag_values";

    //platform variable attributes
    /**
     * RECOMMENDED - This attribute identifies the call sign of the platform.
     */
    public static final String CALL_SIGN = "call_sign";

    /**
     * RECOMMENDED - This attribute identifies the ICES code of the platform.
     * Look at http://www.ices.dk/datacentre/requests/Login.aspx to find if ICES codes are available.
     */
    public static final String ICES_CODE = "ices_code";

    /**
     *  RECOMMENDED - This attribute identifies the wmo code of the platform.
     *  Information on getting WMO codes is available at http://www.wmo.int/pages/prog/amp/mmop/wmo-number-rules.html
     */
    public static final String WMO_CODE = "wmo_code";

    /**
     * RECOMMENDED - This attribute identifies the International Maritime Organization (IMO) number assigned by Lloyd's register.
     */
    public static final String IMO_CODE = "imo_code";
    
    //crs attributes
    /**
     * RECOMMENDED
     */
    public static final String GRID_MAPPING_NAME = "grid_mapping_name";
    public static final String GRID_MAPPING_NAME_WGS84 = "latitude_longitude";

    /**
     * RECOMMENDED - European Petroleum Survey Group code for the grid mapping name.
     */
    public static final String EPSG_CODE = "epsg_code";
    public static final String EPSG_CODE_WGS84 = "EPSG:4326";

    /**
     * RECOMMENDED
     */
    public static final String SEMI_MAJOR_AXIS = "semi_major_axis";
    public static final double SEMI_MAJOR_AXIS_WGS84 = 6378137.0;
    
    /**
     * RECOMMENDED
     */
    public static final String INVERSE_FLATTENING = "inverse_flattening";
    public static final double INVERSE_FLATTENING_WGS84 = 298.257223563;
}
