package com.home.logic.impl;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.home.constant.Constant;
import com.home.dao.UserDao;
import com.home.dto.User;
import com.home.logic.UserLogic;

import net.coobird.thumbnailator.Thumbnails;

@Service
public class UserLogicImpl implements UserLogic {

	@Autowired
	UserDao userDao;
	
	@Value("${profile.image}")
	private String profileImageDirectoryPath;

	@Value("${file.upload-dir}")
	private String mediaDirectoryPath;

	@Override
	public List<User> getUsers() {

		List<User> users = userDao.getUsers();

		return users;
	}

	@Override
	public User getUser(int id) {
		// TODO Auto-generated method stub
		return userDao.getUser(id);
	}

	@Override
	public String createUser(User user) {
		// TODO Auto-generated method stub
		return userDao.createUser(user);
	}

	@Override
	public String userLoggedIn(HttpServletRequest request) {
		String userName=request.getParameter("userName");
		String userPassword=request.getParameter("userPassword");
		User user=new User();
		user.setUserName(userName);
		user.setUserPassword(userPassword);
		String status=userDao.userLoggedIn(user);
		return status;
	}

	@Override
	public void showUserProfileImage(String imagePath, String imageType, HttpServletResponse response) {

		try {
			String documentFullPath = mediaDirectoryPath + profileImageDirectoryPath + imagePath;
			if ("profileImage".equalsIgnoreCase(imageType)) {
				sendThumbnailImage(documentFullPath, response);
				 //sendActualImage(documentFullPath, response);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		
	}
	
	private void sendThumbnailImage(String filePath, HttpServletResponse response) {

		try {
			ByteArrayOutputStream imageOutputStream = new ByteArrayOutputStream();

			Thumbnails.of(filePath).size(50, 50).toOutputStream(imageOutputStream);
			ByteArrayInputStream imageByteStream = new ByteArrayInputStream(imageOutputStream.toByteArray());

			try (InputStream inputStream = imageByteStream) {
				response.setContentType(getImageContentType(filePath));
				Calendar cal = Calendar.getInstance();
				cal.add(Calendar.DAY_OF_MONTH, 1);
				response.setDateHeader(Constant.HEADER_EXPIRE, cal.getTimeInMillis());
				IOUtils.copy(inputStream, response.getOutputStream());
			}

		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
	/*
	 * private void sendActualImage(String filePath, boolean isFileEncryptActive,
	 * HttpServletResponse response) { InputStream inputStream = null; try { File
	 * downloadFile = new File(filePath); if (isFileEncryptActive) { InputStream is
	 * = new FileInputStream(downloadFile); byte[] byteArray =
	 * cryptoUtils.decrypt(is, (int) downloadFile.length()); inputStream = new
	 * ByteArrayInputStream(byteArray); } else { inputStream = new
	 * FileInputStream(downloadFile); }
	 * 
	 * response.setContentType(getImageContentType(filePath)); Calendar cal =
	 * Calendar.getInstance(); cal.add(Calendar.DAY_OF_MONTH, 1);
	 * response.setDateHeader(Constants.HEADER_EXPIRE, cal.getTimeInMillis());
	 * IOUtils.copy(inputStream, response.getOutputStream());
	 * 
	 * } catch (Exception ex) { ex.printStackTrace(); } finally { if (inputStream !=
	 * null) { try { inputStream.close(); } catch (IOException ex) {
	 * ex.printStackTrace(); } } } }
	 */
	
	
	private String getImageContentType(String fileName) {
		String contentType = Constant.IMAGE_RESPONSE_PNG_TYPE;
		try {
			fileName = fileName.toLowerCase();
			if (StringUtils.isNotBlank(fileName) && (fileName.contains(Constant.IMAGE_EXTENSION_JPG)
					|| fileName.contains(Constant.IMAGE_EXTENSION_JPEG))) {
				contentType = Constant.IMAGE_RESPONSE_JPEG_TYPE;
			} else if (StringUtils.isNotBlank(fileName) && fileName.contains(Constant.IMAGE_EXTENSION_GIF)) {
				contentType = Constant.IMAGE_RESPONSE_GIF_TYPE;
			} else if (StringUtils.isNotBlank(fileName) && fileName.contains(Constant.IMAGE_EXTENSION_BMP)) {
				contentType = Constant.IMAGE_RESPONSE_BMP_TYPE;
			} else if (StringUtils.isNotBlank(fileName) && fileName.contains(Constant.IMAGE_EXTENSION_TIFF)){
				contentType = Constant.IMAGE_RESPONSE_TIFF_TYPE;
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return contentType;
	}

}
