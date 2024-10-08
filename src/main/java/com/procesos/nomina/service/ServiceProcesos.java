package com.procesos.nomina.service;

import java.util.List;

import com.procesos.nomina.model.Proceso;


public interface ServiceProcesos {
	
	/**
     * Fetches the list of all Procesos entities.
     * @return a list of Procesos
     */
	public List<Proceso> getProcesosList();
    
	public List<Proceso> getAllProcesos();
    /**
     * Saves a Procesos entity.
     * @param Procesos the Procesos to save
     * @return the saved Procesos
     */
    public Proceso saveProceso(Proceso Procesos);

	public Proceso updateProceso(Proceso proceso);

	public void deleteProceso(String id);

	

}
