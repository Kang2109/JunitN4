package Dao;

import java.sql.SQLException;
import java.util.List;

import javax.annotation.processing.Generated;

import org.junit.Test;

@Generated(value = "org.junit-tools-1.1.0")
public class ClientDAOTest {

	private ClientDAO createTestSubject() {
		return new ClientDAO();
	}

	@MethodRef(name = "insertClient", signature = "(QClient;)V")
	@Test
	public void testInsertClient() throws Exception {
		ClientDAO testSubject;
		Client client = null;

	}

	@MethodRef(name = "selectClient", signature = "(I)QClient;")
	@Test
	public void testSelectClient() throws Exception {
		ClientDAO testSubject;
		int id = 0;
		Client result;
	}

	@MethodRef(name = "selectAllClient", signature = "()QList<QClient;>;")
	@Test
	public void testSelectAllClient() throws Exception {
		ClientDAO testSubject;
		List<Client> result;
	}

	@MethodRef(name = "deleteClient", signature = "(I)Z")
	@Test
	public void testDeleteClient() throws Exception {
		ClientDAO testSubject;
		int id = 0;
		boolean result;
	}

	@MethodRef(name = "updateClient", signature = "(QClient;)Z")
	@Test
	public void testUpdateClient() throws Exception {
		ClientDAO testSubject;
		Client client = null;
		boolean result;
	}

	@MethodRef(name = "printSQLException", signature = "(QSQLException;)V")
	@Test
	public void testPrintSQLException() throws Exception {
		ClientDAO testSubject;
		SQLException ex = null;

	}
}