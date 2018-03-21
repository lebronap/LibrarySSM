package com.test.web.controller;

import com.test.biz.UserService;
import com.test.domain.po.User;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    // 请求映射的窄化
    @RequestMapping(value = "/login123", method = RequestMethod.GET)
    public String toLogin() {
        return "login";
    }

    @RequestMapping(value = "/login123", method = RequestMethod.POST)
    public String login(HttpServletRequest request, HttpServletResponse response, User user
//            , @RequestParam("file")MultipartFile file) throws IOException {//, @RequestParam("usn") String usn, @RequestParam("pwd") String pwd ){
            , @RequestParam("file") MultipartFile[] files) throws IOException {
        // 控制器一般执行的功能步骤s
        /*
            1 - 收集参数(request\会话容器)
                1 = request.getP....
                2 = 借助@RequestParam("请求参数的名字"), 获取请求参数
                3 = 类似"ModelDriven", 前提： 表单域名字和实体类属性的名字一致
            2 - 调用业务对象方法实现业务逻辑
                返回值：
                    boolean
                    Data
            3 - 绑定数据到Model
            4 - 根据返回的boolean或者功能需求， 完成跳转
                通过设置View中ViewName(String)参数实现
         */
        boolean result = userService.isValidate(user.getUsn(), user.getPwd());
        //boolean result = userService.isValidate(usn, pwd);
        String viewName = "redirect:/user/login";
        if (result)
            viewName = "redirect:/user/list";
        // 开始文件上传
        /*
            1. 获取源文件的相关信息
            2. 获取(待)目标文件确定位置和名称
            3. 完成io上传
         */
        // 1. 获取输入流
        //InputStream is = file.getInputStream();
        // 2. 声明|确认上传文件的名称和位置
        String destPath = "upload";
        String realPath = request.getServletContext().getRealPath(destPath);
        File realPathFoler = new File(realPath);
        if (!realPathFoler.exists())
            realPathFoler.mkdirs();
//        File destFile = new File(realPathFoler, file.getOriginalFilename());
//        file.transferTo(destFile);
        // 完成多文件的上传
        if (files != null && files.length != 0) {
            for (MultipartFile file : files) {
                if (file != null && file.getSize() != 0) {
                    String filename = file.getOriginalFilename();
                    if (filename != null && filename.length() != 0) {
                        String serverFilename = System.currentTimeMillis() + "";
                        String serverFilenameExt = filename.substring(filename.lastIndexOf("."), filename.length());
                        File serverFile = new File(
                                realPathFoler.getAbsolutePath() + File.separator
                                        + (serverFilename + serverFilenameExt));
                        //file.transferTo(serverFile);
                        FileUtils.copyToFile(file.getInputStream(), serverFile);
                    }
                }
            }

        }

//        FileOutputStream os = new FileOutputStream(destFile);
//        byte[] buffer = new byte[1024];
//        int len = 0;
//        while ( (len = is.read(buffer)) != -1 ){
//            os.write(buffer, 0, len);
//        }
//        is.close(); os.close();


        return viewName;
    }

    @RequestMapping(value = "/list123", method = RequestMethod.GET)
    public ModelAndView list() {
        // 获取所有的用户， 放入model ，并跳转list.jsp
        List<User> users = userService.findAll();
        ModelAndView mv = new ModelAndView();
        String viewName = "list";
        mv.setViewName(viewName);

        Map<String, Object> model = new HashMap<>();
        model.put("users", users);
        mv.addAllObjects(model);
//        mv.addObject("users", users);
//        mv.addObject(users);
        return mv;
    }


    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
