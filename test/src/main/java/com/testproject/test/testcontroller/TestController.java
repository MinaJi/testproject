package com.testproject.test.testcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    // https://blog.jetbrains.com/ko/2020/03/11/top-15-intellij-idea-shortcuts_ko/ 인텔리제이 단축기 모음
    // 밑의 주소 입력시 hello world 가 콘솔에 출력 되는지 확인 해주세요. http://localhost:8080/test/hello
    @GetMapping("/test/hello")
    public void hello() {
        System.out.println("Hello World");
    }
}
