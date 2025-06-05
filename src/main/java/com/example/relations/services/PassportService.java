package com.example.relations.services;

import com.example.relations.DTO.HobbyDTO;
import com.example.relations.DTO.PassportDTO;
import com.example.relations.entity.Passport;

import java.util.List;

public interface PassportService {
    PassportDTO create(PassportDTO passportDTO);
    PassportDTO findById(Long id);
    List<PassportDTO> getAll();
    PassportDTO update(Long id, PassportDTO passportDTO);
    void delete(Long id);
}
