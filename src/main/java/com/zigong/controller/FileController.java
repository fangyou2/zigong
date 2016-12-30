package com.zigong.controller;

import com.zigong.model.File;
import com.zigong.model.Mail;
import com.zigong.model.User;
import com.zigong.service.FileService;
import com.zigong.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by Administrator on 2016/12/27.
 */
@RestController
@RequestMapping("/file")
public class FileController {
    @Autowired
    private FileService fileService;

    @RequestMapping(value = "/delete/{id}")
    @ResponseBody
    public boolean deleteFile(@PathVariable("id") int id) {
        return fileService.deleteFile(id);
    }

    /**
     * 文件上传
     *
     * @param
     * @return
     */
    @RequestMapping(value = "/add")
    @ResponseBody
    public boolean upload(@RequestParam MultipartFile[] files) {
        boolean result = false;
        for (int i = 0; i < files.length; i++) {
            MultipartFile file = files[i];
            if (file != null) {
                String path = "d:/zigong/" + file.getOriginalFilename();
                try {
                    file.transferTo(new java.io.File(path));

                    result = fileService.addFile(new File(null, path, null));
                } catch (IOException e) {
                    e.printStackTrace();
                    return false;
                }
            }
        }
        return result;
    }
}
