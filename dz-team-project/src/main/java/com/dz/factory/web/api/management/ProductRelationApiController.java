package com.dz.factory.web.api.management;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.dz.factory.domain.management.ProductRelation;
import com.dz.factory.service.management.ProductRelationService;
import com.dz.factory.web.dto.CMRespDto;
import com.dz.factory.web.dto.management.ProductRelationDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class ProductRelationApiController {

	private final ProductRelationService productRelationService; 
	
	@PostMapping("/product/add")
	public ResponseEntity<?> productAdd(@RequestBody ProductRelationDto dto){
		System.out.println(dto.getProductId());
		for(ProductRelation component : dto.getComponents()) {
			System.out.println(component.toString());
		}
		productRelationService.productRelationAdd(dto);
		return new ResponseEntity<>(new CMRespDto<>(1,"성공",dto),HttpStatus.OK);
	}
	
	
}
