package com.beckhauser.proposta_app.mapper;

import com.beckhauser.proposta_app.dto.PropostaRequestDto;
import com.beckhauser.proposta_app.dto.PropostaResponseDto;
import com.beckhauser.proposta_app.model.Proposta;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.text.NumberFormat;
import java.util.List;

@Mapper
public interface PropostaMapperInterface {

PropostaMapperInterface INSTANCE = Mappers.getMapper(PropostaMapperInterface.class);

    @Mapping(target = "usuario.nome", source = "nome")
    @Mapping(target = "usuario.sobrenome", source = "sobrenome")
    @Mapping(target = "usuario.cpf", source = "cpf")
    @Mapping(target = "usuario.telefone", source = "telefone")
    @Mapping(target = "usuario.renda", source = "renda")
    @Mapping(target = "aprovada", ignore = true)
    @Mapping(target = "integrada", ignore = true)
    @Mapping(target = "observacao", ignore = true)
    @Mapping(target = "id", ignore = true)



    Proposta convertDtoToProposta (PropostaRequestDto requestDto);


    @Mapping(target = "nome", source = "usuario.nome")
    @Mapping(target = "sobrenome", source = "usuario.sobrenome")
    @Mapping(target = "cpf", source = "usuario.cpf")
    @Mapping(target = "telefone", source = "usuario.telefone")
    @Mapping(target = "renda", source = "usuario.renda")
    @Mapping(target = "valorSolicitadoFmt", expression = "java(setValorSolicitadoFmt(proposta))")
    PropostaResponseDto convertEntityToDto (Proposta proposta);


 List<PropostaResponseDto> convertListEntityToListDto (Iterable <Proposta> propostas);

 default String setValorSolicitadoFmt(Proposta proposta) {
    return NumberFormat.getCurrencyInstance(null).format(proposta.getValorSolicitado());
    
 }

}
