package com.essam.simpleplacepicker.utils;

public interface SimplePlacePicker {

    String PACKAGE_NAME = "com.essam.simpleplacepicker";
    String RECEIVER = PACKAGE_NAME + ".RECEIVER";
    String RESULT_DATA_KEY = PACKAGE_NAME + ".RESULT_DATA_KEY";
    String LOCATION_LAT_EXTRA = PACKAGE_NAME + ".LOCATION_lAT_EXTRA";
    String LOCATION_LNG_EXTRA = PACKAGE_NAME + ".LOCATION_LNG_EXTRA";
    String SELECTED_ADDRESS = PACKAGE_NAME + ".SELECTED_ADDRESS";
    String LANGUAGE = PACKAGE_NAME + ".LANGUAGE" ;

    String API_KEY = PACKAGE_NAME + ".API_KEY";
    String COUNTRY = PACKAGE_NAME + ".COUNTRY";
    String SUPPORTED_AREAS = PACKAGE_NAME + ".SUPPORTED_AREAS";

    int SUCCESS_RESULT = 0;
    int FAILURE_RESULT = 1;
    int SELECT_LOCATION_REQUEST_CODE = 22;
}

