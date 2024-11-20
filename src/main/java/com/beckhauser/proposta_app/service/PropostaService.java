package com.beckhauser.proposta_app.service;

import com.beckhauser.proposta_app.dto.PropostaRequestDto;
import com.beckhauser.proposta_app.dto.PropostaResponseDto;
import com.beckhauser.proposta_app.mapper.PropostaMapperInterface;
import com.beckhauser.proposta_app.model.Proposta;
import com.beckhauser.proposta_app.repository.PropostaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropostaService {

    @Autowired
    private PropostaRepository propostaRepository;

    public PropostaResponseDto criar(PropostaRequestDto requestDto) {
        Proposta proposta = PropostaMapperInterface.INSTANCE.convertDtoToProposta(requestDto);
        propostaRepository.save(proposta);

        return PropostaMapperInterface.INSTANCE.convertEntityToDto(proposta);
    }

    public List<PropostaResponseDto> obterProposta() {
        return PropostaMapperInterface.INSTANCE.convertListEntityToListDto(propostaRepository.findAll());
    }
}
