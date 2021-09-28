package com.domain.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.domain.modelo.Alumno;
import com.domain.modelo.selectStrategy.SelectStrategy;

@Controller
public class IndexController {
	@RequestMapping("/home")
	public String goIndex() {
	return "index";
	}
	
	@RequestMapping("/")
	public String getPresentacion() {
		return "Presentacion";	}
	
	@RequestMapping("/listadoviejo")
	public String goListadoViejo(Model model) {
		
		List<String> alumnos = new ArrayList<String>();
		alumnos.add("Juan");
		alumnos.add("Pedro");
		alumnos.add("Jóse");
		
		model.addAttribute("titulo","Listado de alumnnos");
		model.addAttribute("profesor","Gabriel Casas");
		model.addAttribute("alumnos",alumnos);
		
		return "Listado";
	}
	@RequestMapping("/listado")
	public String goListado(Model model) throws ClassNotFoundException, SQLException {
		
		String sql = SelectStrategy.getSql(new Alumno());
		
		List<Alumno> alumnos = new ArrayList<Alumno>(SelectAlumnos.leer(sql));
		
		model.addAttribute("titulo","Listado de alumnnos");
		model.addAttribute("profesor","Gabriel Casas");
		model.addAttribute("alumnos",alumnos);
		
		return "Listado";
	}
}
