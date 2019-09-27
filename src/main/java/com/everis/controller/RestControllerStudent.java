package com.everis.controller;

import com.everis.model.CourseClasses;
import com.everis.service.CourseClassesServiceImpl;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/CourseClasses/v1.0")
public class RestControllerStudent {
	
	private static Logger LOG = LoggerFactory.getLogger(RestControllerStudent.class);
  /**
   * CourseClasses Service Implement.
   */
  @Autowired
  public CourseClassesServiceImpl repository;

  /**
   * create record student document.
   * @param student student
   * @return
   */
  
  @PostMapping("/")
  public Mono<ResponseEntity<CourseClasses>> createCourseClasses(@Valid @RequestBody final CourseClasses courseclasses) {
    return repository.createCourseClasses(courseclasses)
    .then(Mono.just(new ResponseEntity<CourseClasses>(HttpStatus.CREATED)))
    .defaultIfEmpty(new ResponseEntity<>(HttpStatus.NOT_FOUND));
  }
  /**
   * show all record of student document.
   * @return
   */
  
  @GetMapping("/")
  public Flux<CourseClasses> allCourseClasses() {  
    return repository.allCourseClasses();
  }
  /**
   * delete record in student document.
   * @param id identification
   * @return
   */
 
  @DeleteMapping("/{id}")
  public Mono<ResponseEntity<Void>> deleteCourseClasses(@PathVariable final String id) {
    return repository.findbyId(id)
    .flatMap(people ->
    repository.deleteCourseClasses(people)
    .then(Mono.just(new ResponseEntity<Void>(HttpStatus.NO_CONTENT)))  
    )
    .defaultIfEmpty(new ResponseEntity<>(HttpStatus.NOT_FOUND));
  }
   
}
