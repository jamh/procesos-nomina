package com.procesos.nomina.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.procesos.nomina.model.Proceso;
import com.procesos.nomina.repository.ProcesosRepository;
import com.procesos.nomina.service.ServiceProcesos;


@Service
public class ServiceProcesosImpl implements ServiceProcesos	{
	
	@Autowired
    private ProcesosRepository repoProcesos;

    @Override
    public List<Proceso> getAllProcesos() {
        // Retrieves and returns a list of all Procesos entities.
        return (List<Proceso>) repoProcesos.getAllProcesos();
    }
	
    @Override
    public List<Proceso> getProcesosList() {
        // Retrieves and returns a list of all Procesos entities.
        return (List<Proceso>) repoProcesos.findAll();
    }
    
    @Override
    public Proceso saveProceso(Proceso Proceso) {
        // Saves and returns the Proceso entity.
        return repoProcesos.save(Proceso);
    }

	@Override
	public Proceso updateProceso(Proceso proceso) {
		//Proceso p = repoProcesos.findById(proceso.getId());
		return null;
	}

	@Override
	public void deleteProceso(String id) {
		repoProcesos.deleteById(id);
	}
}
