package com.leonrv.crud_bp.controllers;

import org.springframework.web.bind.annotation.*;
import com.leonrv.crud_bp.models.*;
import com.leonrv.crud_bp.repositories.*;

import io.swagger.v3.oas.annotations.*;
import io.swagger.v3.oas.annotations.responses.*;
import io.swagger.v3.oas.annotations.tags.*;

@RestController @RequestMapping("/api/v1/model") @CrossOrigin("*")
@Tag(description = "Model Operations API Rest", name = "Model Controller")
public class ModelController extends GenericController<Model, Long> {
    public ModelController(IGenericRepository<Model, Long> repository) {
        super(repository);
    }


    // Example
    // @GetMapping
    // @Operation(summary = "List of all employees")
    // @ApiResponse(responseCode = "401", description = "User or password incorrect")
    // @ApiResponse(responseCode = "500", description = "Error")
    // public ResponseEntity<?> findAll(@RequestHeader Map<String, String> headers) {



}
