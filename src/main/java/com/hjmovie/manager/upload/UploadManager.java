package com.hjmovie.manager.upload;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.UUID;

/**
 * 类功能描述:　fbk
 *
 * @author Eternal
 * @date 2019年11月9日13:48:27
 */
@Component
public class UploadManager {

    @Value("${spring.servlet.multipart.location}")
    private String picturePath;

    @Value("${server.port}")
    private String port;


    @SuppressWarnings("all")
    public String uploadPicture(MultipartFile picture) {

        //获取图片类型
        String exName = picture.getOriginalFilename().substring(picture.getOriginalFilename().lastIndexOf("."));
        //图片重命名
        String fileName = UUID.randomUUID().toString().replaceAll("-", "") + exName;

        File file = new File(picturePath+'/' + fileName);
        System.out.println(fileName);
        System.out.println(picturePath+'/' + fileName);
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }

        try {
            picture.transferTo(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        InetAddress localHost = null;
        try {
            localHost = Inet4Address.getLocalHost();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        String ip = localHost.getHostAddress();
        System.out.println("http://" + ip + ":" + port + "/" + fileName);
        return "http://" + ip + ":" + port + "/img/" + fileName;
    }
}
