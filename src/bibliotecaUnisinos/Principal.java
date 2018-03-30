package bibliotecaUnisinos;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Livro;

public class Principal {

	public static void main(String[] args) {
		// Inicializacao da fabrica de objetos
		// persistenceUnitName = "bibliotecaUnisinos", ou seja, relaciona com a conexao na
		// persistence.xml (podera ter "n" unidades de persistencia)
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("bibliotecaUnisinos_persistence_unit");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		System.out.println("to testando heim");

		System.exit(0);
	}

}
