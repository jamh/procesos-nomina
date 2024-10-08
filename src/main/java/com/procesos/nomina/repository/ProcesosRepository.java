package com.procesos.nomina.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.procesos.nomina.model.Proceso;

@Repository
public interface ProcesosRepository extends JpaRepository<Proceso, String> {
	@Query(value = "SELECT * FROM PROCESOS WHERE ROWNUM <= 10 ORDER BY FECHA_INI DESC", nativeQuery = true)
	public List<Proceso> getAllProcesos();
}
