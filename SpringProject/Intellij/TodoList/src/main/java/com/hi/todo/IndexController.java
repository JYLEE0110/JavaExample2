package com.hi.todo;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log4j2
public class IndexController {
    @RequestMapping("/index")
    public void getIndex(){

        log.info("IndexController...getIndexTest()...");
        // 반환 타입 void 이므로 RequstMapping 뒤에있는 view path ==> /WEB-INF/views/index.jsp
    }

}
