package com.bjsxt.service;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

import com.bjsxt.pojo.Feel;

public interface FeelService {
	Map<String,Object> upload(MultipartFile imgFile) throws IOException;
	
	
	int insFeel(Feel feel,List<String> imgs);
}
