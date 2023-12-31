package com.cbfacademy.apiassessment.constants;

import java.util.Arrays;
import java.util.List;

public class Const {
    public static final String JSON_REPOSITORY = "src/main/resources/jsonFiles/clientDtoRepo.json";

    public static final String TRADE_JSON_REPOSITORY = "src/main/resources/jsonFiles/clientTradeDetailsRepo.json";

    public static final String LEGAL_JSON_REPOSITORY = "src/main/resources/jsonFiles/clientLegalDetailsRepo.json";

    public static final String INTERNAL_CONTACT_JSON_REPOSITORY = "src/main/resources/jsonFiles/clientInternalContactRepo.json";

    public static final List<String> CLIENT_DTO_CSV_DATA_FILES_LIST = Arrays.asList("src/main/resources/csvFiles/clientAddress.csv", "src/main/resources/csvFiles/clientDetails.csv");

    public static final List<String> CLIENT_TRADE_DETAILS_CSV_DATA_FILES_LIST = Arrays.asList("src/main/resources/csvFiles/clientDetails.csv", "src/main/resources/csvFiles/tradeDetails.csv");

    public static final List<String> CLIENT_INTERNAL_CONTACT_CSV_DATA_FILES_LIST = Arrays.asList("src/main/resources/csvFiles/clientDetails.csv", "src/main/resources/csvFiles/employeeDetails.csv");

    public static final List<String> CLIENT_LEGAL_DETAILS_CSV_DATA_FILES_LIST = Arrays.asList("src/main/resources/csvFiles/clientDetails.csv", "src/main/resources/csvFiles/legalDetails.csv");
}
