package com.consulta.cep.endereco.service;

import com.consulta.cep.endereco.feign.EnderecoFeign;
import com.consulta.cep.endereco.model.dto.EnderecoRequest;
import com.consulta.cep.endereco.model.dto.EnderecoResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
@RequiredArgsConstructor
@Service
public class EnderecoService {
    private final EnderecoFeign enderecoFeign;
    public EnderecoResponse execulta(EnderecoRequest request){
    return enderecoFeign.buscaEnderecoCep(request.getCep());
    }
}
