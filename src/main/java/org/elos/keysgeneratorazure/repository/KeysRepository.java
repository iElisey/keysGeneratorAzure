package org.elos.keysgeneratorazure.repository;

import org.elos.keysgeneratorazure.model.Keys;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KeysRepository extends JpaRepository<Keys, Long> {

}