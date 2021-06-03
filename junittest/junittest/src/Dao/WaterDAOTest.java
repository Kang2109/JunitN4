package Dao;

import java.sql.SQLException;
import java.util.List;

import javax.annotation.processing.Generated;

import org.junit.Test;

import Model.Water;

@Generated(value = "org.junit-tools-1.1.0")
public class WaterDAOTest {

	private WaterDAO createTestSubject() {
		return new WaterDAO();
	}

	@MethodRef(name = "selectAllWater", signature = "(IQString;)QList<QWater;>;")
	@Test
	public void testSelectAllWater() throws Exception {
		WaterDAO testSubject;
		int idclient = 0;
		String tthai = "";
		List<Water> result;
	}

	@MethodRef(name = "insertWater", signature = "(QWater;)V")
	@Test
	public void testInsertWater() throws Exception {
		WaterDAO testSubject;
		Water water = null;

	}

	@MethodRef(name = "selectWater", signature = "(I)QWater;")
	@Test
	public void testSelectWater() throws Exception {
		WaterDAO testSubject;
		int id = 0;
		Water result;
	}

	@MethodRef(name = "selectChisocu", signature = "(IQString;)QWater;")
	@Test
	public void testSelectChisocu() throws Exception {
		WaterDAO testSubject;
		int idclient = 0;
		String thang = "";
		Water result;
	}

	@MethodRef(name = "thangtrc", signature = "(QString;)QString;")
	@Test
	public void testThangtrc() throws Exception {
		String str = "";
		String result;
	}

	@MethodRef(name = "tinhTien", signature = "(I)D")
	@Test
	public void testTinhTien() throws Exception {
		int soKhoi = 0;
		double result;
	}

	@MethodRef(name = "updateWater", signature = "(QWater;)Z")
	@Test
	public void testUpdateWater() throws Exception {
		WaterDAO testSubject;
		Water water = null;
		boolean result;
	}

	@MethodRef(name = "printSQLException", signature = "(QSQLException;)V")
	@Test
	public void testPrintSQLException() throws Exception {
		WaterDAO testSubject;
		SQLException ex = null;

	}
}