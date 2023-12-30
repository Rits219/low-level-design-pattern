package proxyDesignPattern;

public class EmployeeDaoImpl implements EmployeeDao {
    @Override
    public void create(String client) {
        System.out.println("employee dao object created");
    }

    @Override
    public void delete(String client) {
        System.out.println("employee dao object deleted");
    }

    @Override
    public void get(String client) {
        System.out.println("fetched employee dao from db");
    }
}
