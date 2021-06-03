package Model;

import javax.annotation.processing.Generated;

import org.junit.Test;

@Generated(value = "org.junit-tools-1.1.0")
public class ClientTest {

	private Client createTestSubject() {
		return new Client(0);
	}

	@MethodRef(name = "getId", signature = "()I")
	@Test
	public void testGetId() throws Exception {
		Client testSubject;
		int result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getId();
	}

	@MethodRef(name = "setId", signature = "(I)V")
	@Test
	public void testSetId() throws Exception {
		Client testSubject;
		int id = 0;

		// default test
		testSubject = createTestSubject();
		testSubject.setId(id);
	}

	@MethodRef(name = "getName", signature = "()QString;")
	@Test
	public void testGetName() throws Exception {
		Client testSubject;
		String result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getName();
	}

	@MethodRef(name = "setName", signature = "(QString;)V")
	@Test
	public void testSetName() throws Exception {
		Client testSubject;
		String name = "";

		// default test
		testSubject = createTestSubject();
		testSubject.setName(name);
	}

	@MethodRef(name = "getAddress", signature = "()QString;")
	@Test
	public void testGetAddress() throws Exception {
		Client testSubject;
		String result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getAddress();
	}

	@MethodRef(name = "setAddress", signature = "(QString;)V")
	@Test
	public void testSetAddress() throws Exception {
		Client testSubject;
		String address = "";

		// default test
		testSubject = createTestSubject();
		testSubject.setAddress(address);
	}

	@MethodRef(name = "getEmail", signature = "()QString;")
	@Test
	public void testGetEmail() throws Exception {
		Client testSubject;
		String result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getEmail();
	}

	@MethodRef(name = "setEmail", signature = "(QString;)V")
	@Test
	public void testSetEmail() throws Exception {
		Client testSubject;
		String email = "";

		// default test
		testSubject = createTestSubject();
		testSubject.setEmail(email);
	}

	@MethodRef(name = "getPhonenumber", signature = "()QString;")
	@Test
	public void testGetPhonenumber() throws Exception {
		Client testSubject;
		String result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getPhonenumber();
	}

	@MethodRef(name = "setPhonenumber", signature = "(QString;)V")
	@Test
	public void testSetPhonenumber() throws Exception {
		Client testSubject;
		String phonenumber = "";

		// default test
		testSubject = createTestSubject();
		testSubject.setPhonenumber(phonenumber);
	}
}