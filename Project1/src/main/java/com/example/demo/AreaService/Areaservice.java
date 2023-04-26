package com.example.demo.AreaService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.AreaModel.AreaDetails;
import com.example.demo.AreaRepository.Arearepo;

@Service



public class Areaservice {
	@Autowired
	Arearepo repository;
	public String addArea(AreaDetails area)
	{
		repository.save(area);
		return "Added";
	}
	public List<AreaDetails> getArea()
	{
		return repository.findAll();
	}
	public Optional<AreaDetails> getAreaById(int id)
	{
		return repository.findById(id);
	}
	public String updateArea(AreaDetails area)
	{
		repository.save(area);
		return "Updated";
	}
	public void deleteByRequestParam(int id)
	{
		repository.deleteById(id);
	}
}
	

