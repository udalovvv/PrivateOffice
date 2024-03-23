package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "course")
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class CourseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @NonNull
    @Column(name = "course_name")
    private String courseName;

    @NonNull
    @Column(name = "course_image")
    private String imageCourse;

    @NonNull
    @Column(name = "is_active")
    private boolean isActive;

    @NonNull
    @Column(name = "tag")
    private String tag;

    @NonNull
    @Column(name = "is_free")
    private boolean isFree;
}
