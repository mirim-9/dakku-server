package com.mirim9.dakku.controller;

import com.mirim9.dakku.service.HeartService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/hearts")
@RequiredArgsConstructor
public class HeartController {
    private final HeartService heartService;
}
