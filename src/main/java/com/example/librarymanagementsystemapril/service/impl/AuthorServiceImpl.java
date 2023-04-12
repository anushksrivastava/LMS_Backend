package com.example.librarymanagementsystemapril.service.impl;

import com.example.librarymanagementsystemapril.entity.Author;
import com.example.librarymanagementsystemapril.repository.AuthorRepository;
import com.example.librarymanagementsystemapril.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    AuthorRepository authorRepository;

    @Override
    public String addAuthor(Author author) {

        authorRepository.save(author);
        return "Author added";
    }
}
