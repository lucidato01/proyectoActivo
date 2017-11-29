package com.co.dao.imp;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.jboss.logging.Logger;

import com.co.dao.IDaoPersona;
import com.co.modelo.Inmueble;
import com.co.modelo.Persona;

public class DaoPersona implements IDaoPersona {

	private Logger logger = Logger.getLogger(DaoPersona.class.getName());
	private EntityManager entityM;

	public DaoPersona() {
		logger.info("Inicia Dao Persona");
		//EntityManagerFactory factory = Persistence.createEntityManagerFactory("activo");
		//this.entityM = factory.createEntityManager();
	}

	@Override
	public List<Persona> listaPersona() {
		List<Persona> listaGeneral =new ArrayList<>();
		try {
			System.out.println("enyro al dao");
			//Session session = (Session) this.entityM.getDelegate();
			//Criteria criteria = session.createCriteria(Persona.class);
			//listaGeneral = criteria.list();
			Persona p = new Persona("1049630999", "Pepito Perez");
			Persona p2 = new Persona("1049630998", "Mary Mad");
			listaGeneral.add(p);
			listaGeneral.add(p2);
			
			return listaGeneral;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	
	}

}
