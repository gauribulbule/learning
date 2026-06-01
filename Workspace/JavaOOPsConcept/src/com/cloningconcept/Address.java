package com.cloningconcept;

class Address{
    String city;

    Address(String city) {
        this.city = city;
    }

	@Override
	public String toString() {
		return "Address [city=" + city + "]";
	}
    
}

