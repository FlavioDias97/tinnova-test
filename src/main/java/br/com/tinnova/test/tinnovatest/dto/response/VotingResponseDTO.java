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
public class VotingResponseDTO implements Serializable{

    /**
     *
     */
    private static final long serialVersionUID = -2106591142465868974L;

    @JsonProperty("valid_votes_percent")
    private double validVotesPercent;

    @JsonProperty("blank_votes_percent")
    private double blankVotesPercent;

    @JsonProperty("null_votes_percent")
    private double nullVotesPercent;
    
}