package com.yantur.myapplication.domain;

import android.arch.lifecycle.MutableLiveData;

import java.util.List;

public class NoteUseCase extends UseCase {
	private NoteRepository repository;

	public NoteUseCase(NoteRepository repository) {
		this.repository = repository;
	}

	public void insertNote(Note note, MutableLiveData<Long> noteLiveData) {
		execute(() -> noteLiveData.postValue(repository.insertNote(note)));
	}

	public void getNote(long id, MutableLiveData<Note> noteLiveData) {
		execute(() -> noteLiveData.postValue(repository.getNote(id)));
	}

	public void getNotes(MutableLiveData<List<Note>> noteLiveData) {
		execute(() -> noteLiveData.postValue(repository.getAllNotes()));
	}
}
