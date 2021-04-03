package br.com.tinnova.test.tinnovatest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.tinnova.test.tinnovatest.dto.response.MultiplesSumResponseDTO;
import br.com.tinnova.test.tinnovatest.service.IMultiplesSumService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;


@RestController
@RequestMapping("/api/v1")
@Api(value = "Question -> Sum of multiples")
public class MultiplesSumController {

    @Autowired
    IMultiplesSumService sevice;

    @ApiOperation(value = "Returns the sum of multiples of 3 or 5.")
	@GetMapping(value = "/division/solve", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<MultiplesSumResponseDTO> getDivision(
        @RequestParam(value = "value", required = true) int value
    ){

        return new ResponseEntity<>(sevice.solveDivision(value), HttpStatus.OK);
    }
    
}
