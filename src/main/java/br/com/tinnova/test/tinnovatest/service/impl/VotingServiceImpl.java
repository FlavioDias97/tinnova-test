package br.com.tinnova.test.tinnovatest.service.impl;

import br.com.tinnova.test.tinnovatest.dto.request.VotingRequestDTO;
import br.com.tinnova.test.tinnovatest.dto.response.VotingResponseDTO;
import br.com.tinnova.test.tinnovatest.service.IVotingService;

public class VotingServiceImpl implements IVotingService{

    public VotingResponseDTO calculateWinnerOfVotating(VotingRequestDTO request) {
        return VotingResponseDTO
            .builder()
            .blankVotesPercent(calcPercent(request.getBlankVotes(), request.getTotalVotes()))
            .nullVotesPercent(calcPercent(request.getNullVotes(), request.getTotalVotes()))
            .validVotesPercent(calcPercent(request.getValidVotes(), request.getTotalVotes()))
            .build();
    }

    public double calcPercent(int v1, int v2){
        return (Double.valueOf(v1 / 100.00) * v2);

    }
    
}
