package br.com.tinnova.test.tinnovatest.service;

import org.springframework.http.ResponseEntity;

import br.com.tinnova.test.tinnovatest.dto.response.BubbleSortResponseDTO;

public interface IBubbleSortService {

    public BubbleSortResponseDTO doBubbleSort(Integer[] value);
    
}
