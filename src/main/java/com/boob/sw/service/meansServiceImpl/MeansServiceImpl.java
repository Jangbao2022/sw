package com.boob.sw.service.meansServiceImpl;

import com.boob.sw.dto.PagesDto;
import com.boob.sw.mapper.MusicMapper;
import com.boob.sw.mapper.PhotoMapper;
import com.boob.sw.model.Music;
import com.boob.sw.model.MusicExample;
import com.boob.sw.model.Photo;
import com.boob.sw.model.PhotoExample;
import com.boob.sw.service.MeansServiceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MeansServiceImpl implements MeansServiceDao {

    @Autowired
    private MusicMapper musicMapper;

    @Autowired
    private PhotoMapper photoMapper;

    @Override
    public PagesDto<Music> getAllMusic(Integer page) {
        PagesDto musicDto = new PagesDto();
        List<Music> musics = musicMapper.selectByExample(new MusicExample());
        musicDto.setElements(musics);
        return musicDto;
    }

    @Override
    public PagesDto<Photo> getAllPhoto(Integer page) {
        PagesDto photoDto = new PagesDto();
        List<Photo> photos = photoMapper.selectByExample(new PhotoExample());
        photoDto.setElements(photos);
        return photoDto;
    }
}
