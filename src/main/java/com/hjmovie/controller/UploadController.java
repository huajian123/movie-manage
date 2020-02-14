package com.hjmovie.controller;


import com.hjmovie.common.base.Result;
import com.hjmovie.manager.upload.UploadManager;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;

/**
 * 类功能描述:　BasicController
 *
 * @author Eternal
 * @date 2019-56-15 14:56
 */
@RestController
public class UploadController {

    @Resource
    UploadManager uploadManager;

    @PostMapping(value = "upload")
    public Result upload(@RequestParam("file") MultipartFile file) {
        String url = uploadManager.uploadPicture(file);
        return Result.success(url);
    }

}
