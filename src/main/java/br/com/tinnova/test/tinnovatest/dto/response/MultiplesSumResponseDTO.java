package br.com.tinnova.test.tinnovatest.dto.response;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonProperty;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MultiplesSumResponseDTO implements Serializable{


    private static final long serialVersionUID = 2633620170244799066L;

    @JsonProperty("DivisionResult")
    private int divisionSolved;
    
}
