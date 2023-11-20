package com.valtech.training.invoicespringboot.components;

public interface AddressDAO {
	void createAddress(Address address);

	long count();

	void deleteAddress(int id);

	void updateAddress(Address addr);

	Address getAddress(int id);
}
