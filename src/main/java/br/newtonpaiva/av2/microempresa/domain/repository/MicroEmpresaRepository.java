package br.newtonpaiva.av2.microempresa.domain.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.newtonpaiva.av2.microempresa.domain.MicroEmpresa;

public interface MicroEmpresaRepository extends MongoRepository<MicroEmpresa, String> {

}
