package com.example.roomwordsample;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class WordViewModel extends AndroidViewModel {
    private WordViewModel mRepository;
    private final LiveData<List<Word>> mAllWords;

    public WordViewModel (Application application) {
        super(application);
        mRepository = new WordViewModel(application);
        mAllWords = mRepository.mAllWords;
    }

    LiveData<List<Word>> getmAllWords() { return mAllWords;}

    public void insert(Word word) {
    }
}
