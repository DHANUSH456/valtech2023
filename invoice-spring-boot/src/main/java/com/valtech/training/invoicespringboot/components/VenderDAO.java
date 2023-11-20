package com.valtech.training.invoicespringboot.components;

public interface VenderDAO {
	void createVender(Venders vender);

	long count();

	void deleteVender(int id);

	void updateVender(Venders vender);

	Venders getVender(int id);
}

