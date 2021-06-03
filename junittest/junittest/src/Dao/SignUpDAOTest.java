package Dao;

import java.sql.SQLException;
import java.util.List;

import javax.annotation.processing.Generated;

import org.junit.Test;

import Model.User;

@Generated(value = "org.junit-tools-1.1.0")
public class SignUpDAOTest {

	private SignUpDAO createTestSubject() {
		return new SignUpDAO();
	}

	@MethodRef(name = "insertUser", signature = "(QUser;)V")
	@Test
	public void testInsertUser() throws Exception {
		SignUpDAO testSubject;
		User user = null;

	}

	@MethodRef(name = "selectAllUser", signature = "()QList<QUser;>;")
	@Test
	public void testSelectAllUser() throws Exception {
		SignUpDAO testSubject;
		List<User> result;
	}

	@MethodRef(name = "printSQLException", signature = "(QSQLException;)V")
	@Test
	public void testPrintSQLException() throws Exception {
		SignUpDAO testSubject;
		SQLException ex = null;

	}
}