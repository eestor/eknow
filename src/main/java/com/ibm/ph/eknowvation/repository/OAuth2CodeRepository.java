package com.ibm.ph.eknowvation.repository;

import com.ibm.ph.eknowvation.domain.OAuth2AuthenticationCode;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OAuth2CodeRepository extends MongoRepository<OAuth2AuthenticationCode, String> {

    OAuth2AuthenticationCode findOneByCode(String code);
}
