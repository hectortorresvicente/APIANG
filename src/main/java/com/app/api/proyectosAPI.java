package com.app.api;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.app.models.proyecto;

@Path("/proyectos")
public class proyectosAPI {
	private static Logger logger = Logger.getLogger("proyectos");
	public static List<proyecto> proyectos;
	
	static {
		proyectos = new ArrayList<proyecto>();
		proyectos.add(new proyecto(1, "MyApp"));
		proyectos.add(new proyecto(2, "Mindty"));
		proyectos.add(new proyecto(3, "WorkerApp"));
	}
	@Path("")
	@Produces(MediaType.APPLICATION_JSON)
	@GET
	public List<proyecto> getUsuarios() {
		logger.info("Estoy enviando lista proyectos ...");
		return proyectos;
	}
	
	
	@Path("")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public int addUsuario(proyecto nuevoProyecto) {
		int nuevoId = (int) System.currentTimeMillis();
		nuevoProyecto.setPid(nuevoId);
		proyectos.add(nuevoProyecto);
		return nuevoId;
	}
}
