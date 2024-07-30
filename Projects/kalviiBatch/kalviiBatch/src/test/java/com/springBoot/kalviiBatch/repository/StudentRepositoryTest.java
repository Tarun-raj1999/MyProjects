package com.springBoot.kalviiBatch.repository;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.springBoot.kalviiBatch.entity.StudentDetails;

import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;


@SpringBootTest
class StudentRepositoryTest {
	
	@Autowired
 private StudentRepository sr;
	@Test
	void preDefineInsertProcess() 
	{
		   StudentDetails sc=new StudentDetails();
	         sc.setAge(30);
	         sc.setGender("male");
	         sc.setName("kumar");
	         sc.setId(2);
		   
	         sr.save(sc);
	}
	
	@Test
	void preDefineUpdateProcess() 
	{
		   StudentDetails sc=new StudentDetails();
	         sc.setAge(30);
	         sc.setGender("male");
	         sc.setName("kum");
	         sc.setId(2);
		   
	         sr.save(sc);
	}

	@Test
	void preDefinedReadProcess()
	{
	        java.util.Optional<StudentDetails> sc=sr.findById(2);
		
	} 
	
	@Test
	void preDefinedDeleteProcess()
	{
		sr.deleteById(2);
	}
	
	@Test
	void userDefinedSelectProcess()
	{
		StudentDetails sc=sr.getStudentDetailsById(1);
		System.out.println(sc);
	}
	
	@Test
	void userDefinedCreateProcess()
	{
		int i=sr.createStudentDetails(25, "male","ku");
		System.out.println(i);
		if(i==1)
		{
			System.out.println("Created");
		}
	}
	
	@Test
	void userDefinedUpdateProcess()
	{
		int i=sr.updateStudentDetailsById(30, "male", "Tarun",4);
	  System.out.println(i);
	  if(i==1)
	  {
		  System.out.println("updated");
	  }
	  else
	  {
		  System.out.println("user not found");
	  }
	}
	
	@Test
	void userDefinedDeleteProcess()
	{
		int i=sr.deleteStudentDetailsById(4);
		System.out.println(i);
		if(i==1)
		{
			System.out.println("deleted");
		}
		else
		{
			System.out.println("user not found");
		}
	}
}
