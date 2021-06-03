package Model;

import javax.annotation.processing.Generated;

import org.junit.Test;

@Generated(value = "org.junit-tools-1.1.0")
public class UserTest {

	private User createTestSubject() {
		return new User(0, "", "", "", "", "", "", "");
	}

	@MethodRef(name = "getId", signature = "()I")
	@Test
	public void testGetId() throws Exception {
		User testSubject;
		int result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getId();
	}

	@MethodRef(name = "setId", signature = "(I)V")
	@Test
	public void testSetId() throws Exception {
		User testSubject;
		int id = 0;

		// default test
		testSubject = createTestSubject();
		testSubject.setId(id);
	}

	@MethodRef(name = "getName", signature = "()QString;")
	@Test
	public void testGetName() throws Exception {
		User testSubject;
		String result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getName();
	}

	@MethodRef(name = "setName", signature = "(QString;)V")
	@Test
	public void testSetName() throws Exception {
		User testSubject;
		String name = "";

		// default test
		testSubject = createTestSubject();
		testSubject.setName(name);
	}

	@MethodRef(name = "getEmail", signature = "()QString;")
	@Test
	public void testGetEmail() throws Exception {
		User testSubject;
		String result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getEmail();
	}

	@MethodRef(name = "setEmail", signature = "(QString;)V")
	@Test
	public void testSetEmail() throws Exception {
		User testSubject;
		String email = "";

		// default test
		testSubject = createTestSubject();
		testSubject.setEmail(email);
	}

	@MethodRef(name = "getAddress", signature = "()QString;")
	@Test
	public void testGetAddress() throws Exception {
		User testSubject;
		String result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getAddress();
	}

	@MethodRef(name = "setAddress", signature = "(QString;)V")
	@Test
	public void testSetAddress() throws Exception {
		User testSubject;
		String address = "";

		// default test
		testSubject = createTestSubject();
		testSubject.setAddress(address);
	}

	@MethodRef(name = "getPhonenumber", signature = "()QString;")
	@Test
	public void testGetPhonenumber() throws Exception {
		User testSubject;
		String result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getPhonenumber();
	}

	@MethodRef(name = "setPhonenumber", signature = "(QString;)V")
	@Test
	public void testSetPhonenumber() throws Exception {
		User testSubject;
		String phonenumber = "";

		// default test
		testSubject = createTestSubject();
		testSubject.setPhonenumber(phonenumber);
	}

	@MethodRef(name = "getUsername", signature = "()QString;")
	@Test
	public void testGetUsername() throws Exception {
		User testSubject;
		String result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getUsername();
	}

	@MethodRef(name = "setUsername", signature = "(QString;)V")
	@Test
	public void testSetUsername() throws Exception {
		User testSubject;
		String username = "";

		// default test
		testSubject = createTestSubject();
		testSubject.setUsername(username);
	}

	@MethodRef(name = "getPassword", signature = "()QString;")
	@Test
	public void testGetPassword() throws Exception {
		User testSubject;
		String result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getPassword();
	}

	@MethodRef(name = "setPassword", signature = "(QString;)V")
	@Test
	public void testSetPassword() throws Exception {
		User testSubject;
		String password = "";

		// default test
		testSubject = createTestSubject();
		testSubject.setPassword(password);
	}

	@MethodRef(name = "getPosition", signature = "()QString;")
	@Test
	public void testGetPosition() throws Exception {
		User testSubject;
		String result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.getPosition();
	}

	@MethodRef(name = "setPosition", signature = "(QString;)V")
	@Test
	public void testSetPosition() throws Exception {
		User testSubject;
		String position = "";

		// default test
		testSubject = createTestSubject();
		testSubject.setPosition(position);
	}

	@MethodRef(name = "toString", signature = "()QString;")
	@Test
	public void testToString() throws Exception {
		User testSubject;
		String result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.toString();
	}
}