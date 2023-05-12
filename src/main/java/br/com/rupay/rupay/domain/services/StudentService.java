package br.com.rupay.rupay.domain.services;

import br.com.rupay.rupay.domain.repositories.StudentRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    private ModelMapper mapper;
}
