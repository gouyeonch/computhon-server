package org.dongguk.camputhon.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.dongguk.camputhon.dto.common.ResponseDto;
import org.dongguk.camputhon.exception.CommonException;
import org.dongguk.camputhon.exception.ErrorCode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("")
public class TestController {
    @GetMapping("/test")
    public ResponseDto<?> test() {
        return ResponseDto.ok("Hello World");
    }

    @GetMapping("/error")
    public ResponseDto<?> error() {
        throw new CommonException(ErrorCode.SERVER_ERROR);
    }
}
