package com.example.motif_application.ui.transpose;

import androidx.lifecycle.MutableLiveData;

public class placeholder {
    private final MutableLiveData<String> mText;

    public placeholder() {
        mText = new MutableLiveData<>();
        mText.setValue("Main menu page");
    }

    public placeholder(MutableLiveData<String> mText) {
        this.mText = mText;
    }
}
