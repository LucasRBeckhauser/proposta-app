package com.beckhauser.proposta_app.service;

import com.beckhauser.proposta_app.dto.PropostaRequestDto;
import com.beckhauser.proposta_app.dto.PropostaResponseDto;
import com.beckhauser.proposta_app.repository.PropostaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PropostaService {

    @Autowired
    private PropostaRepository propostaRepository;

    public PropostaResponseDto criar(PropostaRequestDto requestDto) {

        return null;
    }
}
