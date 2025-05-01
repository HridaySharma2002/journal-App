package com.hriday.journalApp.cache;

import com.hriday.journalApp.entity.ConfigJournalAppEntity;
import com.hriday.journalApp.repository.ConfigJournalAppRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class AppCache {

    public enum keys{
        WEATHER_API;
    }

    @Autowired
    private ConfigJournalAppRepository configJournalAppRepository;

    public Map<String,String> appCache;

    @PostConstruct
    public void init(){
        appCache=new HashMap<>();
        List<ConfigJournalAppEntity> all=configJournalAppRepository.findAll();
        for(ConfigJournalAppEntity configJournalAppEntity: all){
            appCache.put(configJournalAppEntity.getKey(), configJournalAppEntity.getValue());
        }
    }
}
