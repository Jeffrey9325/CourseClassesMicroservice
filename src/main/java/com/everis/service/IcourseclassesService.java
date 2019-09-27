package com.everis.service;

import com.everis.model.CourseClasses;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
/**
 * IstudentsService interface.
 * @author jeffrey
 * @version v1.0
 */

public interface IcourseclassesService {
  /**
   * create record courseclasses document.
   * @param courseclasses courseclasses
   * @return
   */
  
  Mono<CourseClasses> createCourseClasses(CourseClasses courseclasses);
  /**
   * show all courseclasses of courseclasses document.
   * @return
   */
  
  Flux<CourseClasses> allCourseClasses();
  /**
   * modify record courseclasses document.
   * @param courseclasses courseclasses
   * @return
   */
  
  Mono<CourseClasses> modifyCourseClasses(CourseClasses courseclasses);
  /**
   * delete record of courseclasses document.
   * @param courseclasses courseclasses
   * @return
   */
  
  Mono<Void> deleteCourseClasses(CourseClasses courseclasses);
  /**
   * find by id courseclasses document.
   * @param idCourseClasses identification
   * @return
   */
  
  Mono<CourseClasses> findbyId(String idCourseClasses);
  
}