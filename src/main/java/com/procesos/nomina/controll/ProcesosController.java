package com.procesos.nomina.controll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.procesos.nomina.model.Proceso;
import com.procesos.nomina.service.ServiceProcesos;

@RestController
@RequestMapping("/procesos")
public class ProcesosController {
	
	@Autowired
    private ServiceProcesos serviceProcesos;
	
	
    @GetMapping("/getall")
    public List<Proceso> getProcesos(){
    	return serviceProcesos.getAllProcesos();
    }
    
    @PostMapping("/crear")
    public Proceso crearProceso(@RequestBody Proceso proceso) {
    	return serviceProcesos.saveProceso(proceso);
    }
    
    @PutMapping("/modificar")
    public Proceso editarProceso(@RequestBody Proceso proceso) {
    	return serviceProcesos.updateProceso(proceso);
    }
    
    @DeleteMapping("/eliminar")
    public void eliminarProceso(@RequestBody String id) {
    	serviceProcesos.deleteProceso(id);
    }
    
}
