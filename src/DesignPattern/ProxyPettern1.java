package DesignPattern;

interface DatabaseExecutor {
	void executeDatabase(String query) throws Exception;
}

class DatabaseExecutorImpl implements DatabaseExecutor {

	@Override
	public void executeDatabase(String query) throws Exception {
		System.out.println("Going to Execute Query" + query);

	}
}

class DatabaseExecutorProxy implements DatabaseExecutor {

	boolean ifAdmin;
	DatabaseExecutorImpl dbExecutor;

	DatabaseExecutorProxy(String name, String password) {
		if (name == "admin" && password == "admin") {
			ifAdmin = true;
			dbExecutor = new DatabaseExecutorImpl();
		}
	}

	@Override
	public void executeDatabase(String query) throws Exception {
		if (ifAdmin) {
			dbExecutor.executeDatabase(query);
		} else {
			if (query.equals("DELETE")) {
				throw new Exception("Delete not allowed for non admin user");
			} else {
				dbExecutor.executeDatabase(query);
			}
		}
	}

}

public class ProxyPettern1 {

	public static void main(String[] args) throws Exception{
		DatabaseExecutor db=new DatabaseExecutorProxy("admin", "admin");
		db.executeDatabase("DELETE");
		DatabaseExecutor nonadmindb=new DatabaseExecutorProxy("admin1", "admin");
		nonadmindb.executeDatabase("DELETE");

	}

}
