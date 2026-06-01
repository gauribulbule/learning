package com.cloningconcept;

class Employee implements Cloneable {
    int id;
    Address address;

    Employee(int id, Address address) {
        this.id = id;
        this.address = address;
    }
    
    protected Object clone() throws CloneNotSupportedException {
        Employee copy = (Employee) super.clone();
        copy.address = new Address(this.address.city);
        return copy;
    }

	@Override
	public String toString() {
		return "Employee [id=" + id + ", address=" + address + "]";
	}
    

}
