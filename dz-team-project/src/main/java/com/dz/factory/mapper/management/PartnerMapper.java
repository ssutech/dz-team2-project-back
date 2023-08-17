package com.dz.factory.mapper.management;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.dz.factory.domain.management.Partner;

@Mapper
public interface PartnerMapper {

	void insertPartner(Partner partner);

	ArrayList<Partner> seletAllPartner();

	void deletePartner(int id);

}