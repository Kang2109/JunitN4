package Dao;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(

{ SignUpDAOTest.class, WaterDAOTest.class, LoginDAOTest.class, ClientDAOTest.class, BillDAOTest.class,
		UserDAOTest.class })
public class TestSuite { // nothing
}
