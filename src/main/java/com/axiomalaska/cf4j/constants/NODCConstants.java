package com.axiomalaska.cf4j.constants;

public class NODCConstants {
    //var names
    public static final String CRS = "crs";
    
    //common attributes
    /**
     * RECOMMENDED - Refers to name of variable containing information on the platform from which this variable was collected.
     * Can be a global attribute or on individual variables. Use NODC or ICES platform table.
     */
    public static final String PLATFORM = "platform";

    /**
     * RECOMMENDED - Refers to name of variable containing information on the instrument from which this variable was collected.
     * Can be a global attribute or on individual variables. Use NODC or ICES instrument table. 
     */
    public static final String INSTRUMENT = "instrument";

    //global attribute names and values    
    public static final String NODC_TEMPLATE_VERSION = "nodc_template_version";
    public static final String NODC_POINT_TEMPLATE_1_0 = "NODC_Point_Template_v1.0";
    public static final String NODC_PROFILE_ORTHOGONAL_TEMPLATE_1_0 = "NODC_NetCDF_Profile_Orthogonal_Template_v1.0";
    public static final String NODC_PROFILE_INCOMPLETE_TEMPLATE_1_0 = "NODC_NetCDF_Profile_Incomplete_Template_v1.0";    
    public static final String NODC_TIMESERIES_ORTHOGONAL_TEMPLATE_1_0 = "NODC_NetCDF_TimeSeries_Orthogonal_Template_v1.0";
    public static final String NODC_TIMESERIES_INCOMPLETE_TEMPLATE_1_0 = "NODC_NetCDF_TimeSeries_Incomplete_Template_v1.0";
    public static final String NODC_TIMESERIESPROFILE_ORTHOGONAL_TEMPLATE_1_0 = "NODC_NetCDF_TimeSeriesProfile_Orthogonal_Template_v1.0";
    public static final String NODC_TIMESERIESPROFILE_INCOMPLETE_TEMPLATE_1_0 = "NODC_NetCDF_TimeSeriesProfile_Incomplete_Template_v1.0";
    
    /**
     * RECOMMENDED - Machine readable unique identifier for each file. A new uuid is created whenever the file is changed.
     */
    public static final String UUID = "uuid";

    /**
     * RECOMMENDED - The names of the sea in which the data were collected. Use NODC sea names table.
     */
    public static final String SEA_NAME = "sea_name";

    //variable attributes
    /**
     * RECOMMENDED - From the NODC variables vocabularly, if standard_name does not exist.
     */
    public static final String NODC_NAME = "nodc_name";
}
