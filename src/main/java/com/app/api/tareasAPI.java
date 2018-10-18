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

import com.app.models.tarea;

@Path("/tareas")
public class tareasAPI {
		private static Logger logger = Logger.getLogger("tareas");
		
		public static List<tarea> tareas;
		
		static {
			tareas = new ArrayList<tarea>();
			tareas.add(new tarea(1, "planificar",10,3));
			tareas.add(new tarea(2, "analizar",54,4));
			tareas.add(new tarea(3, "trabajar",87,8));
		}
		
		@Path("")
		@Produces(MediaType.APPLICATION_JSON)
		@GET
		public List<tarea> getTareas() {
			logger.info("Estoy enviando lista proyectos ...");
			return tareas;
		}
		
		
		@Path("")
		@POST
		@Consumes(MediaType.APPLICATION_JSON)
		@Produces(MediaType.APPLICATION_JSON)
		public int addUsuario(tarea nuevaTarea) {
			int nuevoId = (int) System.currentTimeMillis();
			nuevaTarea.setTid(nuevoId);
			tareas.add(nuevaTarea);
			return nuevoId;
		}
	}

