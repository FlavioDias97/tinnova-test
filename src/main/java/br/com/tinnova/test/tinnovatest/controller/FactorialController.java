package br.com.tinnova.test.tinnovatest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.tinnova.test.tinnovatest.dto.response.FactorialResponseDTO;
import br.com.tinnova.test.tinnovatest.service.IFactorialService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;


@RestController
@RequestMapping("/api/v1")
@Api(value = "Question -> Factorial")
public class FactorialController {

    @Autowired
    private IFactorialService service;

    @ApiOperation(value = "Return the factorial of any number")
    @GetMapping(value = "/factorial/solve", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<FactorialResponseDTO> getFactorial(
        @RequestParam(value = "value", required =  true) int value
    ){
        return new ResponseEntity<>(service.solveFactorial(value), HttpStatus.OK);
    }
    
}
