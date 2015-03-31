package com.levelup.spring.service.impl;

import com.levelup.spring.dao.TeacherRepository;
import com.levelup.spring.model.Teacher;
import com.levelup.spring.service.TeacherService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("teacherService")
public class TeacherServiceImpl implements TeacherService {


    @Resource(name = "teacherRepository")
    private TeacherRepository teacherRepository;

    public TeacherServiceImpl() {
    }

    public TeacherServiceImpl(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public void setTeacherRepository(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public List<Teacher> getAllTeachers() {

        return teacherRepository.getAllTeachers();
    }

    @Override
    public Teacher getTeacherById(Long id) {
        return teacherRepository.getTeacherById(id);
    }

    @Override
    public Teacher deleteTeacherById(Long id) {
        return teacherRepository.deleteTeacherById(id);
    }
}
