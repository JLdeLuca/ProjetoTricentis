package br.com.luca.Cucumber;

import br.com.luca.Managers.DriverManager;

public class TestContext {

	private DriverManager driverManager;

	public TestContext() throws Exception {
		driverManager = new DriverManager();
	}

	public DriverManager getDriverManager() {
			return driverManager;
		}
}
