package Dao;

import java.sql.SQLException;

import javax.annotation.processing.Generated;

import org.junit.Test;

import Model.User;

@Generated(value = "org.junit-tools-1.1.0")
public class LoginDAOTest {

	private LoginDAO createTestSubject() {
		return new LoginDAO();
	}

	@MethodRef(name = "checkUser", signature = "(QUser;)Z")
	@Test
	public void testCheckUser() throws Exception {
		LoginDAO testSubject;
		User user = null;
		boolean result;
	}

	@MethodRef(name = "getUserByUserName", signature = "(QString;)QUser;")
	@Test
	public void testGetUserByUserName() throws Exception {
		LoginDAO testSubject;
		String key = "";
		User result;
	}

	@MethodRef(name = "printSQLException", signature = "(QSQLException;)V")
	@Test
	public void testPrintSQLException() throws Exception {
		LoginDAO testSubject;
		SQLException ex = null;

	}
}