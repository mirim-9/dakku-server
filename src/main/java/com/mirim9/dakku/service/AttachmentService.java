package com.mirim9.dakku.service;

import com.mirim9.dakku.mapper.AttachmentMapper;
import com.mirim9.dakku.repository.AttachmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AttachmentService {
    private final AttachmentRepository attachmentRepository;
    private final AttachmentMapper attachmentMapper;
}
