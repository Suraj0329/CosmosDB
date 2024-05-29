package com.cosmosDBPOC.POCCosmosdbSpringApplication.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Address {
    @JsonProperty("AddressLine1")
    private String addressLine1;


}
