package de.company.crm.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import de.company.crm.server.domain.AddressImpl;

@Repository
public interface AddressRepository extends JpaRepository<AddressImpl, Long> {

}
