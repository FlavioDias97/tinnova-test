package br.com.tinnova.test.tinnovatest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.tinnova.test.tinnovatest.dto.response.BubbleSortResponseDTO;
import br.com.tinnova.test.tinnovatest.service.IBubbleSortService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

@RestController
@RequestMapping("/api/v1")
@Api(value = "Question -> Bubble Sort")
public class BubbleSortController {

    @Autowired
    private IBubbleSortService service;

    @ApiOperation(value = "Receive a vector of int numbers and returns the ordered value using bubble sort")
    @GetMapping(value = "/bubbleSort/solve", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BubbleSortResponseDTO> getBubbleSort(
        @RequestParam(value = "values", required = true) Integer[] values
    ){
        BubbleSortResponseDTO response = service.doBubbleSort(values);
        return new ResponseEntity<>(
            response, HttpStatus.OK
        );
    }
    
}
