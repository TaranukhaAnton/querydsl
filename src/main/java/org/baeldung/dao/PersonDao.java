package org.baeldung.dao;

import org.baeldung.entity.Person;

import java.util.List;
import java.util.Map;

 interface PersonDao {

     Person save(Person person);

     List<Person> findPersonsByFirstnameQueryDSL(String firstname);

     List<Person> findPersonsByFirstnameAndSurnameQueryDSL(String firstname, String surname);

     List<Person> findPersonsByFirstnameInDescendingOrderQueryDSL(String firstname);

     int findMaxAge();

     Map<String, Integer> findMaxAgeByName();

}