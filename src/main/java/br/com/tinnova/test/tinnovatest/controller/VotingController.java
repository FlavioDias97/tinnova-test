package br.com.tinnova.test.tinnovatest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.tinnova.test.tinnovatest.dto.request.VotingRequestDTO;
import br.com.tinnova.test.tinnovatest.dto.response.VotingResponseDTO;
import br.com.tinnova.test.tinnovatest.service.IVotingService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.http.MediaType;

@RestController
@RequestMapping("/api/v1")
@Api(value = "Question -> Voting")
public class VotingController {

    @Autowired
    private IVotingService service;

    @ApiOperation(value = "Return percentage of null, blank and valid votes")
    @GetMapping(value = "/voting/solve", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<VotingResponseDTO> getVotingResult(
        @RequestParam(value="totalVotes", required = true) int totalVotes,
        @RequestParam(value="validVotes", required = true) int validVotes,
        @RequestParam(value="blankVotes", required = true) int blankVotes,
        @RequestParam(value="nullVotes", required = true) int nullVotes

    ){
        VotingResponseDTO response = service.calculateWinnerOfVotating(
             VotingRequestDTO.builder().blankVotes(blankVotes).nullVotes(nullVotes).validVotes(validVotes).totalVotes(totalVotes).build()
        );
        
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
    
}
