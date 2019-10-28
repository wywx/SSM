package com.jjzy.controller;
import com.jjzy.common.Result;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import java.io.File;
import java.io.IOException;
import java.util.UUID;
/**
 * @Author wj
 * @Date 2019/10/28 20:37
 * Version 1.0
 * 文件上传接口
 */
@RestController
public class UploadFiles {
      @PostMapping("/upload")
      public Result uploadFilesUtils(MultipartFile upload) throws IOException {
            String path = "D:\\upload";
            // 判断，该路径是否存在
            File file = new File(path);
            if(!file.exists()){
                  // 创建该文件夹
                  file.mkdirs();
            }

            // 获取上传文件的名称
            String filename = upload.getOriginalFilename();
            // 把文件的名称设置唯一值，uuid
            String uuid = UUID.randomUUID().toString().replace("-", "");
            filename = uuid+"_"+filename;
            // 完成文件上传
            upload.transferTo(new File(path,filename));
            return new Result("上传成功");
      }
}
