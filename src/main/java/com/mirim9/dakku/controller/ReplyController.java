package com.mirim9.dakku.controller;

import com.mirim9.dakku.service.ReplyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/replies")
@RequiredArgsConstructor
public class ReplyController {
    private final ReplyService replyService;
}
