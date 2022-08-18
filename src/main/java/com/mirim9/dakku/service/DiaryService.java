package com.mirim9.dakku.service;

import com.mirim9.dakku.dto.DiaryDto;
import com.mirim9.dakku.entity.Diary;
import com.mirim9.dakku.mapper.DiaryMapper;
import com.mirim9.dakku.repository.DiaryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DiaryService {
    private final DiaryRepository diaryRepository;
    private final DiaryMapper diaryMapper;

    public List<DiaryDto> findAllDiaries(){
        List<Diary> diary = diaryRepository.findAll();
        return diaryMapper.toDto(diary);
    }
}
