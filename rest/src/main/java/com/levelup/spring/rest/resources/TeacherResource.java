package com.levelup.spring.rest.resources;

import com.levelup.spring.model.Teacher;
import com.levelup.spring.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;


import javax.servlet.ServletContext;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import java.util.List;


/**
 * Created by SMULL on 3/31/2015.
 */

@Path("/teacher")
@Component
public class TeacherResource {


    @Autowired
    TeacherService teacherService;


//    @Context
//    ServletContext context;
//
//
//    private void initContext(){
//        if (teacherService == null) {
//            WebApplicationContext applicationContext = WebApplicationContextUtils.getWebApplicationContext(context);
//            teacherService = (TeacherService) applicationContext.getBean("teacherService");
//        }
//    }


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Teacher> getAllTeachers() {
        //initContext();
        List<Teacher> teachers = teacherService.getAllTeachers();
        return teachers;
    }

    @Path("/get/{teacherId}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Teacher getTeacherById(@PathParam("teacherId") Long teacherId) {
        //initContext();
        Teacher teacher = teacherService.getTeacherById(teacherId);
        return teacher;
    }

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Teacher createTeacher(@QueryParam("id") Long id,
                                 @QueryParam("firstName") String firtsName,
                                 @QueryParam("lastName") String lastName){

        Teacher teacher = new Teacher();
        teacher.setId(id);
        teacher.setFirstName(firtsName);
        teacher.setLastName(lastName);
        return teacher;
    }

    @Path("/delete/{teacherId}")
    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    public Teacher deleteTeacherById(@PathParam("teacherId") Long teacherId){
        return teacherService.deleteTeacherById(teacherId);
    }


}
