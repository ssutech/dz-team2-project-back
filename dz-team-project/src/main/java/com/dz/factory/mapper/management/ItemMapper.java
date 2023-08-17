package com.dz.factory.mapper.management;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.dz.factory.domain.management.Item;

@Mapper
public interface ItemMapper {

	ArrayList<Item> selAllItem();

	void insertItem(Item item);

	void deleteItem(int id);
}