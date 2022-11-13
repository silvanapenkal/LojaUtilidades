package tech.devinhouse.lojautilidades.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.devinhouse.lojautilidades.models.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository <Cliente, Integer> {

    boolean existsByCpfCnpj(String cpfCnpj);

    boolean existsByIdNotAndCpfCnpj(Integer id, String cpfCnpj);
}

