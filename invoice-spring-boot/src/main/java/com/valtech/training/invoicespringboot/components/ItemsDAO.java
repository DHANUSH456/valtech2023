package com.valtech.training.invoicespringboot.components;

public interface ItemsDAO {
	
	void createItems(Items item);

	long count();

	void deleteItems(int id);

	void updateItem(Items item);

	Items getItems(int id);
}
