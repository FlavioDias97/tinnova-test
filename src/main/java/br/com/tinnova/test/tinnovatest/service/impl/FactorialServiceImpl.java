package br.com.tinnova.test.tinnovatest.service.impl;

import br.com.tinnova.test.tinnovatest.dto.response.FactorialResponseDTO;
import br.com.tinnova.test.tinnovatest.service.IFactorialService;

public class FactorialServiceImpl implements IFactorialService{

    public FactorialResponseDTO solveFactorial(int value) {
        return FactorialResponseDTO.builder()
            .factorial(
                value == 0 ? 1 : calcFactorial(value)
            ).build();                
    }

    public int calcFactorial(int value){
        int result = value;
        while(value > 1){ result = result * (value -1);
            value --; 
        }
        return result;
    }


    
}
