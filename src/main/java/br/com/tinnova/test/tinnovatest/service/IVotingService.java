package br.com.tinnova.test.tinnovatest.service;

import br.com.tinnova.test.tinnovatest.dto.request.VotingRequestDTO;
import br.com.tinnova.test.tinnovatest.dto.response.VotingResponseDTO;

public interface IVotingService {

    public double calcPercent(int value1, int value2);
    public VotingResponseDTO calculateWinnerOfVotating(VotingRequestDTO request);
    
}
