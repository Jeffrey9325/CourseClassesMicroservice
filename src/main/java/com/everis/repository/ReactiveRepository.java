package com.everis.repository;

import com.everis.model.CourseClasses;

import java.io.Serializable;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
/**
 * ReactiveRepository interface.
 * @author jeffrey
 * @version v1.0
 */

@Repository
public interface ReactiveRepository extends ReactiveMongoRepository<CourseClasses, Serializable> {
  /**
   * find by course identification courseclasses document.
   * @param idCourse course identification
   * @return
   */

  Flux<CourseClasses> findByIdCourse(String idCourse);
  /**
   * find by courseclasses identification courseclasses document.
   * @param idCourseClasses identification
   * @return
   */
  
  Mono<CourseClasses> findById(String idCourseClasses);
  
  
  
}
