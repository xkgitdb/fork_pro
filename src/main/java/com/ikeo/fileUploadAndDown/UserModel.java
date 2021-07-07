package com.ikeo.fileUploadAndDown;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserModel implements Serializable {
	private static final long serialVersionUID = 1L;

	private String username;
	// 对应上传的headPortrait，类型为MultipartFile，上传文件会自动绑定到image属性当中
	private MultipartFile headPortrait;
}
