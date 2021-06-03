package Dao;

import java.sql.SQLException;

import javax.annotation.processing.Generated;

import org.junit.Test;

import Model.Bill;

@Generated(value = "org.junit-tools-1.1.0")
public class BillDAOTest {

	private BillDAO createTestSubject() {
		return new BillDAO();
	}

	@MethodRef(name = "insertBill", signature = "(QBill;)V")
	@Test
	public void testInsertBill() throws Exception {
		BillDAO testSubject;
		Bill bill = null;

	}

	@MethodRef(name = "printSQLException", signature = "(QSQLException;)V")
	@Test
	public void testPrintSQLException() throws Exception {
		BillDAO testSubject;
		SQLException ex = null;

	}
}