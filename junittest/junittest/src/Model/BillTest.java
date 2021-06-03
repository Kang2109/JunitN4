package Model;

import javax.annotation.processing.Generated;

import org.junit.Test;

@Generated(value = "org.junit-tools-1.1.0")
public class BillTest {

	private Bill createTestSubject() {
		return new Bill(0, new User(0, "", "", "", "", "", "", ""), new Client(0), new Water("", 0, "", new Client(0)),
				new Timestamp(0, 0, 0, 0, 0, 0, 0), 0, 0, 0.0, 0.0, 0.0, 0.0);
	}

	@MethodRef(name = "getId", signature = "()I")
	@Test
	public void testGetId() throws Exception {
		Bill testSubject;
		int result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getId();
	}

	@MethodRef(name = "setId", signature = "(I)V")
	@Test
	public void testSetId() throws Exception {
		Bill testSubject;
		int id = 0;

		// default test
		testSubject = createTestSubject();
		testSubject.setId(id);
	}

	@MethodRef(name = "getUser", signature = "()QUser;")
	@Test
	public void testGetUser() throws Exception {
		Bill testSubject;
		User result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getUser();
	}

	@MethodRef(name = "setUser", signature = "(QUser;)V")
	@Test
	public void testSetUser() throws Exception {
		Bill testSubject;
		User user = null;

		// default test
		testSubject = createTestSubject();
		testSubject.setUser(user);
	}

	@MethodRef(name = "getClient", signature = "()QClient;")
	@Test
	public void testGetClient() throws Exception {
		Bill testSubject;
		Client result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getClient();
	}

	@MethodRef(name = "setClient", signature = "(QClient;)V")
	@Test
	public void testSetClient() throws Exception {
		Bill testSubject;
		Client client = null;

		// default test
		testSubject = createTestSubject();
		testSubject.setClient(client);
	}

	@MethodRef(name = "getWater", signature = "()QWater;")
	@Test
	public void testGetWater() throws Exception {
		Bill testSubject;
		Water result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getWater();
	}

	@MethodRef(name = "setWater", signature = "(QWater;)V")
	@Test
	public void testSetWater() throws Exception {
		Bill testSubject;
		Water water = null;

		// default test
		testSubject = createTestSubject();
		testSubject.setWater(water);
	}

	@MethodRef(name = "getNgaytt", signature = "()QTimestamp;")
	@Test
	public void testGetNgaytt() throws Exception {
		Bill testSubject;
		Timestamp result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getNgaytt();
	}

	@MethodRef(name = "setNgaytt", signature = "(QTimestamp;)V")
	@Test
	public void testSetNgaytt() throws Exception {
		Bill testSubject;
		Timestamp ngaytt = null;

		// default test
		testSubject = createTestSubject();
		testSubject.setNgaytt(ngaytt);
	}

	@MethodRef(name = "getCscu", signature = "()I")
	@Test
	public void testGetCscu() throws Exception {
		Bill testSubject;
		int result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getCscu();
	}

	@MethodRef(name = "setCscu", signature = "(I)V")
	@Test
	public void testSetCscu() throws Exception {
		Bill testSubject;
		int cscu = 0;

		// default test
		testSubject = createTestSubject();
		testSubject.setCscu(cscu);
	}

	@MethodRef(name = "getTieuthu", signature = "()I")
	@Test
	public void testGetTieuthu() throws Exception {
		Bill testSubject;
		int result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getTieuthu();
	}

	@MethodRef(name = "setTieuthu", signature = "(I)V")
	@Test
	public void testSetTieuthu() throws Exception {
		Bill testSubject;
		int tieuthu = 0;

		// default test
		testSubject = createTestSubject();
		testSubject.setTieuthu(tieuthu);
	}

	@MethodRef(name = "getTiennuoc", signature = "()D")
	@Test
	public void testGetTiennuoc() throws Exception {
		Bill testSubject;
		double result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getTiennuoc();
	}

	@MethodRef(name = "setTiennuoc", signature = "(D)V")
	@Test
	public void testSetTiennuoc() throws Exception {
		Bill testSubject;
		double tiennuoc = 0.0;

		// default test
		testSubject = createTestSubject();
		testSubject.setTiennuoc(tiennuoc);
	}

	@MethodRef(name = "getTienthue", signature = "()D")
	@Test
	public void testGetTienthue() throws Exception {
		Bill testSubject;
		double result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getTienthue();
	}

	@MethodRef(name = "setTienthue", signature = "(D)V")
	@Test
	public void testSetTienthue() throws Exception {
		Bill testSubject;
		double tienthue = 0.0;

		// default test
		testSubject = createTestSubject();
		testSubject.setTienthue(tienthue);
	}

	@MethodRef(name = "getPhibvmt", signature = "()D")
	@Test
	public void testGetPhibvmt() throws Exception {
		Bill testSubject;
		double result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getPhibvmt();
	}

	@MethodRef(name = "setPhibvmt", signature = "(D)V")
	@Test
	public void testSetPhibvmt() throws Exception {
		Bill testSubject;
		double phibvmt = 0.0;

		// default test
		testSubject = createTestSubject();
		testSubject.setPhibvmt(phibvmt);
	}

	@MethodRef(name = "getTongtien", signature = "()D")
	@Test
	public void testGetTongtien() throws Exception {
		Bill testSubject;
		double result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getTongtien();
	}

	@MethodRef(name = "setTongtien", signature = "(D)V")
	@Test
	public void testSetTongtien() throws Exception {
		Bill testSubject;
		double tongtien = 0.0;

		// default test
		testSubject = createTestSubject();
		testSubject.setTongtien(tongtien);
	}
}