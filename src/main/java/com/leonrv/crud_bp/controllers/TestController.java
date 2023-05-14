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
    public String splitSentenceM(@RequestParam String input){
        return wordService.splitSentence(input);
    }
    
}
