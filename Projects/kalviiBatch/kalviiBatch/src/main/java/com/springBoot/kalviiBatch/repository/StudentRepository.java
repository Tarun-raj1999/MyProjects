package com.springBoot.kalviiBatch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.springBoot.kalviiBatch.entity.StudentDetails;

import jakarta.transaction.Transactional;



public interface StudentRepository extends JpaRepository<StudentDetails,Integer>
{
       @Query(value="select * from student_details where id=?",nativeQuery=true)
	  StudentDetails getStudentDetailsById(int id);
	   
       @Transactional
       @Modifying
       @Query(value="insert into student_details value(id,?,?,?)",nativeQuery=true)
	int createStudentDetails(int age,String gender,String name);

       @Transactional
       @Modifying
       @Query(value="update  student_details set age?,gender=?,name=? where id=?",nativeQuery=true)
       int updateStudentDetailsById(int age,String gender,String name,int id);
       
       @Transactional
       @Modifying
       @Query(value="delete from student_details where id=?",nativeQuery=true)
       int deleteStudentDetailsById(int id);

}
