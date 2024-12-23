package com.example.samuraitravel.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.samuraitravel.entity.House;

public interface HouseRepository extends JpaRepository<House,Integer>{
	public Page<House> findByNameLike(String keyword,Pageable pageable);
	public Page<House> findByNameLikeOrAddressLikeOrderByCreatedAtDesc(String nameKeyword,String addressKeyword,Pageable pageable);
	public Page<House> findByAddressLikeOrderByCreatedAtDesc();
	public Page<House> findByAddressLikeOrderByPriceAsc(String area,Pageable pageable);
	public Page<House> findByPriceLessThanEqualOrderByCreatedAtDesc(Integer price,Pageable pageable);
	public Page<House> findByPriceLessThanEqualOrderByPriceAsc(Integer price,Pageable pageable);
	public Page<House> findAllByOderByCreatedAtDesc(Pageable pageable);
	public Page<House> findAllByOrderByPriceAsc(Pageable pageable);
	public List<House> findTop10ByOrderByCreatedAtDesc();
}
