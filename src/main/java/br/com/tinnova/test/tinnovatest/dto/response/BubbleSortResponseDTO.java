package br.com.tinnova.test.tinnovatest.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BubbleSortResponseDTO implements Serializable{

    /**
     *
     */
    private static final long serialVersionUID = 4134713454212441092L;

    @JsonProperty("OrderedVector")
    private Integer[] responseValue;
    
}
