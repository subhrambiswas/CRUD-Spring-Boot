package com.example.crudspringboot;


import org.springframework.data.repository.CrudRepository;
//repository that extends CrudRepository


public interface BooksRepository extends CrudRepository<Books, Integer>
{
}