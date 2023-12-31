package com.example.terrainservice.TerrainRepository;

import com.example.terrainservice.Entity.Terrain;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ITerrainRepository extends JpaRepository<Terrain,Long> {
    List<Terrain> findByNomAndType(String nom, String type);

    List<Terrain> findByNom(String nom);

    List<Terrain> findByType(String type);
}