package com.yantur.myapplication.presenter;


import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;

import com.yantur.myapplication.domain.NoteUseCase;

public class NoteViewModelFactory implements ViewModelProvider.Factory {
	private NoteUseCase noteUseCase;

	public NoteViewModelFactory(NoteUseCase noteUseCase) {
		this.noteUseCase = noteUseCase;
	}

	@NonNull
	@Override
	public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
		if (modelClass.isAssignableFrom(NoteViewModel.class)) {
			return (T) new NoteViewModel(noteUseCase);
		}
		throw new IllegalArgumentException("Unknown ViewModel class");
	}
}
