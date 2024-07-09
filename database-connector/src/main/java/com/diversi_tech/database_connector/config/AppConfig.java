package com.diversi_tech.database_connector.config;

import com.diversi_tech.database_connector.entity.*;
import com.diversi_tech.database_connector.repositories.interfaces.*;
import com.diversi_tech.database_connector.repositories.repositoryImpl.*;
import com.diversi_tech.database_connector.services.serviceImpl.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.diversi_tech.database_connector.repositories.interfaces", repositoryBaseClass = GenericRepositoryImpl.class)

//@EnableJpaRepositories(basePackages = "com.diversi_tech.database_connector.repositories.interfaces")
@EntityScan(basePackages = "com.diversi_tech.database_connector.entity")
public class AppConfig{

//    private final EntityManagerFactory entityManagerFactory;
//
//    public AppConfig(EntityManagerFactory entityManagerFactory) {
//        this.entityManagerFactory = entityManagerFactory;
//    }
//
//    @Bean
//    public EntityManager entityManager() {
//        return entityManagerFactory.createEntityManager();
//    }
//
//    @Bean
//    public GenericRepositoryImpl<Student, String> studentsRepositoryImpl(EntityManager entityManager) {
//        return new GenericRepositoryImpl(Student.class, entityManager);
//    }
//
//    @Bean
//    public StudentServiceImpl studentService(StudentRepository studentRepository) {
//        return new StudentServiceImpl(studentRepository);
//    }
//
////    @Bean
////    public StudentRepositoryImpl studentRepositoryImpl(EntityManager entityManager) {
////        return new StudentRepositoryImpl(Student.class, entityManager);
////    }
//
//    @Bean
//    public AttendanceRepositoryImpl attendanceRepositoryImpl(EntityManager entityManager) {
//        return new AttendanceRepositoryImpl(Attendance.class, entityManager);
//    }
//
//    @Bean
//    public AttendanceServiceImpl attendanceService(AttendanceRepository attendanceRepositoryImpl) {
//        return new AttendanceServiceImpl(attendanceRepositoryImpl);
//    }
//
//    @Bean
//    public GenericRepositoryImpl<StudentCourse, Integer> studentCourseRepositoryImpl(EntityManager entityManager) {
//        return new GenericRepositoryImpl(StudentCourse.class, entityManager);
//    }
//
//    @Bean
//    public StudentCourseServiceImpl studentCourseService(GenericRepositoryImpl<StudentCourse, Integer> studentCourseRepository) {
//        return new StudentCourseServiceImpl(studentCourseRepository);
//    }
//
//    @Bean
//    public GenericRepositoryImpl<User, String> userRepositoryImpl(EntityManager entityManager) {
//        return new GenericRepositoryImpl(User.class, entityManager);
//    }
//
//    @Bean
//    public UserServiceImpl userService(GenericRepositoryImpl<User, String> userRepository) {
//        return new UserServiceImpl(userRepository);
//    }
//
//    @Bean
//    public GenericRepositoryImpl<Payment, Integer> paymentRepositoryImpl(EntityManager entityManager) {
//        return new GenericRepositoryImpl(Payment.class, entityManager);
//    }
//
//    @Bean
//    public PaymentServiceImpl paymentService(GenericRepositoryImpl<Payment, Integer> paymentService) {
//        return new PaymentServiceImpl(paymentService);
//    }
//
//    @Bean
//    public GenericRepositoryImpl<Course, Integer> courseRepositoryImpl(EntityManager entityManager) {
//        return new GenericRepositoryImpl(Course.class, entityManager);
//    }
//
//    @Bean
//    public CourseServiceImpl courseService(GenericRepositoryImpl<Course, Integer> courseRepository) {
//        return new CourseServiceImpl(courseRepository);
//    }
//
//    @Bean
//    public GenericRepositoryImpl<CommunicationLog, Integer> communicationLogRepositoryImpl(EntityManager entityManager) {
//        return new GenericRepositoryImpl(CommunicationLog.class, entityManager);
//    }
//
//    @Bean
//    public CommunicationLogServiceImpl communicationLogService(GenericRepositoryImpl<CommunicationLog, Integer> communicationLogService) {
//        return new CommunicationLogServiceImpl(communicationLogService);
//    }
//
////    @Bean
////    public ClassRepositoryImpl classRepositoryImpl(EntityManager entityManager) {
////        return new ClassRepositoryImpl(ClassC.class, entityManager);
////    }
//
//    @Bean
//    public ClassServiceImpl classService(ClassRepository c) {
//        return new ClassServiceImpl(c);
//    }
//
////    @Bean
////    public CourseDocumentRepositoryImpl courseDocumentRepositoryImpl(EntityManager entityManager) {
////        return new CourseDocumentRepositoryImpl(CourseDocument.class, entityManager);
////    }
//
//    @Bean
//    public CourseDocumentServiceImpl courseDocumentServiceImpl(CourseDocumentRepositoryImpl classRepository) {
//        return new CourseDocumentServiceImpl(classRepository);
//    }

}
