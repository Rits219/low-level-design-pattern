package DesignPattern.proxyDesignPattern;

public class ProxyClient {
    public static void main(String[] args) {
        EmployeeDao employeeDaoProxy = new EmployeeDaoProxyImpl(new EmployeeDaoImpl());
        employeeDaoProxy.create("ADMIN");
    }
}
