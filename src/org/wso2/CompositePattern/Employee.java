package org.wso2.CompositePattern;

/**
 * Created by wso2 on 7/15/16.
 */
public interface Employee {

    public int getId();
    public String getName();
    public double getSalary();
    public void print();
    public void add(Employee employee);
    public void remove(Employee employee);
    public Employee getChild(int i);

}
