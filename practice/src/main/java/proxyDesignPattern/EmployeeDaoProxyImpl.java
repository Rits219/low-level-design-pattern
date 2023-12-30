package proxyDesignPattern;

import java.util.Objects;

public class EmployeeDaoProxyImpl implements EmployeeDao {
    EmployeeDaoImpl employeeDaoImplObj;

    public EmployeeDaoProxyImpl(EmployeeDaoImpl employeeDaoImplObj) {
        this.employeeDaoImplObj = employeeDaoImplObj;
    }

    @Override
    public void create(String client) {
        if (Objects.equals(client, "ADMIN")) {
            employeeDaoImplObj.create(client);
        } else {
            System.out.println("permission denied");
        }
    }

    @Override
    public void delete(String client) {
        if (Objects.equals(client, "ADMIN")) {
            employeeDaoImplObj.delete(client);
        } else {
            System.out.println("permission denied");
        }
    }

    @Override
    public void get(String client) {
        if (Objects.equals(client, "ADMIN") || Objects.equals(client, "USER")) {
            employeeDaoImplObj.get(client);
        } else {
            System.out.println("permission denied");
        }
    }
}
