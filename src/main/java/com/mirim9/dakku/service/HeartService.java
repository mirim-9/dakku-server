package com.mirim9.dakku.service;

import com.mirim9.dakku.mapper.HeartMapper;
import com.mirim9.dakku.repository.HeartRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HeartService {
    private final HeartRepository heartRepository;
    private final HeartMapper heartMapper;
}
