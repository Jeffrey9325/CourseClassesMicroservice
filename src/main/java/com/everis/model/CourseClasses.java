package com.everis.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "courseclasses")
@JsonPropertyOrder({"id", "fullName", "gender",
    "dateofBirth", "typeDocument", "documentNumber"})
public class CourseClasses implements Serializable {

	private static final long serialVersionUID = -7582893407136072654L;
  /**
   * id.
   */
  @Id
   private String id;
  /**
   * Course Identification.
   */
  @NotEmpty(message = "should not be empty")
  private String idCourse;
  /**
   * Teacher Identification.
   */
  @NotEmpty(message = "should not be empty")
  private String idTeacher;
  /**
   * Start of classes.
   */
  @JsonFormat(pattern = "yyyy-MM-dd", shape = Shape.STRING)
  @NotNull
  private Date startofclasses;
  /**
   * End of classes.
   */
  @JsonFormat(pattern = "yyyy-MM-dd", shape = Shape.STRING)
  @NotNull
  private Date endofclasses;
  /**
   * Student Identification.
   */
  @NotEmpty(message = "should not be empty")
  private String idStudent;
  /**
   * Parents Identification.
   */
  @NotEmpty(message = "should not be empty")
  private String idParents;
    
}