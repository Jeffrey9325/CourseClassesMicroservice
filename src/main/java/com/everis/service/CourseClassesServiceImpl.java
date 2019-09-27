package com.everis.service;

import com.everis.model.CourseClasses;
import com.everis.repository.ReactiveRepository;

import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
/**
 * StudentServiceImpl class.
 * @author jeffrey
 * @version v1.0
 */

@Service
public class CourseClassesServiceImpl implements IcourseclassesService {
	/**
	   * Reactive Repository.
	   */
	ReactiveRepository repository;
	
	@Override
	public Mono<CourseClasses> createCourseClasses(CourseClasses courseclasses) {
		return repository.save(courseclasses);
	}

	@Override
	public Flux<CourseClasses> allCourseClasses() {
		return repository.findAll();
	}

	@Override
	public Mono<CourseClasses> modifyCourseClasses(CourseClasses courseclasses) {
		return repository.save(courseclasses);
	}

	@Override
	public Mono<Void> deleteCourseClasses(CourseClasses courseclasses) {
		return repository.delete(courseclasses);
	}

	@Override
	public Mono<CourseClasses> findbyId(String idCourseClasses) {
		return repository.findById(idCourseClasses);
	}
  

  
}
