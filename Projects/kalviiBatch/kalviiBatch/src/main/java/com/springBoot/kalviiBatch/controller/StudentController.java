package com.springBoot.kalviiBatch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springBoot.kalviiBatch.entity.StudentDetails;
import com.springBoot.kalviiBatch.repository.StudentRepository;

@CrossOrigin("*")
@RequestMapping("/studentController")
@RestController
public class StudentController 
{ 
	@Autowired
	private StudentRepository sr;
	@PostMapping("/insertProcess")
 ResponseEntity< StudentDetails>preDefinedCreateProcess(@RequestBody StudentDetails s)
   {
	  StudentDetails sc=new StudentDetails();
	   sc.setAge(s.getAge());
       sc.setGender(s.getGender());
       sc.setName(s.getName());
	   
       sr.save(sc);
       return new ResponseEntity<StudentDetails>(sc,HttpStatus.CREATED);
   }
	
	@PostMapping("/insert")
	
	ResponseEntity<Integer> userDefinedCreateProcess(@RequestParam("sno") int age,@RequestParam String name,@RequestParam String gender)
	{   
		int i=sr.createStudentDetails(age, gender, name);
		if(i==1)
		{
			System.out.println("created");
		}
		return new ResponseEntity<Integer>(i,HttpStatus.CREATED);
	}
	
	@GetMapping("/read")
	ResponseEntity<StudentDetails> userDefinedReadProcess(@RequestParam int id)
	{
		System.out.println(id);
		StudentDetails sc=sr.getStudentDetailsById(id);
		System.out.println(sc);
		return new ResponseEntity<StudentDetails>(sc,HttpStatus.FOUND);
	}
	
	@PutMapping("/updateProcess")
	ResponseEntity<StudentDetails> preDefinedupdateProcess(@RequestBody StudentDetails s)
	{
		
		 StudentDetails sc=new StudentDetails();
         sc.setAge(s.getAge());
         sc.setGender(s.getGender());
         sc.setName(s.getName());
         sc.setId(s.getId());
	   
         sr.save(sc);
         return new ResponseEntity<StudentDetails>(sc,HttpStatus.CREATED);
	}
	
	@PutMapping("/update")
	ResponseEntity<Integer> userDefinedupdateProcess(@RequestParam("sno") int id,@RequestParam String name,@RequestParam String gender,@RequestParam int age )
	{
		System.out.println(id+" "+name+" "+age+" "+gender);
		int i=sr.updateStudentDetailsById(age, gender, name,id);
		  System.out.println(i);
		  if(i==1)
		  {
			  System.out.println("updated");
		  }
		  else
		  {
			  System.out.println("user not found");
		  }
		  return new ResponseEntity<Integer>(i,HttpStatus.CREATED);
	}
	     
	    @DeleteMapping("/deleteProcess/{sno}")
       ResponseEntity<String> preDefineddeleteProcess(@PathVariable("sno") int id )
         {
	    	System.out.println(id);
        		sr.deleteById(1);
        		return new ResponseEntity<String>("Deleted",HttpStatus.OK);
        		
         }
	    
	    
	    @DeleteMapping("delete/{sno}")
	    ResponseEntity<Integer> userDefineddeleteProcess(@PathVariable("sno") int id)
	    {
			int i=sr.deleteStudentDetailsById(id);
			System.out.println(i);
			if(i==1)
			{
				System.out.println("deleted");
			}
			else
			{
				System.out.println("user not found");
			
	    }
			return new ResponseEntity<Integer>(i,HttpStatus.OK);
	    }
	
}
	    



