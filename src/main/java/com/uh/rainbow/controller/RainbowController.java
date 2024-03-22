package com.uh.rainbow.controller;

import com.uh.rainbow.dto.ResponseDTO;
import com.uh.rainbow.services.HTMLParserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <b>File:</b> RainbowController.java
 * <p>
 * <b>Description:</b>
 *
 * @author Derek Garcia
 */

@RequestMapping("/rainbow/v1")
@RestController(value = "rainbowController")
public class RainbowController {
    // Spring-configured logger
    public static final Logger LOGGER = LoggerFactory.getLogger(RainbowController.class);

    private final HTMLParserService htmlParserService = new HTMLParserService();

    /*
    Endpoints
    /campuses
    /campuses/{id}/terms
    /campuses/{id}/terms/{id}
    /campuses/{id}/terms/{id}/subjects
    /campuses/{id}/terms/{id}/courses
    ?crn
    ?cid
    ?subject
    ?start-after
    ?end-before
    ?online
    ?keyword
    ?instructor
    */

    @GetMapping(value = "/ping")
    public ResponseEntity<ResponseDTO> ping(){
        return new ResponseEntity<>(new ResponseDTO("pong!"), HttpStatus.OK);
    }





}
