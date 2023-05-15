package com.leonrv.crud_bp.controllers;


import org.springframework.web.bind.annotation.*;
import com.leonrv.crud_bp.models.*;
import com.leonrv.crud_bp.repositories.*;

import io.swagger.v3.oas.annotations.*;
import io.swagger.v3.oas.annotations.responses.*;
import io.swagger.v3.oas.annotations.tags.*;

import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import com.leonrv.crud_bp.repositories.*;
import com.leonrv.crud_bp.services.*;

@RestController @RequestMapping("/api/v1/test") @CrossOrigin("*")
@Tag(description = "Test Netcracker", name = "Test Controller")
public class TestController {

    @Autowired
    IWordService wordService;

    @GetMapping("/splitsentence")
    public ResponseEntity<?> splitSentenceM(@RequestParam String input){

        Map<String, Object> responseMap = new HashMap<>();

        String resp = "";

        try {
            resp = wordService.splitSentence(input);
            responseMap.put("msg", resp);
            return new ResponseEntity<Map<String, Object>>(responseMap, HttpStatus.OK);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            responseMap.put("error", "error");
            return new ResponseEntity<Map<String, Object>>(responseMap, HttpStatus.INTERNAL_SERVER_ERROR);
        }

       

    }
    
}
