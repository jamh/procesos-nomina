package com.procesos.nomina.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Table(name = "PROCESOS")
public class Proceso {
	@Id
	@Column(length = 40)
	@Getter
	@Setter
	private String usuario;

	@Column(length = 50)
	@Getter
	@Setter
	private String modulo;

	@Column(length = 20)
	@Getter
	@Setter
	private String servidor;

	@Column
	@Getter
	@Setter
	private Long pid;

	@Column(length = 200)
	@Getter
	@Setter
	private String pidAnt;

	@Column(length = 10)
	@Getter
	@Setter
	private String tarea;

	@Column(length = 500)
	@Getter
	@Setter
	private String conexion;

	@Column(length = 4000)
	@Getter
	@Setter
	private String parametros;

	@Column
	@Getter
	@Setter
	private Date fechaIni;

	@Column
	@Getter
	@Setter
	private Date fechaFin;

	@Column
	@Getter
	@Setter
	private Double tiempo;

	@Column
	@Getter
	@Setter
	private Long formato;

	@Column(length = 200)
	@Getter
	@Setter
	private String destino;

	@Column(length = 1000)
	@Getter
	@Setter
	private String comando;

	@Column
	@Getter
	@Setter
	private Long estatus;

	@Column(length = 40)
	@Getter
	@Setter
	private String archProp;

	@Column(length = 80)
	@Getter
	@Setter
	private String mailUsr;

	@Column(length = 4000)
	@Getter
	@Setter
	private String parametros2;

	@Column(length = 4000)
	@Getter
	@Setter
	private String parametros3;

	@Column(length = 4000)
	@Getter
	@Setter
	private String parametros4;

	@Column(length = 4000)
	@Getter
	@Setter
	private String mailText;

	@Column(length = 255)
	@Getter
	@Setter
	private String mailPara;

	@Column(length = 1000)
	@Getter
	@Setter
	private String attach;

	@Column(length = 255)
	@Getter
	@Setter
	private String mailCopia;

	@Column(length = 255)
	@Getter
	@Setter
	private String mailTitulo;

	@Column(length = 50)
	@Getter
	@Setter
	private String hora;

	@Column(length = 10)
	@Getter
	@Setter
	private String dicMenu;

	@Column(length = 10)
	@Getter
	@Setter
	private String dicSubmenu;
}