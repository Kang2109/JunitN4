package Dao;

import java.sql.SQLException;
import java.util.List;

import javax.annotation.processing.Generated;

import org.junit.Test;

import Model.User;
import Model.Water;

@Generated(value = "org.junit-tools-1.1.0")
public class UserDAOTest {

	private UserDAO createTestSubject() {
		return new UserDAO();
	}

	@MethodRef(name = "getConnection", signature = "()QConnection;")
	@Test
	public void testGetConnection() throws Exception {
		UserDAO testSubject;
		Connection result;

		// default test
		testSubject = createTestSubject();
		result = Whitebox.invokeMethod(testSubject, "getConnection");
	}

	@MethodRef(name = "selectAllNC", signature = "(I)QList<QWater;>;")
	@Test
	public void testSelectAllNC() throws Exception {
		UserDAO testSubject;
		int iduser = 0;
		List<Water> result;
	}

	@MethodRef(name = "selectByName", signature = "(QString;)QList<QUser;>;")
	@Test
	public void testSelectByName() throws Exception {
		UserDAO testSubject;
		String name = "";
		List<User> result;
	}

	@MethodRef(name = "printSQLException", signature = "(QSQLException;)V")
	@Test
	public void testPrintSQLException() throws Exception {
		UserDAO testSubject;
		SQLException ex = null;

	}
}