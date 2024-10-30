package com.beckhauser.proposta_app.controller;

import com.beckhauser.proposta_app.dto.PropostaRequestDto;
import com.beckhauser.proposta_app.dto.PropostaResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/propostas")
public class PropostaController {

    @PostMapping
    public ResponseEntity <PropostaResponseDto> criar(@RequestBody PropostaRequestDto requestDto) {
        return null;
    }
}
