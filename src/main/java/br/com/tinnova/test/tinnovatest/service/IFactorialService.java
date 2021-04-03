package br.com.tinnova.test.tinnovatest.service;

import br.com.tinnova.test.tinnovatest.dto.response.FactorialResponseDTO;

public interface IFactorialService {

    public FactorialResponseDTO solveFactorial(int value);
    
}
