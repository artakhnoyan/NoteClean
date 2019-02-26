package com.yantur.myapplication.presenter;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;

import com.yantur.myapplication.domain.Note;
import com.yantur.myapplication.domain.NoteUseCase;

import java.util.List;

public class NoteViewModel extends ViewModel {
	private final NoteUseCase noteUseCase;
	private MutableLiveData<Long> createdNote = new MutableLiveData<>();
	private MutableLiveData<Note> getNote = new MutableLiveData<>();
	private MutableLiveData<List<Note>> getAllNotes = new MutableLiveData<>();

	public NoteViewModel(NoteUseCase noteUseCase) {
		this.noteUseCase = noteUseCase;
	}

	public void insertNote(Note note) {
		noteUseCase.insertNote(note, createdNote);
	}

	public void getNote(long id) {
		noteUseCase.getNote(id, getNote);
	}

	public void getAllNotes() {
		noteUseCase.getNotes(getAllNotes);
	}

	public LiveData<Long> noteCreation() {
		return createdNote;
	}

	public LiveData<Note> note() {
		return getNote;
	}

	public LiveData<List<Note>> notes() {
		return getAllNotes;
	}
}
