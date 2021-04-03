package br.com.tinnova.test.tinnovatest.service.impl;

import org.springframework.stereotype.Service;

import br.com.tinnova.test.tinnovatest.dto.request.VotingRequestDTO;
import br.com.tinnova.test.tinnovatest.dto.response.VotingResponseDTO;
import br.com.tinnova.test.tinnovatest.service.IVotingService;

@Service
public class VotingServiceImpl implements IVotingService{

    public VotingResponseDTO calculateWinnerOfVotating(VotingRequestDTO request) {
        return VotingResponseDTO
            .builder()
            .blankVotesPercent(calcPercent(request.getBlankVotes(), request.getTotalVotes()))
            .nullVotesPercent(calcPercent(request.getNullVotes(), request.getTotalVotes()))
            .validVotesPercent(calcPercent(request.getValidVotes(), request.getTotalVotes()))
            .build();
    }

    public Integer calcPercent(double v1, double v2){    	
        return (int) (Double.valueOf(v1 / v2 ) * (double)100);
    }
    
}
