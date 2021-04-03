package br.com.tinnova.test.tinnovatest.service.impl;

import org.springframework.stereotype.Service;

import br.com.tinnova.test.tinnovatest.dto.response.MultiplesSumResponseDTO;
import br.com.tinnova.test.tinnovatest.service.IMultiplesSumService;

@Service
public class MultiplesSumServiceImpl implements IMultiplesSumService{
    
    public MultiplesSumResponseDTO solveDivision(int value) {
        int result = 0;

        for(int idx = 0; idx < value; idx++){
            if((idx % 3 == 0) || (idx % 5 == 0)) { result += idx; };
        }

        return MultiplesSumResponseDTO.builder().divisionSolved(result).build();
    }
    
}
