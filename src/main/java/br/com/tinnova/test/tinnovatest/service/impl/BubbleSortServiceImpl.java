package br.com.tinnova.test.tinnovatest.service.impl;

import org.springframework.http.ResponseEntity;

import br.com.tinnova.test.tinnovatest.dto.response.BubbleSortResponseDTO;
import br.com.tinnova.test.tinnovatest.service.IBubbleSortService;

public class BubbleSortServiceImpl implements IBubbleSortService{

    public BubbleSortResponseDTO doBubbleSort(Integer[] value) {
        int valueLength = value.length;
        int aux = 0;

        for(int idx=0; idx < valueLength; idx++){
            for(int sidx=0; sidx < (valueLength-1); sidx++){
                if(value[sidx] > value[sidx+1]) { aux = value[sidx]; value[sidx] = value[sidx]+1; value[sidx + 1] = aux;}
            }
        }

        return BubbleSortResponseDTO.builder().responseValue(value).build();
    }
    
}
