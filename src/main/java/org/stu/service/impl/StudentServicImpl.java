package org.stu.service.impl;

import org.stu.service.StudentService;

import com.alibaba.dubbo.config.annotation.Service;
@Service
public class StudentServicImpl implements StudentService {

	public String server(String name) {
		return "server:"+name;
	}

}
