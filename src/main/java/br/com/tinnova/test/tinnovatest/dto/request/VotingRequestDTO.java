package br.com.tinnova.test.tinnovatest.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class VotingRequestDTO implements Serializable{
    
    /**
     *
     */
    private static final long serialVersionUID = -7773093458565047734L;

    private int totalVotes;
	private int validVotes;
	private int blankVotes;
	private int nullVotes;
}
