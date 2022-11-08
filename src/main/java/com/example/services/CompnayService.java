package com.example.services;

import com.example.entities.Company;

import java.util.stream.Stream;

public interface CompnayService {
    Stream<Company> getCompanies();
}
