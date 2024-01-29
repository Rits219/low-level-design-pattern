package DesignPattern.proxyDesignPattern;

public interface EmployeeDao {
    void create(String client);
    void delete(String client);
    void get(String client);
}
