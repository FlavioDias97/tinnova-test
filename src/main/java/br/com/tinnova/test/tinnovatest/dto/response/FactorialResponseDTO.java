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
public class FactorialResponseDTO implements Serializable{

    private static final long serialVersionUID = -8912699060669650490L;

    @JsonProperty("Factorial")
    private int factorial;
    
}
