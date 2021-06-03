package Model;

import javax.annotation.processing.Generated;

import org.junit.Test;

@Generated(value = "org.junit-tools-1.1.0")
public class WaterTest {

	private Water createTestSubject() {
		return new Water("", 0, "", new Client(0));
	}

	@MethodRef(name = "getId", signature = "()I")
	@Test
	public void testGetId() throws Exception {
		Water testSubject;
		int result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getId();
	}

	@MethodRef(name = "setId", signature = "(I)V")
	@Test
	public void testSetId() throws Exception {
		Water testSubject;
		int id = 0;

		// default test
		testSubject = createTestSubject();
		testSubject.setId(id);
	}

	@MethodRef(name = "getThang", signature = "()QString;")
	@Test
	public void testGetThang() throws Exception {
		Water testSubject;
		String result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getThang();
	}

	@MethodRef(name = "setThang", signature = "(QString;)V")
	@Test
	public void testSetThang() throws Exception {
		Water testSubject;
		String thang = "";

		// default test
		testSubject = createTestSubject();
		testSubject.setThang(thang);
	}

	@MethodRef(name = "getChiso", signature = "()I")
	@Test
	public void testGetChiso() throws Exception {
		Water testSubject;
		int result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getChiso();
	}

	@MethodRef(name = "setChiso", signature = "(I)V")
	@Test
	public void testSetChiso() throws Exception {
		Water testSubject;
		int chiso = 0;

		// default test
		testSubject = createTestSubject();
		testSubject.setChiso(chiso);
	}

	@MethodRef(name = "getTrangthai", signature = "()QString;")
	@Test
	public void testGetTrangthai() throws Exception {
		Water testSubject;
		String result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getTrangthai();
	}

	@MethodRef(name = "setTrangthai", signature = "(QString;)V")
	@Test
	public void testSetTrangthai() throws Exception {
		Water testSubject;
		String trangthai = "";

		// default test
		testSubject = createTestSubject();
		testSubject.setTrangthai(trangthai);
	}

	@MethodRef(name = "getClient", signature = "()QClient;")
	@Test
	public void testGetClient() throws Exception {
		Water testSubject;
		Client result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getClient();
	}

	@MethodRef(name = "setClient", signature = "(QClient;)V")
	@Test
	public void testSetClient() throws Exception {
		Water testSubject;
		Client client = null;

		// default test
		testSubject = createTestSubject();
		testSubject.setClient(client);
	}
}