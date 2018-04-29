# projection-demo

small Demo to show how Spring Jpa Projections work.

run `DemoApplication`


	public interface PersonRepository  extends CrudRepository<Person, Long> {

	  @RestResource(path="name", rel="by-name-contains")
	  Page<Person> findByNameContains(@Param("name") String name, Pageable page);

	  @RestResource(path="surname", rel="by-surname-contains")
	  Page<Person> findBySurnameContains(@Param("name") String name, Pageable page);

	  @RestResource(path="nickname", rel="by-nickname-contains")
	  Page<Person> findByNicknameContains(@Param("name") String name, Pageable page);

	}


although each method returns a page of type **Person**, using _spring-boot-starter-data-rest_ all projections are available!

have a look: _here we call **findByNicknameContains(...)** _

 - no projection: [persons/search/nickname?name=r_](http://localhost:8080/persons/search/nickname?name=r)

 - fullname-projection: [persons/search/nickname?name=r&**projection=fullname**](http://localhost:8080/persons/search/nickname?name=r&projection=fullname)
 
 - nickname-projection: [persons/search/nickname?name=r&**projection=nickname**](http://localhost:8080/persons/search/nickname?name=r&projection=nickname)
 
 - surname-projection: [persons/search/nickname?name=r&**projection=surname**](http://localhost:8080/persons/search/nickname?name=r&projection=surname)
