package com.cosmosDBPOC.POCCosmosdbSpringApplication.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerCrudResponse {
    private String statusCode;
    private String message;
}
