package com.axiomalaska.cf4j;

/**
 * CF Feature Types, version 1.6.
 * See <a href="http://cfconventions.org/cf-conventions/v1.6.0/cf-conventions.html">http://cfconventions.org/cf-conventions/v1.6.0/cf-conventions.html</a>.
 * @deprecated Use netcdf-java's ucar.nc2.constants.CF$FeatureType instead
 */
@Deprecated
public class CFFeatureTypes {
    public static final CFFeatureType POINT = new CFFeatureType("point");
    public static final CFFeatureType TIME_SERIES = new CFFeatureType("timeSeries");
    public static final CFFeatureType TRAJECTORY = new CFFeatureType("trajectory");
    public static final CFFeatureType PROFILE = new CFFeatureType("profile");
    public static final CFFeatureType TIME_SERIES_PROFILE = new CFFeatureType("timeSeriesProfile");
    public static final CFFeatureType TRAJECTORY_PROFILE = new CFFeatureType("trajectoryProfile");
}
