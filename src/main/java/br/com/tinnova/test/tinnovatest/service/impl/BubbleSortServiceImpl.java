package br.com.tinnova.test.tinnovatest.service.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.tinnova.test.tinnovatest.dto.response.BubbleSortResponseDTO;
import br.com.tinnova.test.tinnovatest.service.IBubbleSortService;

@Service
public class BubbleSortServiceImpl implements IBubbleSortService{
	int aux = 0;

    public BubbleSortResponseDTO doBubbleSort(Integer[] value) {       
        

        for(int idx=0; idx <  value.length; idx++){
            for(int sidx=0; sidx < ( value.length -1); sidx++){
                if(value[sidx] > value[sidx + 1]) { aux = value[sidx]; value[sidx] = value[sidx + 1]; value[sidx + 1] = aux;}
            }
        }

        return BubbleSortResponseDTO.builder().responseValue(value).build();
    }
    
}
