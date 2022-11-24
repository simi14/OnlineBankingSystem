package com.project.utils;

import java.io.File;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;

import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.PutObjectRequest;

public class BaseMethods {

	static String link = "";

	//update keys and bucket name accordingly
	final static String accesskey = "------------";
	final static String secretkey = "------------------------";
	final static String bucketname = "-------------";

	private static AmazonS3Client s3 = new AmazonS3Client(new BasicAWSCredentials(accesskey, secretkey));
	public static String getUser(){
		
		User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String userName = user.getUsername();
		return userName;
	}
	public static String uploadFile(String file1)
	{
		System.out.println("file1");
		File file = new File(file1);
		System.out.println("file2");
		String key = "forms/" + file.getName();
		System.out.println("----file uploading---");
		PutObjectRequest req=new PutObjectRequest(bucketname,key,file);
		req.setCannedAcl(CannedAccessControlList.PublicRead);
		s3.putObject(req);
		System.out.println("----File uploaded----");

		System.out.println("\n\n----Get Object---");

		link = s3.getUrl(bucketname, key).toString();
		System.out.println("S3 Link: " + link);
		return link;
	}
}
